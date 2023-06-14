package com.smalaca.cart.command.domain.offert;

import com.smalaca.cart.command.domain.vo.Money;

import java.util.UUID;

public interface CommodityCatalogueService {

    Money findPriceFor(UUID id);
}
