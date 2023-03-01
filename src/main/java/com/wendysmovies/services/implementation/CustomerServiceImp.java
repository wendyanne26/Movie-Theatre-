package com.wendysmovies.services.implementation;

import com.wendysmovies.movie.Movie;
import com.wendysmovies.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImp implements CustomerService {
    private List<Movie> customerCart;

    public CustomerServiceImp() {
        this.customerCart = new ArrayList<>();
    }

    @Override
    public List<Movie> getCustomerCart() {
        return customerCart;
    }

    @Override
    public void chooseMovie(Movie mov, int quantity) {
        Movie movie = new Movie(mov.getName(), mov.getReleaseYear(), mov.getPrice(), mov.getGenre(), quantity);
        customerCart.add(movie);
    }
}
