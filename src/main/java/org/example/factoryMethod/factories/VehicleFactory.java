package org.example.factoryMethod.factories;

import org.example.factoryMethod.entity.Vehicle;

public abstract class VehicleFactory {
    public abstract Vehicle getVehicle(String vehicleName);


}
