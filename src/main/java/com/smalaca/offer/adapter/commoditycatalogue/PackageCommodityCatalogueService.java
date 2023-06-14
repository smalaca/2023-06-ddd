package com.smalaca.offer.adapter.commoditycatalogue;

import com.smalaca.offer.command.domain.offer.CommodityCatalogueService;
import com.smalaca.offer.command.domain.offer.Price;
import com.smalaca.commoditycatalogue.query.commodity.CommodityQuery;

import java.util.UUID;

// Context Mapping//OHS
public class PackageCommodityCatalogueService implements CommodityCatalogueService {
    private CommodityQuery query;

    @Override
    public Price findPriceFor(UUID commodityId) {
        // wywołanie metody na query
//        Price priceFromService = query.howMuchIsFor(commodityId);
//        Price price = transformToPrice(money);
//        return price;
        return null;
    }
}
