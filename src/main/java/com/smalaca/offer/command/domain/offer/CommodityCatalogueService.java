package com.smalaca.offer.command.domain.offer;

import java.util.UUID;

public interface CommodityCatalogueService {
    Price findPriceFor(UUID commodityId);
}
