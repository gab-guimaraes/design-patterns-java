package com.company.solid.liskovSubstitution;

public class NuBankRewards implements IPaymentInstrument {
    @Override
    public void validate() throws Exception {
        //validacoes
        System.out.println("limite ok, rewards ok");
    }

    @Override
    public void colletionPayment() {
        System.out.println("pagamento realizado com sucesso");
        System.out.println("pontuacao creditada no rewards");
    }
}
