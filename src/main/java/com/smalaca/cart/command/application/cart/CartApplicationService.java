package com.smalaca.cart.command.application.cart;

import com.smalaca.cart.command.domain.cart.Cart;
import com.smalaca.cart.command.domain.cart.CartRepository;

import java.util.Collection;
import java.util.UUID;

public class CartApplicationService {
    private final CartRepository cartRepository;

    public CartApplicationService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addCommodity(UUID cartId, UUID commodityId, int quantity) {
        // tłumaczenie 0-*
        Cart cart = cartRepository.findBy(cartId);

        // kontakt z domeną = 1
        cart.add(commodityId, quantity);

        // zapis 0-*
        cartRepository.save(cart);
    }
}
