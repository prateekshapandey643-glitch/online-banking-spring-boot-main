package com.spring.online_banking_spring_boot_project.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.online_banking_spring_boot_project.dao.AccountDao;
import com.spring.online_banking_spring_boot_project.entity.Account;
import com.spring.online_banking_spring_boot_project.repository.AccountRepository;

@Repository
public class AccountDaoImpl implements AccountDao{

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account saveAccountDao(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account findAccountByAccountNumber(Long accountNumber) {
		return accountRepository.findByAccountNumber(accountNumber);
	}

}
