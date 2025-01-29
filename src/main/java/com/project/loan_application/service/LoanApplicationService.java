package com.project.loan_application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.loan_application.entity.LoanApplicationEntity;
import com.project.loan_application.exception.ApplicationNotFoundException;
import com.project.loan_application.repository.LoanApplicationRepository;
import com.project.loan_application.dto.CustomerDTO;
import com.project.loan_application.client.CustomerClient;

@Service
public class LoanApplicationService {
	private static final Logger log = LoggerFactory.getLogger(LoanApplicationService.class);
	
	@Autowired
	LoanApplicationRepository LoanApplicationRepo;
	
	@Autowired
	private CustomerClient customerClient;
	
	public LoanApplicationEntity addLoanApplication(LoanApplicationEntity application, Long userId) {
		try {
			// Get customer details using userId
			CustomerDTO customer = customerClient.getCustomerByUserId(userId);
			application.setCustomerId(customer.getCustomerId());
			application.setUserId(userId);
			return LoanApplicationRepo.save(application);
		} catch (Exception e) {
			log.error("Error while creating loan application: {}", e.getMessage());
			throw new RuntimeException("Customer not found for user: " + userId);
		}
	}


	public LoanApplicationEntity getALoanApplication(Long ApplicationId) {
		Optional<LoanApplicationEntity> opt = LoanApplicationRepo.findById(ApplicationId);

		if(opt.isPresent()) {
			return opt.get();
		}else{
			throw new ApplicationNotFoundException("Application with Id " + ApplicationId + " does not exist");
		}
	}


	public List<LoanApplicationEntity> getAllLoanApplication(){
		return LoanApplicationRepo.findAll();
		
	}
	public void deleteAApplication(Long ApplicationId) {
		LoanApplicationRepo.deleteById(ApplicationId);
	}



//	public CustomerPojo getACustomerByApplicationId(Long ApplicationId) {
//
//		return null;
//	}
	

	public List<LoanApplicationEntity> getLoansByCustomerId(Long customerId) {
		return LoanApplicationRepo.findByCustomerId(customerId);
	}

}
