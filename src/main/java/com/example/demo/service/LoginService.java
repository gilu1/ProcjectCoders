package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;

public interface LoginService {
	
	UserDto loginAndGetUser(LoginDto loginDto);

}
