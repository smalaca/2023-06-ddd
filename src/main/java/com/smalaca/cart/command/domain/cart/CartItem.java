package com.smalaca.cart.command.domain.cart;

import java.util.UUID;

// Entity
class CartItem {
    private final UUID commodityId;
    private int quantity;

    private CartItem(UUID commodityId, int quantity) {
        this.commodityId = commodityId;
        this.quantity = quantity;
    }

    static CartItem of(UUID commodityId, int quantity) {
        if (quantity < 1) {
            throw new QuantityException(quantity);
        }

        return new CartItem(commodityId, quantity);
    }

    void increase(int quantity) {
        this.quantity += quantity;
    }

    public UUID getCommodityId() {
        return commodityId;
    }

    public int getQuantity() {
        return quantity;
    }
}
