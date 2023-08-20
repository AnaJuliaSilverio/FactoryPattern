package org.example.abstractFactory;

import org.example.abstractFactory.entity.Vehicle;
import org.example.abstractFactory.factory.EnterpriseCustomerVehicleFactory;
import org.example.abstractFactory.factory.IndividualCustomerVehicleFactory;


public class Main {
    public static void main(String[] args) {
        EnterpriseCustomerVehicleFactory enterpriseCustomerVehicleFactory = new EnterpriseCustomerVehicleFactory();
        IndividualCustomerVehicleFactory individualCustomerVehicleFactory =new IndividualCustomerVehicleFactory();

        Vehicle fusca = enterpriseCustomerVehicleFactory.createVehicle("fusca","Ana");
        Vehicle celta = individualCustomerVehicleFactory.createVehicle("celta","Helena");
        fusca.pickUp();
        celta.pickUp();
    }



}
