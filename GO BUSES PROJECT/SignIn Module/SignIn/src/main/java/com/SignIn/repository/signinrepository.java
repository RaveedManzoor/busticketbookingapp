package com.SignIn.repository;

import com.SignIn.entity.SignIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface signinrepository extends JpaRepository<SignIn,Long> {
}
