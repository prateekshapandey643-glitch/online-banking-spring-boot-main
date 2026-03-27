package com.spring.online_banking_spring_boot_project.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.online_banking_spring_boot_project.dao.UserDao;
import com.spring.online_banking_spring_boot_project.entity.User;
import com.spring.online_banking_spring_boot_project.repository.UserRespository;

import jakarta.persistence.EntityNotFoundException;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRespository repository;

	@Override
	public User saveUserDao(User user) {
		return repository.save(user);
	}

	@Override
	public User findUserByIdDao(Integer userId) {
		
		return repository.findById(userId)
				.orElseThrow(()-> new EntityNotFoundException("given id is not found "+userId));
	}

	@Override
	public User findUserByEmailDao(String userEmail) {
		return repository.findByEmail(userEmail);
	}

}
