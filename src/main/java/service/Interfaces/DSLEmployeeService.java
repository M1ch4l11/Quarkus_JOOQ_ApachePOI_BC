package service.Interfaces;

import model.company.tables.records.EmployeesRecord;
import org.jooq.Condition;
import org.jooq.Name;
import java.beans.JavaBean;

@JavaBean
public interface DSLEmployeeService {
    public int updateEmployee(Name tableName, Condition condition, EmployeesRecord employeeRecord);
    public int createEmployee(Name tableName, EmployeesRecord employeeRecord);

    EmployeesRecord convertToEmployeeRecord(model.company.tables.pojos.Employees employee);
}
