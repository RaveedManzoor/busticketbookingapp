package com.Registration.Service;

import com.Registration.Payload.RegisterUserDto;

public interface RegisterUserService {
    RegisterUserDto CreateUser(RegisterUserDto dto);
}
