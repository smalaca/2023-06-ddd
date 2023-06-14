package com.smalaca.cart.adapter.rest.offer;

import com.smalaca.cart.adapter.rest.cart.ConfirmCartRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class RestOfferController {
    private final OfferApplicationService cartApplicationService;

    public RestOfferController(OfferApplicationService cartApplicationService) {
        this.cartApplicationService = cartApplicationService;
    }

    @PostMapping
    public void confirmCartRequest(@RequestBody ConfirmCartRequest request) {
        cartApplicationService.confirmCartRequest(request.getCartId(), request.getSelectedItems());
    }
}
