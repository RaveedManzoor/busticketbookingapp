package com.SignIn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignIn {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    private String Email_Address;
    private String Password;

}
