package com.example.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.User;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.RegisterService;


@Service(value = "registerServiceImpl")
@Transactional
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDto registerUser(UserDto userDto) {
		User newUser = new User();
		newUser.setLogin(userDto.getLogin());
		newUser.setPassword(userDto.getPassword());
		
		User createdUser = userRepository.save(newUser);
		
		UserDto createdUserDto = new UserDto();
		createdUserDto.setLogin(createdUser.getLogin());
		createdUserDto.setPassword(createdUser.getPassword());
		
		return createdUserDto;
	}

}
