package com.dtors.controller;

import com.dtors.dto.Customer;
import com.dtors.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer addCustomer(@RequestBody  Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/")
    public List<Customer> getCustomerList(){
        return  customerService.getCustomerList();
    }

    @GetMapping("/{id}")
    public Customer getCustomer (@PathVariable int id)
    {
        return customerService.getCustomer(id);
    }
}
