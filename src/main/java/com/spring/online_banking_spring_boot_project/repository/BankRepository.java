package com.spring.online_banking_spring_boot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.online_banking_spring_boot_project.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}
