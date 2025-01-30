package com.project.loan_application.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerPojo{
	private long userId;
    private long CustomerId;
    private String username;   
    private String email;
    private String fullName;   
    private String phoneNumber;
    private String age;
    private String gender;
}
