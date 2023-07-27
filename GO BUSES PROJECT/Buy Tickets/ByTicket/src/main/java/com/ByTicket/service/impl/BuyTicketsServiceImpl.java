package com.ByTicket.service.impl;

import com.ByTicket.entity.BuyTickets;
import com.ByTicket.payload.BuyTicketsDto;
import com.ByTicket.repository.BusTicketsRepository;
import com.ByTicket.service.BuyTicketsService;
import org.springframework.stereotype.Service;

@Service
public class BuyTicketsServiceImpl implements BuyTicketsService {
    private BusTicketsRepository busrepo;

    public BuyTicketsServiceImpl(BusTicketsRepository busrepo) {
        this.busrepo = busrepo;
    }

    @Override
    public BuyTicketsDto Create(BuyTicketsDto dto) {
        BuyTickets bo = new BuyTickets();
        bo.setBusfrom(dto.getBusfrom());
        bo.setBusto(dto.getBusto());
        BuyTickets bo2 = busrepo.save(bo);
        BuyTicketsDto dto4 = new BuyTicketsDto();
        dto4.setBusfrom(bo2.getBusfrom());
        dto4.setBusto(bo2.getBusto());
        return dto4;

    }
}
