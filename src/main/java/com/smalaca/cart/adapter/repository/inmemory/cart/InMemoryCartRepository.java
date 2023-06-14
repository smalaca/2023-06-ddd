package com.smalaca.cart.adapter.repository.inmemory.cart;

import com.smalaca.cart.command.domain.cart.Cart;
import com.smalaca.cart.command.domain.cart.CartRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public class InMemoryCartRepository implements CartRepository {
    private CrudRepository<Cart, UUID> cartRepository;

    @Override
    public Cart findBy(UUID cartId) {
        return cartRepository.findById(cartId).get();
    }

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }
}
