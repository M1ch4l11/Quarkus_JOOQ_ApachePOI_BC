package service.Interfaces;

import org.jooq.Condition;
import org.jooq.Name;
import java.beans.JavaBean;
import java.util.List;
import java.util.Map;

@JavaBean
public interface DSLControllerService {
    public List<Map<String, Object>> getAllData(Name tableName);
    public List<Map<String, Object>> getAllDataForTable(Name tableName);
    public List<Map<String, Object>> getObjectById(Name tableName, Condition condition);
    public int deleteObjectById(Name tableName, Condition condition);
}
