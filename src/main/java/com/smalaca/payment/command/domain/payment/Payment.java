package com.smalaca.payment.command.domain.payment;

import com.smalaca.cart.command.domain.vo.Money;
import com.smalaca.payment.command.domain.payment.event.PaymentCompletedEvent;
import com.smalaca.payment.command.domain.payment.event.PaymentRejectedEvent;
import com.smalaca.payment.command.domain.payment.exception.PaymentException;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.time.Instant;
import java.util.UUID;

import static com.smalaca.payment.command.domain.payment.PaymentStatus.COMPLETED;
import static com.smalaca.payment.command.domain.payment.PaymentStatus.REJECTED;

public class Payment extends AbstractAggregateRoot<Payment> {
    private UUID id;

    private UUID orderId;

    private UUID customerId;

    private Money price;

    private PaymentStatus status;

    private Instant creationDate;

    private Payment(UUID orderId, UUID customerId, Money price) {
        id = UUID.randomUUID();
        creationDate = Instant.now();
        this.orderId = orderId;
        this.customerId = customerId;
        this.price = price;
    }

    public static Payment of(UUID orderId, UUID customerId, Money price) {
        validatePaymentPrice(price);
        return new Payment(orderId, customerId, price);
    }

    public void complete() {
        status = COMPLETED;
        this.registerEvent(new PaymentCompletedEvent(this));
    }

    public void rejected() {
        status = REJECTED;
        this.registerEvent(new PaymentRejectedEvent(this));
    }

    public boolean isCompleted() {
        return status.equals(COMPLETED);
    }

    public boolean isRejected() {
        return status.equals(REJECTED);
    }

    private static void validatePaymentPrice(Money price) {
        if (!price.isGreaterThanZero()) {
            throw new PaymentException("Payment price must be greater than zero. Payment price: " + price.getAmount());
        }
    }


}
