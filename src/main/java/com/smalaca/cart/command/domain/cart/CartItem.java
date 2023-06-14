package com.smalaca.cart.command.domain.cart;

import com.smalaca.cart.command.domain.vo.Quantity;

import java.util.UUID;

// Entity
class CartItem {
    private final UUID commodityId;
    private Quantity quantity;

    private CartItem(UUID commodityId, Quantity quantity) {
        this.commodityId = commodityId;
        this.quantity = quantity;
    }

    static CartItem of(UUID commodityId, Quantity quantity) {
        return new CartItem(commodityId, quantity);
    }

    void increase(Quantity quantity) {
        this.quantity = this.quantity.increase(quantity);
    }

    boolean isEqualOrMore(Quantity quantity) {
        return this.quantity.isEqualOrMore(quantity);
    }


}
