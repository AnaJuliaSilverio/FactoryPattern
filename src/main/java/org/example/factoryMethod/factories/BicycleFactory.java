package org.example.factoryMethod.factories;

import org.example.factoryMethod.entity.Bicycle;
import org.example.factoryMethod.entity.Vehicle;

public class BicycleFactory extends VehicleFactory {
    public Vehicle getVehicle(String vehicleName) {
        return new Bicycle(vehicleName);
    }
}
