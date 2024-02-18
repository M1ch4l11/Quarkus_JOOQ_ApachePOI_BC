package service.Interfaces;

import model.company.tables.pojos.Employees;
import model.company.tables.pojos.Products;
import model.company.tables.records.EmployeesRecord;
import model.company.tables.records.ProductsRecord;
import org.jooq.Condition;
import org.jooq.Name;

import java.beans.JavaBean;
import java.util.List;
import java.util.Map;

@JavaBean
public interface ReusableService {
    public Name getTableName(String name);
    public Condition findCondition(int id, String tableName);

    Condition findConditionCharId(String id, String tableName);

    public String getJsonAsString(List<Map<String, Object>> jooq);
}
