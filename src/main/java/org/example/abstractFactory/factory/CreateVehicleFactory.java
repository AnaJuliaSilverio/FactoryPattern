package org.example.abstractFactory.factory;

import org.example.abstractFactory.entity.Customer;
import org.example.abstractFactory.entity.Vehicle;

public interface CreateVehicleFactory {
    Customer createCustomer(String customerName);
    Vehicle createVehicle(String vehicleName,String customerName);
}
