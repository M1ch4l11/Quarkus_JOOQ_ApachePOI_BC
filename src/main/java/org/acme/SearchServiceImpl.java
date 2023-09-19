package org.acme;

import generated.market.tables.Adress;
import generated.market.tables.Customer;
import generated.market.tables.Fruit;
import generated.market.tables.records.CustomerRecord;
import jakarta.enterprise.context.ApplicationScoped;
import org.jooq.Name;

import java.time.ZoneId;


@ApplicationScoped
public class SearchServiceImpl implements SearchService {

    SearchServiceImpl(){}

    @Override
    public Name getTableName(String name) {
        if(name.equals("adress")) return Adress.ADRESS.$name();
        if(name.equals("fruit")) return Fruit.FRUIT.$name();
        if(name.equals("customer")) return Customer.CUSTOMER.$name();
        return null;
    }

    @Override
    public CustomerRecord convertToCustomerRecord(org.acme.Customer customer){
        CustomerRecord customerRecord = new CustomerRecord();
        customerRecord.setIdCustomer(customer.getId_customer());
        customerRecord.setIdAdress(customer.getId_address());
        customerRecord.setFirstname(customer.getFirstName());
        customerRecord.setLastname(customer.getLastName());
        customerRecord.setBirthdate(customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        customerRecord.setEmail(customer.getEmail());
        return customerRecord;
    }
}
