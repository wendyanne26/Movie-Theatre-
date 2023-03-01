package com.wendysmovies.movie;

import com.wendysmovies.enums.Genre;

public class Movie {
    private final String name;
    private final String releaseYear;
    private double price;
    private final Genre genre;
    private int quantity;

    public Movie(String name, String releaseYear, double price, Genre genre, int quantity) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.price = price;
        this.genre = genre;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }
}
