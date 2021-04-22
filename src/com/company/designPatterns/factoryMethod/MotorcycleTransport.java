package com.company.designPatterns.factoryMethod;

import com.company.designPatterns.factoryMethod.vehicles.IVehicle;
import com.company.designPatterns.factoryMethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
