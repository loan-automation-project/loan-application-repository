package com.project.loan_application.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.loan_application.entity.LoanApplicationEntity;
import com.project.loan_application.pojo.ApplicationPojo;
import com.project.loan_application.service.LoanApplicationService;

@RestController
@RequestMapping("/application")
@CrossOrigin(origins="http://localhost:5173")
public class LoanApplicationController {

	@Autowired
	LoanApplicationService loanApplicationService;
	
	@PostMapping("")
	public ResponseEntity<LoanApplicationEntity> addALoanApplication(@RequestBody LoanApplicationEntity application){
		
		return new ResponseEntity<LoanApplicationEntity>(loanApplicationService.addLoanApplication(application) , HttpStatus.OK);
		
	}
	
	@GetMapping("")
	public ResponseEntity<List<LoanApplicationEntity>> getAllLoanApplication(){
		return new ResponseEntity<List<LoanApplicationEntity>>(loanApplicationService.getAllLoanApplication() , HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LoanApplicationEntity> getALoanApplication(@PathVariable Long id){
		return new ResponseEntity<LoanApplicationEntity>(loanApplicationService.getALoanApplication(id) , HttpStatus.OK);
	}
	
//	@GetMapping("/pending")
//	public ResponseEntity<List<ApplicationPojo>> getAllLoanApplicationPending(){
//		return new ResponseEntity<List<ApplicationPojo>>(loanApplicationService.getLoanApp() , HttpStatus.OK);
//	}
	
	//ADDED
    @GetMapping("/pending")
    public ResponseEntity<List<Map<String, Object>>> getPendingApplications() {
        List<Map<String, Object>> pendingApplications = loanApplicationService.getPendingApplications();
        return ResponseEntity.ok(pendingApplications);
    }
    //
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
