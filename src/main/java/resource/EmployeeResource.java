package resource;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import model.company.tables.pojos.Employees;
import model.company.tables.records.EmployeesRecord;
import org.jboss.resteasy.reactive.PartType;
import service.Interfaces.DSLEmployeeService;
import service.Interfaces.ReusableService;

@RequestScoped
@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {
    @Inject
    DSLEmployeeService dslEmployeeService;
    @Inject
    ReusableService reusableService;

    @POST
    @Path("/create")
    public int setRow(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        Employees employee = new ObjectMapper().readValue(json, model.company.tables.pojos.Employees.class);
        EmployeesRecord employeesRecord = dslEmployeeService.convertToEmployeeRecord(employee);
        return dslEmployeeService.createEmployee(reusableService.getTableName("employee"), employeesRecord );
    }

    @PUT
    @Path("/update")
    public int updateRow(@PartType(MediaType.APPLICATION_JSON) String json) throws JsonProcessingException {
        Employees employee = new ObjectMapper().readValue(json, Employees.class);
        EmployeesRecord employeeRecord = dslEmployeeService.convertToEmployeeRecord(employee);
        return dslEmployeeService.updateEmployee(reusableService.getTableName("employee") , reusableService.findCondition(employeeRecord.getEmployeenumber(), "employee"), employeeRecord);
    }
}
