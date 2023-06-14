package com.smalaca.cart.command.domain.offer;

import java.util.UUID;

public class Offer {
    private CommodityCatalogueService commodityCatalogueService;

    public void foo() {
        UUID commodityId = null;
        Price price = commodityCatalogueService.findPriceFor(commodityId);
    }
}
