package com.smalaca.cart.command.domain.offert;

import com.smalaca.cart.command.domain.vo.Quantity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class OfferFactory {

    private CommodityCatalogueService commodityCatalogueService;

    public Offer createOffer(Map<UUID, Quantity> chooseItems) {
        List<OfferItem> offerItemList = new ArrayList<>();
        chooseItems.forEach((id, quantity) -> {
            offerItemList.add(OfferItem.builder()
                    .commodityId(id)
                    .quantity(quantity)
                    .money(commodityCatalogueService.findPriceFor(id))
                    .build());
        });
        return Offer.builder()
                .offerItems(offerItemList)
                .build();
    }
}
