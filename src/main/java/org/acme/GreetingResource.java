package org.acme;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
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
//        Zakaznik zakaznik = null;
//        try {
//            zakaznik = objectMapper.readValue(json, Zakaznik.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("nieco " + zakaznik.getLastName());
        return 1;
    }
}
