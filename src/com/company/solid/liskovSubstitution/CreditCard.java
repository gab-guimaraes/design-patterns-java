package com.company.solid.liskovSubstitution;

public class CreditCard extends NuBankCard {
    @Override
    public void validate() throws Exception {
        //validacao do cartao de credito
        System.out.println("validando limite");
        System.out.println("limite ok");
    }
}
