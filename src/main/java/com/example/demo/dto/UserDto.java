package com.example.demo.dto;

public class UserDto {

	private String name;
	private String lastName;
	private String email;
	private String option;
	private String login;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserDto(){
		
	}
	
	public UserDto(String name, String lastName, String email, String option, String login, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.option = option;
		this.login = login;
		this.password = password;
	}
	
	
}
