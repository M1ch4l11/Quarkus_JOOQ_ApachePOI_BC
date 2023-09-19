package org.acme;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import generated.market.tables.Customer;
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
                .where(Customer.CUSTOMER.ID_CUSTOMER.eq(id))
                .fetch();
    }

    /*
     * 415 unsupported media type - I found way to converte json to JOOQ record class,
     * Trouble is, I have created model class by myself :(
     * */
    @POST
    @Path("/customer")
    public int setRow(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        CustomerRecord customerRecord = service.convertToCustomerRecord(new ObjectMapper().readValue(json, org.acme.Customer.class));
        return dsl.insertInto(DSL.table("market."+service.getTableName("customer")))
                .set(customerRecord.field2(), customerRecord.getIdAdress())
                .set(customerRecord.field3(), customerRecord.getFirstname())
                .set(customerRecord.field4(), customerRecord.getLastname())
                .set(customerRecord.field5(), customerRecord.getBirthdate())
                .set(customerRecord.field6(), customerRecord.getEmail())
                .execute();
    }
}
