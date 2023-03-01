package com.wendysmovies.services.implementation;

import com.wendysmovies.Theatre;
import com.wendysmovies.customer.Customer;
import com.wendysmovies.movie.Movie;
import com.wendysmovies.services.CashierService;

public class CashierServiceImp implements CashierService {
    private final Theatre theatre;

    public CashierServiceImp(Theatre theatre) {
        this.theatre = theatre;
    }

    @Override
    public void checkoutCustomer(Customer customer) {
        double totalPrice = 0.0;
        for(Movie movie : customer.getCustomerCart()){
            if (isMovieAvailable(movie)){
                totalPrice += movie.getPrice() * movie.getQuantity();
            }
        }
        if(customer.getCustomerWallet() >= totalPrice){
            for(Movie movie : customer.getCustomerCart()){
                updateMoviesCatalogue(movie, movie.getQuantity());
            }
            theatre.setTheatreAccountBalance(theatre.getTheatreAccountBalance() + totalPrice);
            customer.setCustomerWallet(customer.getCustomerWallet() - totalPrice);
        }
    }

    @Override
    public boolean isMovieAvailable(Movie movie) {
        for (Movie currentMovie : theatre.getTheatreCatalogue()) {
            if (currentMovie.getName().equals(movie.getName())) {
                return true;
            }
        }
        return false;
    }



    @Override
    public void updateMoviesCatalogue(Movie movie, int quantity) {
        for(Movie currentMovie : theatre.getTheatreCatalogue()){
            if(movie.getName().equals(currentMovie.getName())){
                currentMovie.setQuantity(currentMovie.getQuantity() - quantity);
                break;
            }
        }
    }
}
