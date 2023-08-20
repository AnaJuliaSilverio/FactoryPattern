package org.example.abstractFactory.entity;

public class IndividualCustomer implements Customer{
    private String name;

    public IndividualCustomer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return null;
    }

    public String getName() {
        return name;
    }
}
