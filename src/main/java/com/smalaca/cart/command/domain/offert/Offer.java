package com.smalaca.cart.command.domain.offert;

import lombok.Builder;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.List;

@Builder
public class Offer extends AbstractAggregateRoot<Offer> {

    private List<OfferItem> offerItems;

    public List<OfferItem> getOfferItems() {

        return offerItems;
    }
}
