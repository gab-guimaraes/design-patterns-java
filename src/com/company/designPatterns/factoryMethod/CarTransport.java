package com.company.designPatterns.factoryMethod;

import com.company.designPatterns.factoryMethod.vehicles.Car;
import com.company.designPatterns.factoryMethod.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }

}
