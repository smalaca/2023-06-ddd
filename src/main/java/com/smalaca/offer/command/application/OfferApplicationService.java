package com.smalaca.offer.command.application;

import com.smalaca.offer.domain.offer.Offer;

import java.util.Map;
import java.util.UUID;

public class OfferApplicationService {

    public Offer createOffer(Map<UUID, Integer> cartItems) {
        Offer offer = Offer.of(cartItems);


    }
}
