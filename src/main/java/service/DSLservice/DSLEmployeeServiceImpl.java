package service.DSLservice;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.company.tables.Employees;
import model.company.tables.records.EmployeesRecord;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Name;
import org.jooq.impl.DSL;
import service.Interfaces.DSLEmployeeService;

@ApplicationScoped
public class DSLEmployeeServiceImpl implements DSLEmployeeService {
    @Inject
    private DSLContext dsl;
    @Override
    public int updateEmployee(Name tableName, Condition findIdCondition, EmployeesRecord employeeRecord) {
        return dsl.update(DSL.table("company."+ tableName))
                .set(Employees.EMPLOYEES.OFFICECODE , employeeRecord.getOfficecode())
                .set(Employees.EMPLOYEES.LASTNAME , employeeRecord.getLastname())
                .set(Employees.EMPLOYEES.FIRSTNAME, employeeRecord.getFirstname())
                .set(Employees.EMPLOYEES.EXTENSION, employeeRecord.getExtension())
                .set(Employees.EMPLOYEES.EMAIL, employeeRecord.getEmail())
                .set(Employees.EMPLOYEES.REPORTSTO, employeeRecord.getReportsto())
                .set(Employees.EMPLOYEES.JOBTITLE, employeeRecord.getJobtitle())
                .where(findIdCondition)
                .execute();
    }

    @Override
    public int createEmployee(Name tableName, EmployeesRecord employeeRecord) {
        return dsl.insertInto( DSL.table("company."+ tableName))
                .set(Employees.EMPLOYEES.OFFICECODE , employeeRecord.getOfficecode())
                .set(Employees.EMPLOYEES.LASTNAME , employeeRecord.getLastname())
                .set(Employees.EMPLOYEES.FIRSTNAME, employeeRecord.getFirstname())
                .set(Employees.EMPLOYEES.EXTENSION, employeeRecord.getExtension())
                .set(Employees.EMPLOYEES.EMAIL, employeeRecord.getEmail())
                .set(Employees.EMPLOYEES.REPORTSTO, employeeRecord.getReportsto())
                .set(Employees.EMPLOYEES.JOBTITLE, employeeRecord.getJobtitle())
                .execute();
    }

    @Override
    public EmployeesRecord convertToEmployeeRecord(model.company.tables.pojos.Employees employee){
        EmployeesRecord employeesRecord = new EmployeesRecord();
        if(employee.getEmployeenumber() != null) employeesRecord.setEmployeenumber(employee.getEmployeenumber());
        employeesRecord.setOfficecode(employee.getOfficecode() );
        employeesRecord.setLastname(employee.getLastname());
        employeesRecord.setFirstname(employee.getFirstname());
        employeesRecord.setExtension(employee.getExtension());
//        employee.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
        employeesRecord.setEmail(employee.getEmail());
        employeesRecord.setReportsto(employee.getReportsto());
        employeesRecord.setJobtitle(employee.getJobtitle());
        return employeesRecord;
    }
}
