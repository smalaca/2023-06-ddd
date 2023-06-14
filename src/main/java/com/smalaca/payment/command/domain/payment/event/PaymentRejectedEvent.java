package com.smalaca.payment.command.domain.payment.event;

import com.smalaca.payment.command.domain.payment.Payment;
import lombok.Value;

import java.time.Instant;

@Value
public class PaymentRejectedEvent {

    Payment payment;
    Instant createdOn;

    public PaymentRejectedEvent(Payment payment) {
        this.payment = payment;
        this.createdOn = Instant.now();
    }
}
