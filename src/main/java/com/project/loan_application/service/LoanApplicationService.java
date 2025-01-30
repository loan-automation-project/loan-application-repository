package com.project.loan_application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.project.loan_application.client.CustomerServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.loan_application.entity.LoanApplicationEntity;
import com.project.loan_application.exception.ApplicationNotFoundException;
import com.project.loan_application.pojo.ApplicationPojo;
import com.project.loan_application.pojo.CustomerPojo;
import com.project.loan_application.repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {
	
	@Autowired
	LoanApplicationRepository LoanApplicationRepo;

	@Autowired
	CustomerServiceClient customerServiceClient;
	
	public LoanApplicationEntity addLoanApplication(LoanApplicationEntity loanApplication) {
		return LoanApplicationRepo.saveAndFlush(loanApplication);		
	}
	
	public LoanApplicationEntity getALoanApplication(Long ApplicationId) {
		Optional opt = LoanApplicationRepo.findById(ApplicationId);
		if(opt.isPresent()) {
			LoanApplicationEntity loanApplication = (LoanApplicationEntity) opt.get();
			return loanApplication;
			
		}
		 throw new ApplicationNotFoundException("Customer with Id " + ApplicationId + "is missing");
		
	}
	
	public List<LoanApplicationEntity> getAllLoanApplication(){
		return LoanApplicationRepo.findAll();
		
	}
	public void deleteAApplication(Long ApplicationId) {
		LoanApplicationRepo.deleteById(ApplicationId);
	}
	
	public CustomerPojo getACustomerByLoanId(Long LoanId) {
		
		return null;
	}
	
	public List<ApplicationPojo> getLoanApp() {
		String status = "Pending";
		List<LoanApplicationEntity> list = LoanApplicationRepo.findByLoanStatus(status);
		List<ApplicationPojo> pojoList = new ArrayList<>();
		for(LoanApplicationEntity entity : list) {
			ApplicationPojo pojo = new ApplicationPojo();
			pojo.setLoanId(entity.getLoanId());
			pojo.setFullName(entity.getFullName());
			pojo.setLoanType(entity.getLoanType());
			pojo.setContactInfo(entity.getContactInfo());
			pojoList.add(pojo);
			
		}
		return pojoList;
	}

	
}
