package service.DSLservice;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import CustomModels.PaginationFilter;
import CustomModels.SearchFilter;
import org.jooq.DSLContext;
import service.Interfaces.DSLSearchService;
import service.Interfaces.ReusableService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ApplicationScoped
public class DSLSearchServiceImpl implements DSLSearchService {
    @Inject
    DSLContext dsl;

    @Inject
    ReusableService reusableService;

    @Override
    public List<Map<String, Object>> getFilteredTable(SearchFilter filters, String tableName) {
        return dsl.select()
                .from("company." +reusableService.getTableName(tableName))
                .where(reusableService.createSearchCondition(filters))
                .limit(5)
                .offset(0)
                .fetch()
                .map(o -> o.intoMap())
                .stream().collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getFullFilteredTable(SearchFilter filters, String tableName) {
        return dsl.select()
                .from("company." +reusableService.getTableName(tableName))
                .where(reusableService.createSearchCondition(filters))
                .fetch()
                .map(o -> o.intoMap())
                .stream().collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> filteredTableEvent(SearchFilter searchFilter, PaginationFilter paginationFilter, String tableName) {
        return dsl.select()
                .from("company." +reusableService.getTableName(tableName))
                .where(reusableService.createSearchCondition(searchFilter))
                .limit(5)
                .offset(paginationFilter.getCurrentPage() * 5 - 5)
                .fetch()
                .map(o -> o.intoMap())
                .stream().collect(Collectors.toList());
    }
}
