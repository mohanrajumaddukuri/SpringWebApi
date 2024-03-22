package com.myprojects.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.myprojects.controller","com.myprojects.configuration",
		"com.myprojects.service"})
public class RestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(RestMain.class, args);

	}

}
