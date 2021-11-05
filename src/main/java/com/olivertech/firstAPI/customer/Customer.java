package com.olivertech.firstAPI.customer;

import java.util.List;
import java.util.Objects;

public class Customer {

    private Integer customerId;
    private String name;
    private String email;
    private List<String> itemsList;

    public Customer(Integer customerId, String name, String email, List<String> itemsList) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.itemsList = itemsList;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<String> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(itemsList, customer.itemsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, email, itemsList);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", itemsList=" + itemsList +
                '}';
    }
}
