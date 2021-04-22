package com.company.solid.dependencyInversion.model;

public class MySqlProduct implements IDbProduct {

    public String getProductById(String productID) {
        return "MYSQL: DATA" + productID;
    }

}
