package com.smalaca.cart.command.domain.vo;

import lombok.Value;

@Value
public class Quantity {

    int value;

    public Quantity(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public Quantity increase(Quantity quantity) {
        return new Quantity(this.value + quantity.value);
    }

    public boolean isEqualOrMore(Quantity quantity) {
        return this.value >= quantity.getValue();
    }
}
