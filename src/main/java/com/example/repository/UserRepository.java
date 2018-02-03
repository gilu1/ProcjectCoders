package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
