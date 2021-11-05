package com.olivertech.firstAPI.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomerService() {
        return customerService.getCustomers();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
         customerService.addCustomer(customer);
    }

    @PutMapping("{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer customerId, @RequestBody Customer customer){
        customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer customerId){
        customerService.deleteCustomer(customerId);
    }


}
