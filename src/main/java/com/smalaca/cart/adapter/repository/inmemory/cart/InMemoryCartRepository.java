package com.smalaca.cart.adapter.repository.inmemory.cart;

import com.smalaca.cart.command.domain.cart.Cart;
import com.smalaca.cart.command.domain.cart.CartRepository;

import java.util.UUID;

public class InMemoryCartRepository implements CartRepository {
    @Override
    public Cart findBy(UUID cartId) {
        return null;
    }

    @Override
    public void save(Cart cart) {

    }
}
