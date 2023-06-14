package com.smalaca.cart.command.domain.cart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
// AggregateRoot
public class Cart {
    @Id @GeneratedValue
    private UUID id;

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
