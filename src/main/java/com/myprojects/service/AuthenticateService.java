package com.myprojects.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
	
	public boolean authenticate(String userName,String passWord) {
		boolean isValidUser=userName.equalsIgnoreCase("mohan");
		boolean isValidPassword=passWord.equals("Mohan123");
		return isValidUser && isValidPassword;
	}

}
