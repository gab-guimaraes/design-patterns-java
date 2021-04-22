package com.company.solid.openClose.vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
    }

    public void configureMotorcycle() {
        System.out.println(toString());
        startVehicle();
    }

    @Override
    public String toString() {
        return "Motorcycle{} " + super.toString();
    }
}
