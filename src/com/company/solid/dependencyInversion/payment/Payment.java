package com.company.solid.dependencyInversion.payment;

import com.company.solid.dependencyInversion.factory.DbProductFactory;
import com.company.solid.dependencyInversion.model.IDbProduct;

public class Payment {
    public void pay(String productID) {
        IDbProduct dbProduct = DbProductFactory.create();
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
