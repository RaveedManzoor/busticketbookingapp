package com.GOBUSES.service.impl;

import com.GOBUSES.entity.Bus;
import com.GOBUSES.payload.BusDTO;
import com.GOBUSES.repository.BusRepository;
import com.GOBUSES.service.BusService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BusServiceImpl implements BusService {
   private BusRepository busrepo;

    public BusServiceImpl(BusRepository busrepo) {
        this.busrepo = busrepo;
    }

    @Override    //save bus details
    public BusDTO createBus(BusDTO dto) {

        Bus eo = new Bus();
        eo.setBusTo(dto.getBusTo());
        eo.setBusFrom(dto.getBusFrom());
        eo.setBusName(dto.getBusName());
        eo.setBusNumber(dto.getBusNumber());
        eo.setArrivalDate(dto.getArrivalDate());
        eo.setDepartureDate(dto.getDepartureDate());
        eo.setTraveller(dto.getTraveller());
        Bus bo = busrepo.save(eo);
        BusDTO bdto = new BusDTO();
        bdto.setTraveller(bo.getTraveller());
        bdto.setBusTo(bo.getBusTo());
        bdto.setBusFrom(bo.getBusFrom());
        bdto.setBusName(bo.getBusName());
        bdto.setArrivalDate(bo.getArrivalDate());
        bdto.setDepartureDate(bo.getDepartureDate());
        bdto.setTraveller(bo.getTraveller());
        bdto.setBusNumber(bo.getBusNumber());
        return bdto;
    }

    @Override  //update details
    public BusDTO UpdateTravellerDeailsByIdNumber(BusDTO dto, long id) {
        Optional<Bus> byId = busrepo.findById(id);
        Bus bo = byId.get();
        bo.setBusNumber(dto.getBusNumber());
        bo.setTraveller(dto.getTraveller());
        bo.setBusFrom(dto.getBusFrom());
        bo.setBusName(dto.getBusName());
        bo.setBusTo(dto.getBusTo());
        bo.setDepartureDate(dto.getDepartureDate());
        bo.setArrivalDate(dto.getArrivalDate());
        Bus bo3 = busrepo.save(bo);
        BusDTO boo = new BusDTO();
        boo.setBusNumber(bo3.getBusNumber());
        boo.setTraveller(bo3.getTraveller());
        boo.setBusFrom(bo3.getBusFrom());
        boo.setBusName(bo3.getBusName());
        boo.setBusTo(bo3.getBusTo());
        boo.setDepartureDate(bo3.getDepartureDate());
        boo.setArrivalDate(bo3.getArrivalDate());

        return boo;
    }

    @Override
    public List<BusDTO> getallthepassengerdatails() {
        List<Bus> all = busrepo.findAll();
        List<BusDTO> records = all.stream().map(x -> maptodto(x)).collect(Collectors.toList());


        return records;
    }

    public void deleterecbyid(long id) {                                //delete traveller
        busrepo.deleteById(id);
        return;
    }
BusDTO maptodto(Bus bus)
{
    BusDTO busDTO = new BusDTO();
    busDTO.setBusFrom(bus.getBusFrom());
    busDTO.setBusNumber(bus.getBusNumber());
    busDTO.setBusName(bus.getBusName());
    busDTO.setBusTo(bus.getBusTo());
    busDTO.setTraveller(bus.getTraveller());
    busDTO.setArrivalDate(bus.getArrivalDate());
    busDTO.setDepartureDate(bus.getDepartureDate());
    return busDTO;


}
}