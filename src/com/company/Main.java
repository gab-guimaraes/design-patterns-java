package com.company;

import com.company.solid.openClose.vehicle.Car;
import com.company.solid.openClose.vehicle.Motorcycle;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car("amarelo", "2012", 2.0, 4);
        Motorcycle motorcycle = new Motorcycle("blue", "2013", 250);
        car.configureCar();
        motorcycle.configureMotorcycle();
    }

}
