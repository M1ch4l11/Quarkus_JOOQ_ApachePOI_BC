package org.acme;

public class Zakaznik {

    private String firstName;

    private String lastName;

    public Zakaznik(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Zakaznik() {
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
}
