package service.Interfaces;

import CustomModels.PaginationFilter;
import CustomModels.SearchFilter;
import java.beans.JavaBean;
import java.util.List;
import java.util.Map;

@JavaBean
public interface DSLSearchService {
    public List<Map<String, Object>> getFilteredTable(SearchFilter filters, String tableName);

    List<Map<String, Object>> getFullFilteredTable(SearchFilter filters, String tableName);

    public List<Map<String, Object>> filteredTableEvent(SearchFilter searchFilter, PaginationFilter paginationFilter, String tableName);

}
