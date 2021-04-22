package com.company.solid.openClose.vehicle;

public class Car extends Vehicle {
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void configureCar() {
        System.out.println(toString());
        startVehicle();
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                "} " + super.toString();
    }
}
