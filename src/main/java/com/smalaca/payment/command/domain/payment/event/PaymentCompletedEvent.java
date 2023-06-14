package com.smalaca.payment.command.domain.payment.event;

import com.smalaca.payment.command.domain.payment.Payment;
import lombok.Value;

import java.time.Instant;

@Value
public class PaymentCompletedEvent {

    Payment payment;
    Instant createdOn;

    public PaymentCompletedEvent(Payment payment) {
        this.payment = payment;
        this.createdOn = Instant.now();
    }
}
