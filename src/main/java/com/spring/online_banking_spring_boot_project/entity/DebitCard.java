package com.spring.online_banking_spring_boot_project.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DebitCard {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card_seq_gen")
	@SequenceGenerator(name = "card_seq_gen", sequenceName = "card_sequence", initialValue = 243243987, allocationSize = 1)
	private long cardnumber;
	private LocalDate expirydate;
	private int cvv;
	private LocalDate issuedate;

	@OneToOne
	@JoinColumn(name = "accountid")
	private Account account;
}
