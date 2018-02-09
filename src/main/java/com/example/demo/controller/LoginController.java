package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/api/user")
public class LoginController {

	@Autowired
	@Qualifier("loginServiceImpl")
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	UserDto loginUser(@RequestBody LoginDto loginDto) {
		UserDto userDto = loginService.loginAndGetUser(loginDto);
		return userDto;
	}

}
