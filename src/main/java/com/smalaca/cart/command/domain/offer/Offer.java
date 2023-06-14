package com.smalaca.cart.command.domain.offer;

import java.util.List;

public class Offer {
    private final Price totalPrice;
    private final List<SelectedItem> selectedItems;

    private Offer(Price totalPrice, List<SelectedItem> selectedItems) {
        this.totalPrice = totalPrice;
        this.selectedItems = selectedItems;
    }

    public static Offer of(Price totalPrice, List<SelectedItem> selectedItems) {
        return new Offer(totalPrice, selectedItems);
    }
}
