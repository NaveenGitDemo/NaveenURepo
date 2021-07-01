package com.nit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getPage() {
		
		return "Home.html";
	}
	
	@RequestMapping("/login")
	public String logInPage() {
		return "login.html";
	}
	
	@RequestMapping("/logout-success")
	public String logOutPage() {
		return "logout.html";
	}
}
