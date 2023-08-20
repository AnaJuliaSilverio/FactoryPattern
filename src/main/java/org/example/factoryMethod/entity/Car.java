package org.example.factoryMethod.entity;

public class Car implements Vehicle {
    private  String name;

    public Car(String name) {
        this.name = name;
    }

    public void pickUp(String customerName) {
        System.out.println(name +" está buscando o cliente "+customerName);
    }

    public void stop() {
        System.out.println(name+" parou");
    }
}
