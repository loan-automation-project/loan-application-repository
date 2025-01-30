package com.project.loan_application.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.loan_application.pojo.CustomerPojo;

@FeignClient(name = "customer")
public interface CustomerServiceClient {

	@GetMapping("/customers/{id}")
	CustomerPojo getCustomerById(@PathVariable Long id);
}
