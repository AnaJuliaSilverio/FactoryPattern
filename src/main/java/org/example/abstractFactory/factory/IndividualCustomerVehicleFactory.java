package org.example.abstractFactory.factory;

import org.example.abstractFactory.entity.*;

public class IndividualCustomerVehicleFactory implements CreateVehicleFactory {

    public Customer createCustomer(String customerName) {
        return new IndividualCustomer(customerName);
    }

    public Vehicle createVehicle(String vehicleName, String customerName) {
        Customer customer = createCustomer(customerName);
        return new IndividualCar(vehicleName,customer);
    }
}
