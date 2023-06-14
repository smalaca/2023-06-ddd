package com.smalaca.cart.adapter.rest.cart;

import java.util.UUID;

class AddCommodityRequest {
    private final UUID cartId;
    private final UUID commodityId;
    private final int quantity;

    AddCommodityRequest(UUID cartId, UUID commodityId, int quantity) {
        this.cartId = cartId;
        this.commodityId = commodityId;
        this.quantity = quantity;
    }

    UUID getCartId() {
        return cartId;
    }

    UUID getCommodityId() {
        return commodityId;
    }

    int getQuantity() {
        return quantity;
    }
}
