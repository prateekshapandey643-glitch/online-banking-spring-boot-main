package com.spring.online_banking_spring_boot_project.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.online_banking_spring_boot_project.dao.DebitCardDao;
import com.spring.online_banking_spring_boot_project.entity.DebitCard;
import com.spring.online_banking_spring_boot_project.repository.DebitCardRepository;

import jakarta.persistence.EntityNotFoundException;

@Repository
public class DebitCardImpl implements DebitCardDao{

	@Autowired
	private DebitCardRepository cardRepository;
	
	@Override
	public DebitCard saveDebitCardDao(DebitCard card) {
		return cardRepository.save(card);
	}

	@Override
	public DebitCard getDebitCardByCardNumberDao(Long cardNumber) {
		
		return cardRepository.findById(cardNumber)
				.orElseThrow(()->new EntityNotFoundException("card not found"+cardNumber));
	}

}
