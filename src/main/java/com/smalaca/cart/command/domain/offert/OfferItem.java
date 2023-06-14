package com.smalaca.cart.command.domain.offert;

import com.smalaca.cart.command.domain.vo.Money;
import com.smalaca.cart.command.domain.vo.Quantity;
import lombok.Builder;

import java.util.UUID;

@Builder
public class OfferItem {

    private UUID commodityId;
    private Quantity quantity;
    private Money money;



}
