package com.spring.online_banking_spring_boot_project.validation;

import org.springframework.stereotype.Component;

@Component
public class PasswordValidation {

	
	public static boolean isValidPassword(String password) {
	    String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\w\\s]).{8,15}$";
	    return password != null && password.matches(pattern);
	}
}
