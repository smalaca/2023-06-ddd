package com.smalaca.cart.adapter.rest.cart;

import java.util.List;
import java.util.UUID;

class ConfirmCartRequest {
    private final UUID cartId;
    private final List<SelectedItemDTO> selectedItems;

    public ConfirmCartRequest(UUID clientId, List<SelectedItemDTO> selectedItems) {
        this.cartId = clientId;
        this.selectedItems = selectedItems;
    }

    public UUID getCartId() {
        return cartId;
    }

    public List<SelectedItemDTO> getSelectedItems() {
        return selectedItems;
    }
}
