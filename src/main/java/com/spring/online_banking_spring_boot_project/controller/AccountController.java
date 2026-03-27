package com.spring.online_banking_spring_boot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.online_banking_spring_boot_project.dao.AccountDao;
import com.spring.online_banking_spring_boot_project.dao.BankDao;
import com.spring.online_banking_spring_boot_project.dao.UserDao;
import com.spring.online_banking_spring_boot_project.entity.Account;
import com.spring.online_banking_spring_boot_project.entity.Bank;
import com.spring.online_banking_spring_boot_project.entity.User;


@RestController
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private BankDao bankDao;
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping(value = "/saveAccount/{userId}/{bankId}")
	public Account saveAccountController(@RequestBody Account account,@PathVariable(value = "userId") Integer userId,@PathVariable(value = "bankId") Integer bankId) {
		
		User user=userDao.findUserByIdDao(userId);
		
		Bank bank = bankDao.findBankByIdDao(bankId);
		
		if(user!=null&&bank!=null) {
			
			account.setBank(bank);
			account.setUser(user);
			return accountDao.saveAccountDao(account);
		}else {
			
			return null;
		}
	}

	@GetMapping(value = "/findAccount/{accountNumber}")
	public Account findAccountByAccountNumberController(@PathVariable(name = "accountNumber") Long accountNumber) {
		return accountDao.findAccountByAccountNumber(accountNumber);
	}
}
