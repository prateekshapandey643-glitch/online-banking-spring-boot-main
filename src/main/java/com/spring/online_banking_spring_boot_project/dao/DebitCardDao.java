package com.spring.online_banking_spring_boot_project.dao;

import com.spring.online_banking_spring_boot_project.entity.DebitCard;

public interface DebitCardDao {

	DebitCard saveDebitCardDao(DebitCard card);
	
	DebitCard getDebitCardByCardNumberDao(Long cardNumber);
	
}
