package com.smalaca.cart.command.domain.offer;

import java.math.BigDecimal;

public class Price {
    BigDecimal value = BigDecimal.ZERO;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
