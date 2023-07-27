package com.Registration.Payload;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String title;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String company;
    private String address;
    private String townCity;
    private String postalCode;
    private String country;
    private String stateRegion;
    private String telephone;
}
