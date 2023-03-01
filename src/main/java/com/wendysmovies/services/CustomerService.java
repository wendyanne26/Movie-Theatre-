package com.wendysmovies.services;

import com.wendysmovies.movie.Movie;

import java.util.List;

public interface CustomerService {
    List<Movie> getCustomerCart();
    void chooseMovie(Movie movie, int quantity);

}
