package com.ByTicket.controller;

import com.ByTicket.payload.BuyTicketsDto;
import com.ByTicket.service.impl.BuyTicketsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buytickets")
public class BuyTicketsController {
    private BuyTicketsServiceImpl buyimpl;

    public BuyTicketsController(BuyTicketsServiceImpl buyimpl) {
        this.buyimpl = buyimpl;
    }
    @PostMapping
    public ResponseEntity<BuyTicketsDto> BuyTicket(@RequestBody BuyTicketsDto dtoo)
    {
        BuyTicketsDto dtos = buyimpl.Create(dtoo);
        return new ResponseEntity<>(dtos, HttpStatus.CREATED);

    }
}
