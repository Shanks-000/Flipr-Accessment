package com.shanks.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shanks.restapp.model.Customer;

@RestController
@RequestMapping("/customer")
public class CloudAPIService {

    Customer customer;

    @GetMapping("{CustomerId}")
    public Customer getCustomerDetails(String customerID) {
        return customer; // new Customer("C1", "Customer 1", "C1@gamil.com", "321654987", "Indore");
    }

    @PostMapping
    public String createCustomerDetails(@RequestBody Customer customer) {
        this.customer = customer;
        return "Customer Created Successfully";
    }

    @PutMapping
    public String updateCustomerDetails(@RequestBody Customer customer) {
        this.customer = customer;
        return "Customer Updated Successfully";
    }

}
