package org.example.factoryMethod;
import org.example.factoryMethod.entity.Vehicle;
import org.example.factoryMethod.factories.BicycleFactory;
import org.example.factoryMethod.factories.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        Vehicle fusca = carFactory.getVehicle("Fusca");
        Vehicle bicicleta= bicycleFactory.getVehicle("Bicicleta");
        Vehicle uno = carFactory.getVehicle("Uno");
        fusca.pickUp("Ana");
        bicicleta.pickUp("Paula");
        uno.pickUp("Laura");
    }
}
