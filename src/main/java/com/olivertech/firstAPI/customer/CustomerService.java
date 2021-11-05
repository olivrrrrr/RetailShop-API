package com.olivertech.firstAPI.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CustomerService {

    private CustomerDataAccessService customerDataAccessService;

    @Autowired
    public CustomerService(CustomerDataAccessService customerDataAccessService) {
        this.customerDataAccessService = customerDataAccessService;
    }

    public List<Customer> getCustomers(){
        return customerDataAccessService.getCustomers();
    }

    public void addCustomer(Customer customer) {
         customerDataAccessService.addCustomer(customer);
    }

    public void updateCustomer(Integer customerId, Customer customer) {
        customerDataAccessService.updateCustomer(customerId,customer);
    }

    public void deleteCustomer(Integer customerId) {
        customerDataAccessService.deleteCustomer(customerId);
    }
}
