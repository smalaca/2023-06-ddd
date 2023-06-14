package com.smalaca.payment.command.domain.payment.exception;

public class PaymentException extends RuntimeException{

    public PaymentException(String message) {
        super(message);
    }
}
