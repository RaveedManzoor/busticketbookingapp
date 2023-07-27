package com.GOBUSES.payload;

import lombok.Data;

@Data
public class BusDTO {
    private String busName;
    private String busNumber;
    private String busFrom;
    private String busTo;
    private String traveller;
    private String departureDate;
    private String arrivalDate;
}
