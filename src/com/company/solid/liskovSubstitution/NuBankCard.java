package com.company.solid.liskovSubstitution;

public class NuBankCard implements IPaymentInstrument{

    @Override
    public void validate() throws Exception {
        //validacao basica
    }

    @Override
    public void colletionPayment() {
        System.out.println("pagamento realizado");
    }
}
