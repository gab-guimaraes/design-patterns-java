package com.company.solid.openClose.violate;

public class VehicleViolation {

    /*
    Essa classe nao esta seguindo os padroes SOLID
     */
    private String color;
    private String year;
    private double engine;
    private int seats;

    public VehicleViolation(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car() {
        System.out.println("Creating car" + this.toString());
        startVehicle();
    }

    void startVehicle() {
        System.out.println("ligando os motores");
    }

    void motorcyle() {
        System.out.println("criando uma moto" + year + engine);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", engine=" + engine +
                ", seats=" + seats +
                '}';
    }
}
