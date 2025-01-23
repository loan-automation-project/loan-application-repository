package com.project.loan_application.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerPojo{
	private int userId;        
    private String username;   
    private String email;      
    private String password;  
    private String fullName;   
    private String phoneNumber;
}
