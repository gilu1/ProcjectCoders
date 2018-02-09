package com.example.demo.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	User findByLoginAndPassword(String login, String password);

}
