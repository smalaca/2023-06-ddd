package com.smalaca.cart.adapter.rest.cart;

import java.util.UUID;

public class SelectedItemDTO {

    private final UUID commodityId;
    private final int quantity;

    public SelectedItemDTO(UUID commodityId, int quantity) {
        this.commodityId = commodityId;
        this.quantity = quantity;
    }

    public UUID getCommodityId() {
        return commodityId;
    }

    public int getQuantity() {
        return quantity;
    }
}
