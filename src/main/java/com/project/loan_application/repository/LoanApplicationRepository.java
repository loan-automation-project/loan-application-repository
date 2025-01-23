package com.project.loan_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loan_application.entity.LoanApplicationEntity;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationEntity , Long>{
	

}
