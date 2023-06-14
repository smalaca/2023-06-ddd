package com.smalaca.offer.command.application.offer;

import com.smalaca.offer.command.domain.offer.CommodityCatalogueService;
import com.smalaca.offer.command.domain.offer.Offer;

import java.util.Map;
import java.util.UUID;

public class OfferApplicationService {

    private final CommodityCatalogueService commodityCatalogueService;

    public OfferApplicationService(CommodityCatalogueService commodityCatalogueService) {
        this.commodityCatalogueService = commodityCatalogueService;
    }

    public void createOffer(Map<UUID, Integer> cartItems) {
        Offer offer = new Offer(commodityCatalogueService, cartItems);


    }
}
