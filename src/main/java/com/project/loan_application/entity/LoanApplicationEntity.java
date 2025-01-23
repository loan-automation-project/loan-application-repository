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

    @ElementCollection
    @CollectionTable(name = "employment_details", joinColumns = @JoinColumn(name = "loan_id"))
    @Column(name = "employment_detail")
    private List<String> employmentDetails;

    @ElementCollection
    @CollectionTable(name = "financial_info", joinColumns = @JoinColumn(name = "loan_id"))
    @Column(name = "financial_detail")
    private List<String> financialInfo;

    @ElementCollection
    @CollectionTable(name = "assets", joinColumns = @JoinColumn(name = "loan_id"))
    @Column(name = "asset")
    private List<String> assets;

    @ElementCollection
    @CollectionTable(name = "references", joinColumns = @JoinColumn(name = "loan_id"))
    @Column(name = "reference")
    private List<String> references;

    @Column(name = "loan_amount")
    private Double loanAmount;

//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public List<String> getFinancialInfo() {
        return financialInfo;
    }

    public void setFinancialInfo(List<String> financialInfo) {
        this.financialInfo = financialInfo;
    }

    public List<String> getAssets() {
        return assets;
    }

    public void setAssets(List<String> assets) {
        this.assets = assets;
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

//    public Customer getCustomer() {
//        return customer;
//    }

//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
}
