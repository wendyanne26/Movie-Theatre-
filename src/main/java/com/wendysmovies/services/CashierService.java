package com.wendysmovies.services;

import com.wendysmovies.Theatre;
import com.wendysmovies.customer.Customer;
import com.wendysmovies.movie.Movie;

public interface CashierService {
    void checkoutCustomer(Customer customer);
    boolean isMovieAvailable(Movie movie);
    void updateMoviesCatalogue(Movie movie, int quantity);

}
