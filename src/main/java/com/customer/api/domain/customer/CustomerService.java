package com.customer.api.domain.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public String getCustomer() {
        return "CustomerApiV1";
    }
}
