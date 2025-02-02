package com.project.loan_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.loan_application.entity.LoanApplicationEntity;
import com.project.loan_application.pojo.ApplicationPojo;
import com.project.loan_application.service.LoanApplicationService;

@RestController
@RequestMapping("/application")
//@CrossOrigin(origins="http://localhost:5173")
public class LoanApplicationController {

	@Autowired
	LoanApplicationService loanApplicationService;
	
	@PostMapping
	public ResponseEntity<LoanApplicationEntity> addALoanApplication(
			@RequestHeader("X-Username") String username,
			@RequestBody LoanApplicationEntity application){
		
		return new ResponseEntity<LoanApplicationEntity>(loanApplicationService.addLoanApplication(username,application) , HttpStatus.OK);
		
	}
	
	@GetMapping
	public ResponseEntity<List<LoanApplicationEntity>> getAllLoanApplication(){
		return new ResponseEntity<List<LoanApplicationEntity>>(loanApplicationService.getAllLoanApplication() , HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LoanApplicationEntity> getALoanApplication(@PathVariable Long id){
		return new ResponseEntity<LoanApplicationEntity>(loanApplicationService.getALoanApplication(id) , HttpStatus.OK);
	}
	
	@GetMapping("/pending")
	public ResponseEntity<List<ApplicationPojo>> getAllLoanApplicationPending(){
		return new ResponseEntity<List<ApplicationPojo>>(loanApplicationService.getLoanApp() , HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteALoanApplication(@PathVariable Long id){
		loanApplicationService.deleteAApplication(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public ResponseEntity<Integer> getAllLoanApplicationCount(){
		return new ResponseEntity<Integer>(loanApplicationService.getAllLoanApplication().size() , HttpStatus.OK);
	}
	
	@GetMapping("/pending/count")
	public ResponseEntity<Integer> getAllPendingApplicationCount(){
		return new ResponseEntity<Integer>(loanApplicationService.getLoanApp().size() , HttpStatus.OK);
	}
	
	@GetMapping("/latest")
	public ResponseEntity<LoanApplicationEntity> getLatestLoanApplication() {
		LoanApplicationEntity latest = loanApplicationService.getLatestApplication();
		if (latest != null) {
			return ResponseEntity.ok(latest);
		}
		return ResponseEntity.notFound().build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
