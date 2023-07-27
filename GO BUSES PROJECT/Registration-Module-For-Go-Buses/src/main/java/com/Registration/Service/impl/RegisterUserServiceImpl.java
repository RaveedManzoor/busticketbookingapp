package com.Registration.Service.impl;

import com.Registration.Entity.RegisterUser;
import com.Registration.Payload.RegisterUserDto;
import com.Registration.Repository.RegisterUserRepository;
import com.Registration.Service.RegisterUserService;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {
private RegisterUserRepository rur;

    public RegisterUserServiceImpl(RegisterUserRepository rur) {
        this.rur = rur;
    }

    @Override
    public RegisterUserDto CreateUser(RegisterUserDto dto) {
        RegisterUser ru = new RegisterUser();
         ru.setTitle(dto.getTitle());
        ru.setFirstName(dto.getFirstName());
        ru.setLastName(dto.getLastName());
        ru.setEmailAddress(dto.getEmailAddress());
        ru.setPassword(dto.getPassword());
        ru.setCompany(dto.getCompany());
        ru.setAddress(dto.getAddress());
        ru.setTownCity(dto.getTownCity());
        ru.setPostalCode(dto.getPostalCode());
        ru.setCountry(dto.getPostalCode());
        ru.setStateRegion(dto.getStateRegion());
        ru.setTelephone(dto.getTelephone());
        RegisterUser eo = rur.save(ru);
        RegisterUserDto rudto = new RegisterUserDto();
        rudto.setTitle(eo.getTitle());
        rudto.setFirstName(eo.getFirstName());
        rudto.setLastName(eo.getLastName());
        rudto.setEmailAddress(eo.getEmailAddress());
        rudto.setPassword(eo.getPassword());
        rudto.setCompany(eo.getCompany());
        rudto.setAddress(eo.getAddress());
        rudto.setTownCity(eo.getTownCity());
        rudto.setPostalCode(eo.getPostalCode());
        rudto.setCountry(eo.getPostalCode());
        rudto.setStateRegion(eo.getStateRegion());
        rudto.setTelephone(eo.getTelephone());
        return rudto;

    }
}
