package com.project.loan_application.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.project.loan_application.dto.CustomerDTO;

@FeignClient(name = "customer-service", url = "${http://localhost:1091/customers}")
public interface CustomerClient {
    @GetMapping("/customers/{id}")
    CustomerDTO getCustomerById(@PathVariable("id") Long id);
    
    @GetMapping("/customers/user/{userId}")
    CustomerDTO getCustomerByUserId(@PathVariable("userId") Long userId);
} 