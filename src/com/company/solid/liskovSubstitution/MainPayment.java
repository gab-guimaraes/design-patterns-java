package com.company.solid.liskovSubstitution;

public class MainPayment {
    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        NuBankCard card = new NuBankCard();
        card.validate();
        card.colletionPayment();
    }
}
