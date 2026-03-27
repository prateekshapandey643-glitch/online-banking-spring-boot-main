package com.spring.online_banking_spring_boot_project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

	@Id
	// @JsonProperty(value = "bankid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_seq_gen")
	@SequenceGenerator(name = "bank_seq_gen", sequenceName = "bank_sequence", initialValue = 9999, allocationSize = 1)
	private int id;
	private String name;
	private String branch;
	private String address;
	private long phone;

	@OneToMany(mappedBy = "bank")
	private List<Account> accounts;
}
