package com.company.designPatterns.factoryMethod.vehicles;

public class Motorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inciando a Entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a encomenda");
    }
}
