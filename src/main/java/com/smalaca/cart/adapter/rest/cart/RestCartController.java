package com.smalaca.cart.adapter.rest.cart;

import com.smalaca.cart.command.application.cart.CartApplicationService;
import com.smalaca.cart.command.domain.offer.Offer;
import com.smalaca.cart.query.cart.CartQueries;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class RestCartController {
    private final CartApplicationService cartApplicationService;
    private final CartQueries cartQueries;

    public RestCartController(CartApplicationService cartApplicationService, CartQueries cartQueries) {
        this.cartApplicationService = cartApplicationService;
        this.cartQueries = cartQueries;
    }

    @PutMapping
    public void addCommodity(@RequestBody AddCommodityRequest request) {
        cartApplicationService.addCommodity(request.getCartId(), request.getCommodityId(), request.getQuantity());
    }

    @PostMapping
    public Offer confirmCartRequest(@RequestBody ConfirmCartRequest request) {
        return cartApplicationService.confirmCartRequest(request.getCartId(), request.getSelectedItems());
    }
}
