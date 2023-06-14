package com.smalaca.offer.command.domain.offer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class CartItemsDTO {

    private final Map<UUID, Integer> cartItems;

}
