package com.company.solid.dependencyInversion;

import com.company.solid.dependencyInversion.payment.Payment;

public class MainClass {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}
