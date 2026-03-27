package com.spring.online_banking_spring_boot_project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq_gen")
	@SequenceGenerator(name = "account_seq_gen", sequenceName = "account_sequence", initialValue = 884466552, allocationSize = 1)
	private int accountid;
	private long accountNumber;
	private String accountType;
	private double balance;

	@ManyToOne
    @JoinColumn(name = "userid")
    private User user;
	
	@ManyToOne
    @JoinColumn(name = "bankid")
    private Bank bank;
	
	@OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private DebitCard debitCard;
}
