package com.example.demo.convert;

public interface Converter<T, H> {
	
	T convertDtoToEntity(H dto);
	
	H convertEntityToDto(T entity);
}
