package resource.basic;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.company.tables.pojos.Products;
import model.company.tables.records.ProductsRecord;
import org.jboss.resteasy.reactive.PartType;
import service.Interfaces.DSLProductService;
import service.Interfaces.ReusableService;

@RequestScoped
@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
    @Inject
    DSLProductService dslProductService;
    @Inject
    ReusableService reusableService;

    @POST
    @Path("/create")
    public int setProduct(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        Products product = new ObjectMapper().readValue(json, Products.class);
        ProductsRecord productRecord = dslProductService.convertToProductRecord(product);
        return dslProductService.createProduct(reusableService.getTableName("products"), productRecord );
    }

    @PUT
    @Path("/update")
    public int updateProduct(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        Products product = new ObjectMapper().readValue(json, Products.class);
        ProductsRecord productRecord = dslProductService.convertToProductRecord(product);
        return dslProductService.updateProduct(reusableService.getTableName("products") , reusableService.findConditionCharId(product.getProductcode(), "products"), productRecord);
    }
}
