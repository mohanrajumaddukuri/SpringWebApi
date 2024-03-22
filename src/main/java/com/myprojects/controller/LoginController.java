package com.myprojects.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.myprojects.service.AuthenticateService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private Logger logger=LoggerFactory.getLogger(getClass());
	
//	@RequestMapping("/login")
//	public String loginPage() {
//		return "login";
//	}
	
	@Autowired
	public AuthenticateService authenticateService;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String WelcomePage(@RequestParam String name,@RequestParam String password,
			ModelMap model) {
		if(authenticateService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("errMsg", "Invalid credentials! please try again");
		return "login";
	}
}
