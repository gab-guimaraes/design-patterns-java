package com.company.solid.dependencyInversion.factory;

import com.company.solid.dependencyInversion.model.IDbProduct;
import com.company.solid.dependencyInversion.model.MySqlProduct;

public class DbProductFactory {
    public static IDbProduct create() {
        return new MySqlProduct();
    }
}
