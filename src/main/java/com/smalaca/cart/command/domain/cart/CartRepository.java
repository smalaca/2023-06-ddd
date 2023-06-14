package com.smalaca.cart.command.domain.cart;

import java.util.UUID;

public interface CartRepository {
    Cart findBy(UUID cartId);

    void save(Cart cart);
}
