package com.olivertech.firstAPI.customer;

import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService {

    private List<Customer> db = new ArrayList<>();

    public CustomerDataAccessService(){
        db.add(new Customer(1, "Oliver", "oliver@snailmail.com" ,List.of("Jeans")));
        db.add(new Customer(2, "Luke", "luke@snailmail.com" ,List.of("Jeans")));
    }

    public List<Customer> getCustomers() {
        return db;
    }

    public void addCustomer(Customer customer) {
            db.add(customer);
    }

    public void updateCustomer(Integer customerId, Customer customer) {
        Optional<Customer> foundCustomer =
                db.stream().filter(c -> c.getCustomerId().equals(customerId)).findAny();

        foundCustomer.ifPresent(c -> {
            Integer index = db.indexOf(c);
            db.add(index, customer);
            db.remove(c);
        });

    }

    public void deleteCustomer(Integer customerId) {

        Optional<Customer> foundCustomer =
        db.stream().filter(c -> c.getCustomerId() == customerId).findAny();

        foundCustomer.ifPresent(c -> db.remove(c));

    }
}
