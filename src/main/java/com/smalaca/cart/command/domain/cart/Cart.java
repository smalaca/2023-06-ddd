package com.smalaca.cart.command.domain.cart;

import com.smalaca.cart.command.domain.offert.Offer;
import com.smalaca.cart.command.domain.offert.OfferFactory;
import com.smalaca.cart.command.domain.vo.Quantity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// AggregateRoot
public class Cart {

    private OfferFactory offerFactory;
    private final Map<UUID, CartItem> cardItems = new HashMap<>();

    public void add(UUID commodityId, Quantity quantity) {
        CartItem cartItem = cardItems.get(commodityId);

        if (cartItem == null) {
            cardItems.put(commodityId, CartItem.of(commodityId, quantity));
        } else {
            cartItem.increase(quantity);
        }
    }

  /*  public void delete(UUID commodityId, int quantity) {
        CartItem cartItem = cardItems.get(commodityId);

        if (cartItem == null || cartItem.) {
            throw new QuantityException(quantity);
        } else {
            cartItem.decrease(quantity);
        }
    }*/

    public Offer accept(Map<UUID, Quantity> chooseItems) {
        chooseItems.forEach((id, quantity) -> {
            CartItem cartItem = cardItems.get(id);
            if (!cartItem.isEqualOrMore(quantity)) {
                throw new QuantityException(quantity.getValue());
            }
        });
        return offerFactory.createOffer(chooseItems);
    }
}
