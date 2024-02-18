package service.DSLservice;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Name;
import org.jooq.impl.DSL;
import service.Interfaces.DSLGlobalService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ApplicationScoped
public class DSLGlobalServiceImpl implements DSLGlobalService {
    @Inject
    private DSLContext dsl;
    @Override
    public List<Map<String, Object>> getAllData(Name tableName) {
        return dsl.select()
                .from("company." + tableName)
                .fetch()
                .map( o -> o.intoMap())
                .stream().collect(Collectors.toList());
    }
    @Override
    public List<Map<String, Object>> getObjectById(Name tableName, Condition condition) {
        return dsl.select()
                .from("company." + tableName)
                .where(condition)
                .fetch()
                .map( o -> o.intoMap())
                .stream().collect(Collectors.toList());
    }
    @Override
    public int deleteObjectById(Name tableName, Condition condition) {
        return dsl.deleteFrom(DSL.table("company." + tableName))
                .where(condition)
                .execute();
    }
}
