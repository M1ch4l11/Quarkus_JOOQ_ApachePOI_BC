package org.acme;

import generated.market.tables.records.CustomerRecord;
import org.jooq.Name;

import java.beans.JavaBean;


@JavaBean
public interface SearchService {
    public Name getTableName(String name);

    public CustomerRecord convertToCustomerRecord(Customer customer);
}
