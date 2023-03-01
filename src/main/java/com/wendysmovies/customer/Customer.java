package com.wendysmovies.customer;

import com.wendysmovies.movie.Movie;
import com.wendysmovies.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private double customerWallet;
    private final CustomerService customerService;
    public Customer(double customerWallet, CustomerService customerService) {
        this.customerWallet = customerWallet;
        this.customerService = customerService;
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
}
