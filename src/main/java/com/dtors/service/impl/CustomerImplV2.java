package com.dtors.service.impl;

import com.dtors.dto.Customer;
import com.dtors.service.ICustomer;
import org.springframework.context.annotation.Primary;

@Primary
public class CustomerImplV2 implements ICustomer {
    @Override
    public Customer AddCustomer(Customer customer) {
        return null;
    }
}
