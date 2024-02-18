package service.ResusableService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import model.company.tables.*;
import org.jooq.Condition;
import org.jooq.Name;
import service.Interfaces.ReusableService;

import java.util.List;
import java.util.Map;

@ApplicationScoped
public class ReusableServiceImpl implements ReusableService {
//    clean up this
    public ReusableServiceImpl(){}

    @Override
    public Name getTableName(String tableName) {
        switch (tableName) {
            case "customer":
                return Customers.CUSTOMERS.$name();
            case "employee":
                return Employees.EMPLOYEES.$name();
            case "orders":
                return Orders.ORDERS.$name();
            case "offices":
                return Offices.OFFICES.$name();
            case "orderdetails":
                return Orderdetails.ORDERDETAILS.$name();
            case "payments":
                return Payments.PAYMENTS.$name();
            case "productlines":
                return Productlines.PRODUCTLINES.$name();
            case "products":
                return Products.PRODUCTS.$name();
            default:
                return null;
        }
    }
    @Override
    public Condition findCondition(int id,String tableName){
        if(tableName.equals("customer")) return Customers.CUSTOMERS.CUSTOMERNUMBER.eq(id);
        if(tableName.equals("employee")) return Employees.EMPLOYEES.EMPLOYEENUMBER.eq(id);
        return null;
    }

    @Override
    public Condition findConditionCharId(String id, String tableName){
        if(tableName.equals("products")) return Products.PRODUCTS.PRODUCTCODE.eq(id);
        return null;
    }
    @Override
    public String getJsonAsString(List<Map<String, Object>> jooq) {
        try {
            return new ObjectMapper().writeValueAsString(jooq);
        } catch ( JsonProcessingException e) {
            return e.getMessage();
        }
    }
}
