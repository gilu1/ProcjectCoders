package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.User;
import com.example.demo.convert.Converter;
import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.HashService;
import com.example.demo.service.LoginService;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("userConverterImpl")
	private Converter<User, UserDto> userConverter;
	
	@Autowired
	@Qualifier("hashServiceImpl")
	private HashService hashService;

	@Override
	public UserDto loginAndGetUser(LoginDto loginDto) {
		
		loginDto.setPassword(hashService.encode(loginDto.getPassword()));
		User user = userRepository.findByLoginAndPassword(loginDto.getLogin(), loginDto.getPassword());
		if (user != null) {
			UserDto userDto = userConverter.convertEntityToDto(user);
			userDto.setPassword(null);
			return userDto;
		}		
		return null;
	}
}
