package service.DSLservice;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.company.tables.Products;
import model.company.tables.records.ProductsRecord;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Name;
import org.jooq.impl.DSL;
import service.Interfaces.DSLProductService;

@ApplicationScoped
public class DSLProductServiceImpl implements DSLProductService {
    @Inject
    private DSLContext dsl;
    @Override
    public int createProduct(Name tableName, ProductsRecord productsRecord) {
        return dsl.insertInto( DSL.table("company."+ tableName))
                .set(Products.PRODUCTS.PRODUCTCODE, productsRecord.getProductcode())
                .set(Products.PRODUCTS.PRODUCTLINE , productsRecord.getProductline())
                .set(Products.PRODUCTS.PRODUCTNAME, productsRecord.getProductname())
                .set(Products.PRODUCTS.PRODUCTSCALE, productsRecord.getProductscale())
                .set(Products.PRODUCTS.PRODUCTVENDOR, productsRecord.getProductvendor())
                .set(Products.PRODUCTS.PRODUCTDESCRIPTION, productsRecord.getProductdescription())
                .set(Products.PRODUCTS.QUANTITYINSTOCK, productsRecord.getQuantityinstock())
                .set(Products.PRODUCTS.BUYPRICE, productsRecord.getBuyprice())
                .set(Products.PRODUCTS.MSRP, productsRecord.getMsrp())
                .execute();
    }
    @Override
    public int updateProduct(Name tableName, Condition findIdCondition, ProductsRecord productsRecord) {
        return dsl.update(DSL.table("company."+ tableName))
                .set(Products.PRODUCTS.PRODUCTLINE , productsRecord.getProductline())
                .set(Products.PRODUCTS.PRODUCTNAME, productsRecord.getProductname())
                .set(Products.PRODUCTS.PRODUCTSCALE, productsRecord.getProductscale())
                .set(Products.PRODUCTS.PRODUCTVENDOR, productsRecord.getProductvendor())
                .set(Products.PRODUCTS.PRODUCTDESCRIPTION, productsRecord.getProductdescription())
                .set(Products.PRODUCTS.QUANTITYINSTOCK, productsRecord.getQuantityinstock())
                .set(Products.PRODUCTS.BUYPRICE, productsRecord.getBuyprice())
                .set(Products.PRODUCTS.MSRP, productsRecord.getMsrp())
                .where(findIdCondition)
                .execute();
    }

    @Override
    public ProductsRecord convertToProductRecord(model.company.tables.pojos.Products product) {
        ProductsRecord productRecord = new ProductsRecord();
        if(product.getProductcode() != null) productRecord.setProductcode( product.getProductcode());
        productRecord.setProductline( product.getProductline());
        productRecord.setProductname(product.getProductname());
        productRecord.setProductscale(product.getProductscale());
        productRecord.setProductvendor( product.getProductvendor());
        productRecord.setProductdescription( product.getProductdescription());
        productRecord.setQuantityinstock( product.getQuantityinstock());
        productRecord.setBuyprice(product.getBuyprice());
        productRecord.setMsrp(product.getMsrp());
        return productRecord;
    }
}
