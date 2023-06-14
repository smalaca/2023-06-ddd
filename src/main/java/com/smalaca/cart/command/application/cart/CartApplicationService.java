package com.smalaca.cart.command.application.cart;

import com.smalaca.cart.adapter.rest.cart.SelectedItemDTO;
import com.smalaca.cart.command.domain.cart.Cart;
import com.smalaca.cart.command.domain.cart.CartRepository;
import com.smalaca.cart.command.domain.offer.Offer;
import com.smalaca.cart.command.domain.offer.OfferRepository;
import com.smalaca.cart.command.domain.offer.SelectedItem;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class CartApplicationService {
    private final CartRepository cartRepository;
    private final OfferRepository offerRepository;

    public CartApplicationService(CartRepository cartRepository, OfferRepository offerRepository) {
        this.cartRepository = cartRepository;
        this.offerRepository = offerRepository;
    }

    public void addCommodity(UUID cartId, UUID commodityId, int quantity) {
        // tłumaczenie 0-*
        Cart cart = cartRepository.findBy(cartId);

        // kontakt z domeną = 1
        cart.add(commodityId, quantity);

        // zapis 0-*
        cartRepository.save(cart);
    }

    public Offer confirmCartRequest(UUID cartId, List<SelectedItemDTO> selectedItems) {
        // tłumaczenie 0-*
        Cart cart = cartRepository.findBy(cartId);

        // kontakt z domeną = 1
        Offer offer = cart.generateOffer(mapRestToModel(selectedItems));


        // zapis 0-*
        offerRepository.save(offer);
        return offer;
    }

    private List<SelectedItem> mapRestToModel(List<SelectedItemDTO> input) {
        return input.stream()
                .map(in -> new SelectedItem(in.getCommodityId(), in.getQuantity()))
                .collect(Collectors.toList());
    }
}
