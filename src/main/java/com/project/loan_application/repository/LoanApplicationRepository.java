package com.project.loan_application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loan_application.entity.LoanApplicationEntity;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationEntity , Long>{
	
	List<LoanApplicationEntity> findByLoanStatus(String status);
}
