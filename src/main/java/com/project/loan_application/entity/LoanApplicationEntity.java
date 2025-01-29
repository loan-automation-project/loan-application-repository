package com.project.loan_application.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loan_application_entity")
public class LoanApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth; 

    @Column(name = "gender")
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "contact_info")
    private String contactInfo;

    @Column(name = "address")
    private String address;
    
    @Column(name = "annual_salary")
    private Long annualSalary;

    @ElementCollection
    @CollectionTable(name = "employment_details", joinColumns = @JoinColumn(name = "loan_id"))
    @Column(name = "employment_detail")
    private List<String> employmentDetails;


    @ElementCollection
    @CollectionTable(name = "references_list", joinColumns = @JoinColumn(name = "loan_id"))
    @Column(name = "reference")
    private List<List<String>> references;

    @Column(name = "loan_amount")
    private Long loanAmount;
    
    @Column(name = "customer_id")
    private Long customerId;
    
    @Column(name = "user_id")
    private Long userId;

    public LoanApplicationEntity() {
    }

    public LoanApplicationEntity(Long loanId, String loanType, String fullName, LocalDate dateOfBirth, String gender, String maritalStatus, String contactInfo, String address, Long annualSalary, List<String> employmentDetails, List<List<String>> references, Long loanAmount, Long customerId, Long userId) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.contactInfo = contactInfo;
        this.address = address;
        this.annualSalary = annualSalary;
        this.employmentDetails = employmentDetails;
        this.references = references;
        this.loanAmount = loanAmount;
        this.customerId = customerId;
        this.userId = userId;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Long getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Long annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(List<String> employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public List<List<String>> getReferences() {
        return references;
    }

    public void setReferences(List<List<String>> references) {
        this.references = references;
    }

    public Long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
