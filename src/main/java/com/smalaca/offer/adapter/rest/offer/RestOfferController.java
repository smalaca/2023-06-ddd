package com.smalaca.offer.adapter.rest.offer;

import com.smalaca.offer.command.application.OfferApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/offer")
public class RestOfferController {

    private final OfferApplicationService applicationService;

    public RestOfferController(OfferApplicationService applicationService) {
        this.applicationService = applicationService;
    }
    @PostMapping
    public void createOffer(@RequestBody CreateOfferRequest request) {
        Map<UUID, Integer> cartItems = request.getCartItems();
        applicationService.createOffer(cartItems);
    }
}
