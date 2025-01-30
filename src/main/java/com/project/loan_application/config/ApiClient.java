package com.project.loan_application.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.loan_application.pojo.CustomerPojo;

@FeignClient(name = "loanService", url = "https://localhost:1091")
public interface ApiClient {

	@GetMapping("/customers/{id}")
	CustomerPojo getCustomerById(@PathVariable Long id);
}
