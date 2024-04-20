package service.Interfaces;

import CustomModels.Filter;
import CustomModels.SearchFilter;
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

    public Condition createCondition(Filter filters);

    Condition createAuthCondition(SearchFilter filters);

    public Condition createSearchCondition(SearchFilter filters);
}
