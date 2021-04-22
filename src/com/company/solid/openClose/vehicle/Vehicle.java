package com.company.solid.openClose.vehicle;

public class Vehicle {
    protected String color;
    protected String year;
    protected double engine;

    void startVehicle() {
        System.out.println("turn on motor...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", engine=" + engine +
                '}';
    }
}
