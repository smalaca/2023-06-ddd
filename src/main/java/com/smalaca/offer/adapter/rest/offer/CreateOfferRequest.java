package com.smalaca.offer.adapter.rest.offer;

import java.util.Map;
import java.util.UUID;

public class CreateOfferRequest {

    private final Map<UUID, Integer> cartItems;

    public CreateOfferRequest(Map<UUID, Integer> cartItems) {
        this.cartItems = cartItems;
    }

    public Map<UUID, Integer> getCartItems() {
        return cartItems;
    }
}
