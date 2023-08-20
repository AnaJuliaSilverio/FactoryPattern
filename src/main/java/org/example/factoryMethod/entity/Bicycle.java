package org.example.factoryMethod.entity;

public class Bicycle implements Vehicle {
    private  String name;

    public Bicycle(String name) {
        this.name = name;
    }

    public void pickUp(String customerName) {
        System.out.println(name +" está buscando o cliente "+customerName);
    }

    public void stop() {
        System.out.println(name+" parou");
    }
}
