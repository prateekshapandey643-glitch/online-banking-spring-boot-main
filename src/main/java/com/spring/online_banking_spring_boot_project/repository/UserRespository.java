package com.spring.online_banking_spring_boot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.online_banking_spring_boot_project.entity.User;

public interface UserRespository extends JpaRepository<User, Integer> {

	User findByEmail(String userEmail);
}
