package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.PartType;

@Path("/hello")
@ApplicationScoped
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @POST
    @Path("/add")
    public int pridaj(@PartType(MediaType.APPLICATION_JSON) String json){
//        ObjectMapper objectMapper = new ObjectMapper();
//        CustomerDemo customer = null;
//        try {
//            customer = objectMapper.readValue(json, CustomerDemo.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("nieco " + customer.getLastName());
        return 1;
    }
}
