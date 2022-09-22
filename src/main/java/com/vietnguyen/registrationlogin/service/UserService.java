package com.vietnguyen.registrationlogin.service;

import com.vietnguyen.registrationlogin.model.User;
import com.vietnguyen.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
