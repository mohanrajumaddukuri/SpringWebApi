package com.myprojects.controller;


import java.util.Arrays;
import java.util.List;

import com.myprojects.configuration.MyConfiguration;
import com.myprojects.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private MyConfiguration myConfiguration;
	@Value("${env.running}")
	private String env;
	
	@RequestMapping("/customers")
	public List<Customer> retriveCustomers(){
		return Arrays.asList(
				new Customer(1,"sai","delhi"),
				new Customer(2,"siva","pune")
				);
	}
	
	@RequestMapping("/currency-config")
	public MyConfiguration retriveConfInfo() {
		return myConfiguration;
	}
	
}
