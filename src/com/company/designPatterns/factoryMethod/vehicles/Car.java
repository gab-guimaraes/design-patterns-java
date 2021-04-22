package com.company.designPatterns.factoryMethod.vehicles;

public class Car implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos os passageiros, estamos prontos");
    }
}
