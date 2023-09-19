package org.acme;

import jakarta.annotation.Nullable;

import java.util.Date;

public class Customer {

    @Nullable
    private int id_customer;

    private int id_address;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;

    public Customer(int idCustomer, int idAddress, String firstName, String lastName, Date birthDate, String email) {
        this.id_customer = idCustomer;
        this.id_address = idAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Customer(){}

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_address() {
        return id_address;
    }

    public void setId_address(int id_address) {
        this.id_address = id_address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + id_customer +
                ", idAddress=" + id_address +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                '}';
    }
}