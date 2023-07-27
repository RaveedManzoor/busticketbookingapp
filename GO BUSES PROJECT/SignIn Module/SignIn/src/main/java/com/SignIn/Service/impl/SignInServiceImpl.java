package com.SignIn.Service.impl;

import com.SignIn.Service.SignInService;
import com.SignIn.entity.SignIn;
import com.SignIn.payload.SignInDto;
import com.SignIn.repository.signinrepository;
import org.springframework.stereotype.Service;

@Service
public class SignInServiceImpl implements SignInService {
    private signinrepository signinrepo;

    public SignInServiceImpl(signinrepository signinrepo) {
        this.signinrepo = signinrepo;
    }

    @Override
    public SignInDto CreateSignIn(SignInDto dto) {
        SignIn eo = new SignIn();
      eo.setEmail_Address(dto.getEmail_Address());
     eo.setPassword(dto.getPassword());
        SignIn eoo= signinrepo.save(eo);
        SignInDto sdto = new SignInDto();
        sdto.setEmail_Address(eoo.getEmail_Address());
        sdto.setPassword(eoo.getPassword());
        return sdto;
    }
}
