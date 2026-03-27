package com.spring.online_banking_spring_boot_project.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.online_banking_spring_boot_project.dao.BankDao;
import com.spring.online_banking_spring_boot_project.entity.Bank;
import com.spring.online_banking_spring_boot_project.repository.BankRepository;

import jakarta.persistence.EntityNotFoundException;

@Repository
public class BankDaoImpl implements BankDao {

	@Autowired
	private BankRepository bankRepository;
	
	@Override
	public Bank saveBankDao(Bank bank) {
		return bankRepository.save(bank);
	}

	@Override
	public Bank findBankByIdDao(Integer bankId) {
		return bankRepository.findById(bankId)
				.orElseThrow(()->new EntityNotFoundException("given id is not found"+bankId));
	}

}
