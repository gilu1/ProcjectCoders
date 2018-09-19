package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan
public class ProcjectCodersApplication {

	//dupa
	public static void main(String[] args) {
		SpringApplication.run(ProcjectCodersApplication.class, args);
	}
}
