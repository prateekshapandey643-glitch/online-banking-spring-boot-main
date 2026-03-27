package com.spring.online_banking_spring_boot_project.dao;

import com.spring.online_banking_spring_boot_project.entity.Account;

public interface AccountDao {

	Account saveAccountDao(Account account);
	
	Account findAccountByAccountNumber(Long accountNumber);
	
	
}
