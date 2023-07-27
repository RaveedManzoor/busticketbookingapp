package com.Registration.Controller;

import com.Registration.Payload.RegisterUserDto;
import com.Registration.Service.impl.RegisterUserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/registerUser")
@RestController
public class RegistrationUserController {
    private RegisterUserServiceImpl rusimpl;

    public RegistrationUserController(RegisterUserServiceImpl rusimpl) {
        this.rusimpl = rusimpl;
    }
    @PostMapping
    public ResponseEntity<RegisterUserDto> CreateUser(@RequestBody RegisterUserDto dto)
    {
        RegisterUserDto dto5 = rusimpl.CreateUser(dto);
        return new ResponseEntity<>(dto5,HttpStatus.CREATED);

    }
}
