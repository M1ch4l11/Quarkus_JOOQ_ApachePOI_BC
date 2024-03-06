package resource;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jooq.Condition;
import org.jooq.Name;
import service.Interfaces.DSLGlobalService;
import service.Interfaces.ReusableService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@RequestScoped
@Path("/main")
@Produces(MediaType.APPLICATION_JSON)
public class GlobalResource {
    @Inject
    ReusableService reusableService;
    @Inject
    DSLGlobalService dslGlobalService;

    @GET
    @Path("/{tableName}/all")
    public String getAll(@PathParam("tableName") String tableName ) {
        Name tableNaming = reusableService.getTableName(tableName);
        return reusableService.getJsonAsString(dslGlobalService.getAllData(tableNaming));
    }

    @GET
    @Path("/{tableName}/{id}")
    public String getById(@PathParam("tableName") String tableName, @PathParam("id") int id) {
        Name tableNaming = reusableService.getTableName(tableName);
        Condition conditionWhere = reusableService.findCondition(id, tableName);
        return reusableService.getJsonAsString(dslGlobalService.getObjectById(tableNaming, conditionWhere));
    }

    @GET
    @Path("/{tableName}/{id}/char")
    public String getByCharId(@PathParam("tableName") String tableName, @PathParam("id") String id) {
        Name tableNaming = reusableService.getTableName(tableName);
        Condition conditionWhere = reusableService.findConditionCharId(id, tableName);
        return reusableService.getJsonAsString(dslGlobalService.getObjectById(tableNaming, conditionWhere));
    }

    @DELETE
    @Path("/{tableName}/{id}")
    public int deleteById(@PathParam("tableName") String tableName, @PathParam("id") int id) {
        return dslGlobalService.deleteObjectById(reusableService.getTableName(tableName), reusableService.findCondition(id, tableName));
    }

    @DELETE
    @Path("/{tableName}/{id}/char")
    public int deleteByCharId(@PathParam("tableName") String tableName, @PathParam("id") String id) {
        return dslGlobalService.deleteObjectById(reusableService.getTableName(tableName), reusableService.findConditionCharId(id, tableName));
    }

    @GET
    @Path("/excel/create")
    @Produces(MediaType.TEXT_PLAIN)
    public String generateExcel(){
        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            // todo: get some table and add row to the sheet
            // get column names
            // get all rows
            // insert rows to the sheet

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Column 1");
            headerRow.createCell(1).setCellValue("Column 2");

            Row dataRow = sheet.createRow(1);
            dataRow.createCell(0).setCellValue("Data 1");
            dataRow.createCell(1).setCellValue("Data 2");

        try {
            FileOutputStream fileOut = new FileOutputStream("Basic.xlsx");
            workbook.write(fileOut);
        } catch (FileNotFoundException e) {
            return "File not found sample.xlsx";
        }
            workbook.close();
            return "Excel file generated successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to generate Excel file";
        }
    }
}
