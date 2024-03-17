package resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import CustomModels.Pagination;
import CustomModels.SearchFilter;
import org.jboss.resteasy.reactive.PartType;
import org.jooq.Name;
import service.Interfaces.DSLControllerService;
import service.Interfaces.DSLSearchService;
import service.Interfaces.ParserService;
import service.Interfaces.ReusableService;

@RequestScoped
@Path("/search")
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {
    @Inject
    DSLSearchService searchService;
    @Inject
    ParserService parserService;

    @Inject
    ReusableService reusableService;

    @Inject
    DSLControllerService dslControllerService;

    // return  pagination object & table rows
    @PUT
    @Path("/{tableName}/bar")
    public String findSameWords(@PathParam("tableName") String tableName, @PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        SearchFilter filters = new ObjectMapper().readValue(json, SearchFilter.class);
        return parserService.getJsonAsStringPagination(searchService.getFilteredTable(filters, tableName), searchService.getFullFilteredTable(filters, tableName));
    }

    // return pagination for all data in selected table
    @GET
    @Path("/{tableName}/pagination")
    public String getPagination(@PathParam("tableName") String tableName) {
        Name tableNaming = reusableService.getTableName(tableName);
        return parserService.getJsonAsStringPaginationSingle(dslControllerService.getAllData(tableNaming));
    }

    // return table rows without pagination, using pagination & filter data
    @POST
    @Path("/{tableName}/pagination/full")
    public String paginationEvent(@PathParam("tableName") String tableName, @PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        Pagination pagination = new ObjectMapper().readValue(json, Pagination.class);
        return parserService.getJsonAsString(searchService.filteredTableEvent( pagination.getSearchFilter() , pagination.getPaginationFilter(),tableName));
    }
}
