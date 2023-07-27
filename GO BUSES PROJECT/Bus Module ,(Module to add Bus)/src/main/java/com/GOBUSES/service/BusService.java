package com.GOBUSES.service;

import com.GOBUSES.payload.BusDTO;

import java.util.List;

public interface BusService {
    BusDTO createBus (BusDTO dto);

    BusDTO UpdateTravellerDeailsByIdNumber(BusDTO dto, long id);

    List<BusDTO> getallthepassengerdatails();
}
