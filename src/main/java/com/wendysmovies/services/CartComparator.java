package com.wendysmovies.services;

import com.wendysmovies.customer.Customer;

import java.util.Comparator;

public class CartComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return Integer.compare(customer2.getCustomerCart().size(), customer1.getCustomerCart().size());
    }
}
