package com.company.solid.dependencyInversion.model;

public class MongoDBProduct implements IDbProduct{
    @Override
    public String getProductById(String productID) {
        return "MongoDB: DATA" + productID;
    }
}
