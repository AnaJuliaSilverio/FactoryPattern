package org.example.factoryMethod.factories;

import org.example.factoryMethod.entity.Car;
import org.example.factoryMethod.entity.Vehicle;

public class CarFactory extends VehicleFactory{
    public Vehicle getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }
}
