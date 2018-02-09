package com.example.demo.convert.impl;

import org.springframework.stereotype.Component;

import com.example.demo.User;
import com.example.demo.convert.Converter;
import com.example.demo.dto.UserDto;

@Component("userConverterImpl")
public class UserConverter implements Converter<User, UserDto>{

	@Override
	public User convertDtoToEntity(UserDto dto) {
		User user = new User();
		user.setLogin(dto.getLogin());
		user.setPassword(dto.getPassword());
		user.setEmail(dto.getEmail());
		user.setFirstName(dto.getName());
		user.setLastName(dto.getLastName());
		user.setOption(dto.getOption());
		return user;
	}

	@Override
	public UserDto convertEntityToDto(User entity) {
		UserDto userDto = new UserDto();
		userDto.setLogin(entity.getLogin());
		userDto.setPassword(entity.getPassword());
		userDto.setEmail(entity.getEmail());
		userDto.setName(entity.getFirstName());
		userDto.setLastName(entity.getLastName());
		userDto.setOption(entity.getOption());
		return userDto;
	}

}
