package resource.basic;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jooq.Condition;
import org.jooq.Name;
import service.Interfaces.DSLControllerService;
import service.Interfaces.ParserService;
import service.Interfaces.ReusableService;

@RequestScoped
@Path("/main")
@Produces(MediaType.APPLICATION_JSON)
public class ControllerResource {
    @Inject
    ReusableService reusableService;
    @Inject
    ParserService parserService;
    @Inject
    DSLControllerService dslControllerService;

    @GET
    @Path("/{tableName}/all")
    public String getAll(@PathParam("tableName") String tableName ) {
        Name tableNaming = reusableService.getTableName(tableName);
        return parserService.getJsonAsString(dslControllerService.getAllData(tableNaming));
    }

    @GET
    @Path("/{tableName}/table/all")
    public String getAllDataForTable(@PathParam("tableName") String tableName ) {
        Name tableNaming = reusableService.getTableName(tableName);
        return parserService.getJsonAsString(dslControllerService.getAllDataForTable(tableNaming));
    }

    @GET
    @Path("/{tableName}/{id}")
    public String getById(@PathParam("tableName") String tableName, @PathParam("id") int id) {
        Name tableNaming = reusableService.getTableName(tableName);
        Condition conditionWhere = reusableService.findCondition(id, tableName);
        return parserService.getJsonAsString(dslControllerService.getObjectById(tableNaming, conditionWhere));
    }

    @GET
    @Path("/{tableName}/{id}/char")
    public String getByCharId(@PathParam("tableName") String tableName, @PathParam("id") String id) {
        Name tableNaming = reusableService.getTableName(tableName);
        Condition conditionWhere = reusableService.findConditionCharId(id, tableName);
        return parserService.getJsonAsString(dslControllerService.getObjectById(tableNaming, conditionWhere));
    }

    @DELETE
    @Path("/{tableName}/{id}")
    public int deleteById(@PathParam("tableName") String tableName, @PathParam("id") int id) {
        return dslControllerService.deleteObjectById(reusableService.getTableName(tableName), reusableService.findCondition(id, tableName));
    }

    @DELETE
    @Path("/{tableName}/{id}/char")
    public int deleteByCharId(@PathParam("tableName") String tableName, @PathParam("id") String id) {
        return dslControllerService.deleteObjectById(reusableService.getTableName(tableName), reusableService.findConditionCharId(id, tableName));
    }
}
