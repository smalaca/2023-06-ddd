package com.smalaca.cart.adapter.packageservice.commoditycatalogue;

import com.smalaca.cart.command.domain.offer.CommodityCatalogueService;
import com.smalaca.cart.command.domain.offer.Price;
import com.smalaca.commoditycatalogue.query.commodity.CommodityQuery;

import java.util.UUID;

public class PackageCommodityCatalogueService implements CommodityCatalogueService {
    private CommodityQuery query;

    @Override
    public Price findPriceFor(UUID commodityId) {
        return null;
    }
}
