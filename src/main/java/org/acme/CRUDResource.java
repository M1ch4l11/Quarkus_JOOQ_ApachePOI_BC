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
import org.jooq.impl.DSL;
import services.jooq.JooqService;
import java.util.*;
import java.util.stream.Collectors;

@RequestScoped
@Path("/crud")
@Produces(MediaType.APPLICATION_JSON)
public class CRUDResource {

    @Inject
    DSLContext dsl;

    @Inject
    JooqService service;

    @GET
    @Path("/{tableName}/all")
    public String getAll(@PathParam("tableName") String tableName ) {
        List<Map<String, Object>> result =  dsl.select()
                .from("market." + service.getTableName(tableName))
                .fetch()
                .map( o -> o.intoMap())
                 .stream().collect(Collectors.toList());

        try {
           String json = new ObjectMapper().writeValueAsString(result);
           return json;
        } catch ( JsonProcessingException e) {
            return e.getMessage();
        }
    }

    @GET
    @Path("/{tableName}/{id}")
    public String getById(@PathParam("tableName") String tableName, @PathParam("id") int id) throws JsonProcessingException {
        List<Map<String, Object>> result = dsl.select()
                .from("market." + service.getTableName(tableName))
                .where(service.findCondition(id, tableName))
                .fetch()
                .map( o -> o.intoMap())
                .stream().collect(Collectors.toList());

        try {
            String json = new ObjectMapper().writeValueAsString(result);
            return json;
        } catch ( JsonProcessingException e) {
            return e.getMessage();
        }
    }

    @POST
    @Path("/customer")
    public int setRow(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        CustomerRecord customerRecord = service.convertToCustomerRecord(new ObjectMapper().readValue(json, models.Customer.class));
        return dsl.insertInto(  DSL.table("market."+service.getTableName("customer")))
                .set(Customer.CUSTOMER.ID_ADRESS, customerRecord.getIdAdress())
                .set(Customer.CUSTOMER.FIRSTNAME, customerRecord.getFirstname())
                .set(Customer.CUSTOMER.LASTNAME, customerRecord.getLastname())
                .set(Customer.CUSTOMER.BIRTHDATE, customerRecord.getBirthdate())
                .set(Customer.CUSTOMER.EMAIL, customerRecord.getEmail())
                .execute();
    }
}
