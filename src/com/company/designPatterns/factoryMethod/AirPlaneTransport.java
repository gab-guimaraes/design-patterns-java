package com.company.designPatterns.factoryMethod;

import com.company.designPatterns.factoryMethod.vehicles.AirPlane;
import com.company.designPatterns.factoryMethod.vehicles.IVehicle;

public class AirPlaneTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new AirPlane();
    }
}
