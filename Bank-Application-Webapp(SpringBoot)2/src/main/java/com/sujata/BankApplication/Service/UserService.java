package com.sujata.BankApplication.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sujata.BankApplication.Dto.UserRegistrationDto;
import com.sujata.BankApplication.Model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
