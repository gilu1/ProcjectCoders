package com.example.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.User;
import com.example.demo.convert.Converter;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.HashService;
import com.example.demo.service.RegisterService;


@Service(value = "registerServiceImpl")
@Transactional
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("userConverterImpl")
	private Converter<User, UserDto> userConverter;
	
	@Autowired
	@Qualifier("hashServiceImpl")
	private HashService hashService;
	
	@Override
	public UserDto registerUser(UserDto userDto) {
		User user = userConverter.convertDtoToEntity(userDto);
		user.setPassword(hashService.encode(userDto.getPassword()));
		User createdUser = userRepository.save(user);
		return userConverter.convertEntityToDto(createdUser);
	}

}
