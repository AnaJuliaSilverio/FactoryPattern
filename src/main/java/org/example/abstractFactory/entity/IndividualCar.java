package org.example.abstractFactory.entity;

public class IndividualCar implements Vehicle{
    private String name;
    private Customer customer;

    public IndividualCar(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    public void pickUp() {
        System.out.println(name +" está buscando o cliente "+customer.getName());
    }
}
