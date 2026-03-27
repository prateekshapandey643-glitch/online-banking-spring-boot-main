package com.spring.online_banking_spring_boot_project.dao;

import com.spring.online_banking_spring_boot_project.entity.Bank;

public interface BankDao {

	Bank saveBankDao(Bank bank);
	
	Bank findBankByIdDao(Integer bankId);
}
