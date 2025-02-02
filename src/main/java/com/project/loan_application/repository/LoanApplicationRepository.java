package com.project.loan_application.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.loan_application.entity.LoanApplicationEntity;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationEntity , Long>{
    //ADDED
	@Query("SELECT new map(l.fullName as fullName, l.loanType as loanType, l.loanId as loanId) FROM LoanApplicationEntity l WHERE l.loanStatus = 'PENDING'")
    List<Map<String, Object>> findPendingApplications();
	//
	List<LoanApplicationEntity> findByLoanStatus(String status);
}
