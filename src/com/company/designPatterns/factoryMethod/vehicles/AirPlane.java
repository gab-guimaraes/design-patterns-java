package com.company.designPatterns.factoryMethod.vehicles;

public class AirPlane implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando voo");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos os passageiros, estamos decolando...");
    }
}
