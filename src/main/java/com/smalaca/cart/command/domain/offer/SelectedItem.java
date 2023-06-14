package com.smalaca.cart.command.domain.offer;

import java.util.UUID;

public class SelectedItem {
    private final UUID commodityId;
    private final int quantity;

    public SelectedItem(UUID commodityId, int quantity) {
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
