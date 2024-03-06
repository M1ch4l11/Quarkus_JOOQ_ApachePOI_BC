package service.ResusableService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import model.Filter;
import model.company.tables.*;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import service.Interfaces.ReusableService;

import java.util.List;
import java.util.Map;

import static org.jooq.impl.DSL.field;

@ApplicationScoped
public class ReusableServiceImpl implements ReusableService {
    public ReusableServiceImpl(){}

    @Override
    public Name getTableName(String tableName) {
        switch (tableName) {
            case "customer":
                return Customers.CUSTOMERS.$name();
            case "employees":
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
        if(tableName.equals("employees")) return Employees.EMPLOYEES.EMPLOYEENUMBER.eq(id);
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

    @Override
    public String getJsonAsStringColumns(List<String> jooq) {
        try {
            return new ObjectMapper().writeValueAsString(jooq);
        } catch ( JsonProcessingException e) {
            return e.getMessage();
        }
    }

    @Override
    public Condition createCondition(Filter filters) {
        Field field = field(filters.getColumnName());
        return createConditionByType(field, filters);
    }

    // TODO: Make it more dynamic
    public Condition createConditionByType(Field field, Filter filters) {
        if ( filters.getSecondCondition() != null ) {
            System.out.println(filters.getSecondCondition() + " zbehlo.. ");
            String firstConditionValue = filters.getFirstConditionValue();
            String secondConditionValue = filters.getSecondConditionValue();
            switch (filters.getFirstCondition()){
                case "less" -> { return field.le(isInteger(firstConditionValue) ? Integer.parseInt(firstConditionValue) : firstConditionValue)
                                            .and(field.gt(isInteger(secondConditionValue) ? Integer.parseInt(secondConditionValue) : secondConditionValue)); }
                case "more" -> { return field.gt(isInteger(firstConditionValue) ? Integer.parseInt(firstConditionValue) : firstConditionValue)
                                            .and(field.le(isInteger(secondConditionValue) ? Integer.parseInt(secondConditionValue) : secondConditionValue)); }
                default -> {
                    // todo reusable error handling
                    return null;
                }
            }
        }
        String conditionValue = filters.getFirstConditionValue();
        switch (filters.getFirstCondition()){
            case "contains" -> { return field.contains(isInteger(conditionValue) ? Integer.parseInt(conditionValue) : conditionValue); }
            case "equals" -> { return field.eq(isInteger(conditionValue) ? Integer.parseInt(conditionValue) : conditionValue); }
            case "less" -> { return field.le(isInteger(conditionValue) ? Integer.parseInt(conditionValue) : conditionValue); }
            case "more" -> { return field.gt(isInteger(conditionValue) ? Integer.parseInt(conditionValue) : conditionValue); }
            default -> {
                // todo reusable error handling
                return null;
            }
        }
    }

    public boolean isInteger(String conditionValue) {
        try {
            Integer.parseInt(conditionValue);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
