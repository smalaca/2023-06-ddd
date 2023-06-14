package com.smalaca.cart.command.domain.offer;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Price {
    private final BigDecimal value;
}
