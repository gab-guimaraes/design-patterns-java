package com.company.solid.singleResponsability;

public class Client {

    /*
        Single Responsability - Cada classe deve ter apenas
        uma objetivo e uma responsabilidade
        (fugir da GOD CLASS)
     */
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
