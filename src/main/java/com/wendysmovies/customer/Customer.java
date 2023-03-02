package com.wendysmovies.customer;

import com.wendysmovies.movie.Movie;
import com.wendysmovies.services.CustomerService;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Comparable<Customer> {
    private String name;
    private double customerWallet;
    private final CustomerService customerService;

    private final String timeOfArrival;

    public Customer(String name, double customerWallet, CustomerService customerService) {
        this.name = name;
        this.customerWallet = customerWallet;
        this.customerService = customerService;
        this.timeOfArrival = LocalTime.now().toString();
    }

    public void chooseMovie(Movie movie, int quantity) {
        customerService.chooseMovie(movie, quantity);
    }
    public double getCustomerWallet() {
        return customerWallet;
    }

    public List<Movie> getCustomerCart() {
        return customerService.getCustomerCart();
    }

    public void setCustomerWallet(double customerWallet) {
        this.customerWallet = customerWallet;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer nextCustomer) {
        return this.getTimeOfArrival().compareTo(nextCustomer.getTimeOfArrival());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", timeOfArrival='" + timeOfArrival + '\'' +
                '}';
    }
}
