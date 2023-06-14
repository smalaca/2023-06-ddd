package com.smalaca.cart.command.domain.offer;

import java.util.UUID;

public interface CommodityCatalogueService {
    Price findPriceFor(UUID commodityId);
}
