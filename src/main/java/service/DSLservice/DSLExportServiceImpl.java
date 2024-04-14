package service.DSLservice;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import CustomModels.Filter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jooq.*;
import service.Interfaces.DSLExportService;
import service.Interfaces.ReusableService;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.jooq.impl.DSL.field;

@ApplicationScoped
public class DSLExportServiceImpl implements DSLExportService {
    @Inject
    DSLContext dsl;
    @Inject
    ReusableService reusableService;
    @Override
    public List<String> getAllColumnsName(String tableName) {
       return Arrays.stream(dsl.meta().getTables(tableName).get(0)
               .fields()).map(Field::getName).collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getCustomTable(List<String> columns, String tableName) {
        Field<?>[] fields = columns.stream()
                .map(name -> field(name))
                .toArray(Field[]::new);

        return dsl.select(fields)
                .from("company." +reusableService.getTableName(tableName))
                .fetch()
                .map(o -> o.intoMap())
                .stream().collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getFilteredTable(Filter filters, String tableName) {
        return dsl.select()
                .from("company." +reusableService.getTableName(tableName))
                .where(reusableService.createCondition(filters))
                .fetch()
                .map(o -> o.intoMap())
                .stream().collect(Collectors.toList());
    }

    @Override
    public Boolean createExcel(Filter filters, String tableName) {
        List<String> columnsNameRow = this.getAllColumnsName(tableName);
        List<Map<String, Object>> filteredTable = getFilteredTable(filters, tableName);

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        org.apache.poi.ss.usermodel.Row headerRow = sheet.createRow(1);

        IntStream.range(0, columnsNameRow.size())
                .forEach(i -> headerRow.createCell(i + 1).setCellValue(columnsNameRow.get(i)));

        IntStream.range(0, filteredTable.size())
                .forEach(index -> {
                    Row dataRow = sheet.createRow(index + 2);
                    Map<String, Object> map = filteredTable.get(index);
                    int poc = 1;
                    for (Object value : map.values()) {
                        dataRow.createCell(poc++).setCellValue(value == null ? "" : value.toString());
                    }
                });

        try {
            FileOutputStream fileOut = new FileOutputStream("Main.xlsx");
            workbook.write(fileOut);
            workbook.close();
            if(fileOut.getChannel().isOpen()){
                System.out.println("Excel file written successfully. ");
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error writing Excel file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
