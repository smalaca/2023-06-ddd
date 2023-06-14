package com.smalaca.payment.command.domain.payment.port;

import com.smalaca.payment.command.domain.payment.Payment;

public interface PaymentRepository {

    Payment save(Payment payment);
}
