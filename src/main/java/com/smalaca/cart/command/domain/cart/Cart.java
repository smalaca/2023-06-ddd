package com.smalaca.cart.command.domain.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// AggregateRoot
public class Cart {
    private final Map<UUID, CartItem> commodities = new HashMap<>();

    public void add(UUID commodityId, int quantity) {
        CartItem commodity = commodities.get(commodityId);

        if (commodity == null) {
            commodities.put(commodityId, CartItem.of(commodityId, quantity));
        } else {
            commodity.increase(quantity);
        }
    }
}
