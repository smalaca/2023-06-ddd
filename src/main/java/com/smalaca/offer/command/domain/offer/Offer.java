package com.smalaca.offer.command.domain.offer;

import java.util.Map;
import java.util.UUID;

// AggregateRoot
public class Offer {

    private CommodityCatalogueService commodityCatalogueService;
    private final Map<UUID, Integer> cartItems;
    private Price price;

    public Offer(CommodityCatalogueService commodityCatalogueService,
                 Map<UUID, Integer> cartItems) {
        this.commodityCatalogueService = commodityCatalogueService;
        this.cartItems = cartItems;
        this.price = calculateSum();
    }

    private Price calculateSum() {
        /*this.cartItems.entrySet().stream().map(entry -> {
            Price price = this.commodityCatalogueService.findPriceFor(entry.getKey());
            return entry.getValue() * price.getValue();
        });*/
        return new Price();
    }

    /*public static Offer of(Map<UUID, Integer> cartItems) {
        if (cartItems.isEmpty()) {
            throw new OfferCreationException();
        }

        Price price = commodityCatalogueService.findPriceFor(commodityId);

        return new Offer(cartItems);
    }*/
}
