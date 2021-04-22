package com.company.solid.liskovSubstitution;

public interface IPaymentInstrument {
    void validate() throws Exception;
    void colletionPayment();
}
