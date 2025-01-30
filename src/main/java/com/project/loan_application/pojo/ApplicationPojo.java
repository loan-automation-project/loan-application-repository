package com.project.loan_application.pojo;

public class ApplicationPojo {
	
	private Long loanId;
	
	private String fullName;
	
	private String loanType;
	
	private String contactInfo;
	
	public ApplicationPojo(){
		
	}
	
	

	public ApplicationPojo(Long loanId, String fullName, String loanType, String contactInfo) {
		super();
		this.loanId = loanId;
		this.fullName = fullName;
		this.loanType = loanType;
		this.contactInfo = contactInfo;
	}



	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	

}
