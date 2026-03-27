package com.spring.online_banking_spring_boot_project.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.online_banking_spring_boot_project.dao.UserDao;
import com.spring.online_banking_spring_boot_project.entity.User;
import com.spring.online_banking_spring_boot_project.validation.PasswordValidation;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private HttpSession httpSession;

	@PostMapping(value = "/saveUser")
	public User saveUserController(@RequestBody User user) {

		if (PasswordValidation.isValidPassword(user.getPassword())) {
			user.setPassword(Base64.getEncoder().encodeToString(user.getPassword().getBytes()));
			return userDao.saveUserDao(user);
		} else {
			return null;
		}
	}

	@GetMapping(value = "/loginUser/{email}/{password}")
	public ResponseEntity<String> loginUserController(@PathVariable(value = "email") String userEmail,
			@PathVariable(value = "password") String userPassword) {

		User user = userDao.findUserByEmailDao(userEmail);

		if (user != null) {

			byte[] decodedBytes = Base64.getDecoder().decode(user.getPassword());

			String originalPassword = new String(decodedBytes);

			if (originalPassword.equals(userPassword)) {

				httpSession.setAttribute("userSession", userEmail);

				return new ResponseEntity<String>("login success", HttpStatusCode.valueOf(200));
			}

		}

		return new ResponseEntity<String>("check your user and password", HttpStatusCode.valueOf(404));
	}

	@GetMapping(value = "/logoutUser")
	public ResponseEntity<String> loginUserController() {
		String email = (String) httpSession.getAttribute("userSession");
		if (email != null) {
			httpSession.invalidate();
			return new ResponseEntity<String>("logout success", HttpStatusCode.valueOf(200));
		}
		return new ResponseEntity<String>("first login then logout", HttpStatusCode.valueOf(404));
	}
}
