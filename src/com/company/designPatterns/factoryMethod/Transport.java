package com.company.designPatterns.factoryMethod;

import com.company.designPatterns.factoryMethod.vehicles.IVehicle;

public abstract class Transport {
    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
