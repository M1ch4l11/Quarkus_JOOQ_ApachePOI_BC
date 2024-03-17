package resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import CustomModels.Filter;
import org.jboss.resteasy.reactive.PartType;
import service.Interfaces.DSLExportService;
import service.Interfaces.ParserService;
import service.Interfaces.ReusableService;
import java.io.*;
import java.util.List;

@RequestScoped
@Path("/export")
@Produces(MediaType.APPLICATION_JSON)
public class ExportResource {
    @Inject
    DSLExportService dslExportService;
    @Inject
    ParserService parserService;

    @GET
    @Path("/{tableName}/columns")
    public String getColumns(@PathParam("tableName") String tableName) {
        return parserService.getJsonAsStringColumns(dslExportService.getAllColumnsName(tableName));
    }

    @PUT
    @Path("/{tableName}/table")
    public String getCustomTable(@PathParam("tableName") String tableName, @PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        List<String> columns = new ObjectMapper().readValue(json, List.class);
        return parserService.getJsonAsString(dslExportService.getCustomTable(columns, tableName));
    }

    @PUT
    @Path("/{tableName}/filtered")
    public String getFilteredTable(@PathParam("tableName") String tableName, @PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        Filter filters = new ObjectMapper().readValue(json, Filter.class);
        return parserService.getJsonAsString(dslExportService.getFilteredTable(filters, tableName));
    }

    @PUT
    @Path("/{tableName}/excel")
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response geExcelTable(@PathParam("tableName") String tableName, @PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException, FileNotFoundException {
        Filter filters = new ObjectMapper().readValue(json, Filter.class);
        InputStream inputStream = new FileInputStream("Main.xlsx");
        if(dslExportService.createExcel(filters, tableName)) {
            return Response.ok(inputStream)
                    .header("Content-Disposition", "attachment; filename=Main")
                    .build();
        }
        return Response.serverError().build();
    }
}
