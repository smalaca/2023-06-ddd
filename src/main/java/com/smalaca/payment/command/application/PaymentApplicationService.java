package com.smalaca.payment.command.application;

import com.smalaca.cart.command.domain.vo.Money;
import com.smalaca.payment.command.domain.payment.Payment;
import com.smalaca.payment.command.domain.payment.port.PaymentRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class PaymentApplicationService {

    private PaymentRepository paymentRepository;

    private PaymentApplicationService self;


    public void makePayment(UUID orderId, UUID customerId, Money price) { //Jakieś DTO
        Payment payment = self.createPayment(orderId, customerId, price);
        //call do Paypal
        if (udło sie) {
            payment.complete();
        } else {
            payment.rejected();
        }
        paymentRepository.save(payment);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Payment createPayment(UUID orderId, UUID customerId, Money price) {
        Payment payment = Payment.of(orderId, customerId, price);
        return paymentRepository.save(payment);
    }
}
