package service.Interfaces;

import CustomModels.Filter;
import java.beans.JavaBean;
import java.util.List;
import java.util.Map;

@JavaBean
public interface DSLExportService {
    public List<String> getAllColumnsName(String tableName);

    public List<Map<String, Object>> getCustomTable(List<String> columns, String tableName);

    public List<Map<String, Object>> getFilteredTable(Filter filters, String tableName);

    public Boolean createExcel(Filter filters, String tableName);
}
