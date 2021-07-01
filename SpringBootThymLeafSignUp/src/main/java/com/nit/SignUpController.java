package com.nit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {

	@RequestMapping("/getPage")
	public String getSignUp() {
		
		return "sign-up";
	}
	
	@RequestMapping("/sign-up")
	public String getSuccessPage(@ModelAttribute SignUpForm signUpForm , Model model) {
	
		model.addAttribute(signUpForm);
		
	return "welcome";
	}
}
