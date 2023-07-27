package com.GOBUSES.controller;

import com.GOBUSES.payload.BusDTO;
import com.GOBUSES.service.impl.BusServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gobuses")
public class BusController {
    private BusServiceImpl busimpl;

    public BusController(BusServiceImpl busimpl) {
        this.busimpl = busimpl;
    }
    @PostMapping
    public ResponseEntity<BusDTO> CreateBusInDb(@RequestBody  BusDTO dto)
    {
        BusDTO busdt01 = busimpl.createBus(dto);
        return new ResponseEntity<>(busdt01, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> DeleteRecordById(@PathVariable("id") long id)
    {
        busimpl.deleterecbyid(id);
      return new ResponseEntity<>("record deleted sucessfully",HttpStatus.OK);

    }
    @PutMapping("/{id}")
    public ResponseEntity<BusDTO> UpdateTravellerDetails(@RequestBody BusDTO dto,@PathVariable("id") long id)
    {
        BusDTO dto2=busimpl.UpdateTravellerDeailsByIdNumber(dto,id);
        return new ResponseEntity<>(dto2,HttpStatus.CREATED);
    }
        @GetMapping
       public List<BusDTO> GetAllThePassengerRecords()
        {
           List<BusDTO> dtos= busimpl.getallthepassengerdatails();
           return dtos;
        }


}
