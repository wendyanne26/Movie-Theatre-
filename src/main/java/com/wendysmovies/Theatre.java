package com.wendysmovies;

import com.wendysmovies.movie.Movie;
import com.wendysmovies.staff.Cashier;

import java.util.List;

public class Theatre {
    private String name;
    private double theatreAccountBalance;
    private List<Movie> theatreCatalogue;
    private List<Cashier> cashiers;

    public Theatre(String name, double accountBalance, List<Movie> catalogue) {
        this.name = name;
        this.theatreAccountBalance = accountBalance;

    }

    public List<Movie> getTheatreCatalogue() {
        return theatreCatalogue;
    }

    public List<Cashier> getCashiers() {
        return cashiers;
    }

    public void setTheatreCatalogue(List<Movie> theatreCatalogue) {
        this.theatreCatalogue = theatreCatalogue;
    }

    public void setCashiers(List<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    public void setTheatreAccountBalance(double theatreAccountBalance) {
        this.theatreAccountBalance = theatreAccountBalance;
    }

    public double getTheatreAccountBalance() {
        return theatreAccountBalance;
    }
}
