package service.Interfaces;

import model.company.tables.records.ProductsRecord;
import org.jooq.Condition;
import org.jooq.Name;

import java.beans.JavaBean;

@JavaBean
public interface DSLProductService {
    public int createProduct(Name tableName, ProductsRecord employeeRecord);
    public int updateProduct(Name tableName, Condition condition, ProductsRecord employeeRecord);

    ProductsRecord convertToProductRecord(model.company.tables.pojos.Products product);
}
