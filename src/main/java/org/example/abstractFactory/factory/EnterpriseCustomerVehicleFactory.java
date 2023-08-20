package org.example.abstractFactory.factory;

import org.example.abstractFactory.entity.Customer;
import org.example.abstractFactory.entity.EnterpriseCar;
import org.example.abstractFactory.entity.EnterpriseCustomer;
import org.example.abstractFactory.entity.Vehicle;

public class EnterpriseCustomerVehicleFactory implements CreateVehicleFactory {


    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }

    public Vehicle createVehicle(String vehicleName, String customerName) {
        Customer costumer = createCustomer(customerName);
        return new EnterpriseCar(vehicleName,costumer);
    }
}
