package com.spring.online_banking_spring_boot_project.entity;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq_gen")
	@SequenceGenerator(name = "transaction_seq_gen", sequenceName = "transaction_sequence", initialValue = 1000000, allocationSize = 1)
	private long transationid;
	private String transactionType;
	private double amount;
	@UpdateTimestamp
	private LocalDate timestamp;
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name = "accountid")
	private Account account;
	
}
