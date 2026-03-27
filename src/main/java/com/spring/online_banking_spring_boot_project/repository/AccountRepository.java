package com.spring.online_banking_spring_boot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.online_banking_spring_boot_project.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	Account findByAccountNumber(Long accountNumber);
	
}
