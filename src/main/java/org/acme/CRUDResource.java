package org.acme;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import generated.market.tables.records.CustomerRecord;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.PartType;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import services.search.SearchService;
import services.search.SearchServiceImpl;

@RequestScoped
@Path("/crud")
@Produces(MediaType.APPLICATION_JSON)
public class CRUDResource {

    @Inject
    DSLContext dsl;

    @Inject
    SearchService service;

    @GET
    @Path("/{tableName}/all")
    public Result<Record> getAll(@PathParam("tableName") String tableName ) {
        System.out.println(new SearchServiceImpl().getTableName(tableName));
        return dsl.select()
                .from("market." + service.getTableName(tableName))
                .fetch();
    }

    @GET
    @Path("/{tableName}/{id}")
    public Result<Record> getById(@PathParam("tableName") String tableName, @PathParam("id") int id){
        return dsl.select()
                .from("market." + service.getTableName(tableName))
                .where(service.findCondition(id, tableName))
                .fetch();
    }

    /*
     * 415 Unsupported Media Type - I found a way to convert JSON to a JOOQ record class,
     * The trouble is, I have created the model class myself, and JSON must be mapped by ObjectMapper :(
     * */
    @POST
    @Path("/customer")
    public int setRow(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        CustomerRecord customerRecord = service.convertToCustomerRecord(new ObjectMapper().readValue(json, models.Customer.class));
        return dsl.insertInto(DSL.table("market."+service.getTableName("customer")))
                .set(customerRecord.field2(), customerRecord.getIdAdress())
                .set(customerRecord.field3(), customerRecord.getFirstname())
                .set(customerRecord.field4(), customerRecord.getLastname())
                .set(customerRecord.field5(), customerRecord.getBirthdate())
                .set(customerRecord.field6(), customerRecord.getEmail())
                .execute();
    }
}
