package org.example.abstractFactory.entity;

public class EnterpriseCustomer implements Customer{
    private String name;

    public EnterpriseCustomer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
