package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.RegisterService;

@RestController
@RequestMapping("/api/user")
public class RegisterController {

	@Autowired
	@Qualifier("registerServiceImpl")
	private RegisterService registerService;
	
	@RequestMapping(value = "/register", method= RequestMethod.POST)
	void registerUser(@RequestBody UserDto userDto) {
	   UserDto user = registerService.registerUser(userDto);
	   System.out.println(user);
	}
	
}
