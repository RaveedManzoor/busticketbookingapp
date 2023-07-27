package com.SignIn.controller;

import com.SignIn.Service.SignInService;
import com.SignIn.Service.impl.SignInServiceImpl;
import com.SignIn.payload.SignInDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/SignIn")
public class SignInController {
 private SignInServiceImpl simpl;

    public SignInController(SignInServiceImpl simpl) {
        this.simpl = simpl;
    }

    @PostMapping
    public ResponseEntity<SignInDto> CreateSignIn(@RequestBody SignInDto dto)
    {
        SignInDto dto2 = simpl.CreateSignIn(dto);
        return new ResponseEntity<>(dto2, HttpStatus.CREATED);

    }
}
