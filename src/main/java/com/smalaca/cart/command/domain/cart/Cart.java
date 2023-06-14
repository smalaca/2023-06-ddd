package com.smalaca.cart.command.domain.cart;

import com.smalaca.cart.command.domain.offer.CommodityCatalogueService;
import com.smalaca.cart.command.domain.offer.Offer;
import com.smalaca.cart.command.domain.offer.Price;
import com.smalaca.cart.command.domain.offer.SelectedItem;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

// AggregateRoot
public class Cart {
    private CommodityCatalogueService commodityCatalogueService;
    private final Map<UUID, CartItem> cartItems = new HashMap<>();

    public void add(UUID commodityId, int quantity) {
        CartItem commodity = cartItems.get(commodityId);

        if (commodity == null) {
            cartItems.put(commodityId, CartItem.of(commodityId, quantity));
        } else {
            commodity.increase(quantity);
        }
    }

    public Offer generateOffer(List<SelectedItem> selectedItems) {
        Price totalPrice = calculateTotalPrice(selectedItems);
        return Offer.of(totalPrice, selectedItems);
    }

    private Price calculateTotalPrice(List<SelectedItem> selectedItems) {
        Price totalPrice = new Price();

        for (SelectedItem item : selectedItems) {
            Price itemPrice = commodityCatalogueService.findPriceFor(item.getCommodityId());
            BigDecimal priceForSelectedItem = totalPrice.getValue()
                    .add(calculatePrice(item, itemPrice));
            totalPrice.setValue(priceForSelectedItem);
        }

        return totalPrice;
    }

    private BigDecimal calculatePrice(SelectedItem item, Price itemPrice) {
        return itemPrice.getValue().multiply(BigDecimal.valueOf(item.getQuantity()));
    }
}
