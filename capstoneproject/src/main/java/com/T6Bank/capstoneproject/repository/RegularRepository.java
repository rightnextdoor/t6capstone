package com.T6Bank.capstoneproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.T6Bank.capstoneproject.models.BankAccount;
import com.T6Bank.capstoneproject.models.RegularIRA;

@Repository
public interface RegularRepository extends JpaRepository<RegularIRA, Long>{
	void save(BankAccount targetAccount);
}
