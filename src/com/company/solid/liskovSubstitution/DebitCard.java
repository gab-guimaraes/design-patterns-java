package com.company.solid.liskovSubstitution;

public class DebitCard extends NuBankCard{

    @Override
    public void validate() throws Exception {
        System.out.println("verificando saldo");
        System.out.println("positivo");
    }
}
