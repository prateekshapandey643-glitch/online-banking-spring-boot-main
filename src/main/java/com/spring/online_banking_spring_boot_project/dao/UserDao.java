package com.spring.online_banking_spring_boot_project.dao;

import com.spring.online_banking_spring_boot_project.entity.User;

public interface UserDao {

	User saveUserDao(User user);
	
	User findUserByIdDao(Integer userId);
	
	User findUserByEmailDao(String userEmail);
}
