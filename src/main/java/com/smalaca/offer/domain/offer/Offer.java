package com.smalaca.offer.domain.offer;

import java.util.Map;
import java.util.UUID;

// AggregateRoot
public class Offer {

    private final Map<UUID, Integer> cartItems;

    private Offer(Map<UUID, Integer> cartItems) {
        this.cartItems = cartItems;
    }

    public static Offer of(Map<UUID, Integer> cartItems) {
        if (cartItems.isEmpty()) {
            throw new OfferCreationException();
        }

        return new Offer(cartItems);
    }
}
