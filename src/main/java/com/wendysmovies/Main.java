package com.wendysmovies;

import com.wendysmovies.customer.Customer;
import com.wendysmovies.enums.Genre;
import com.wendysmovies.enums.Roles;
import com.wendysmovies.movie.Movie;
import com.wendysmovies.services.CashierService;
import com.wendysmovies.services.CustomerService;
import com.wendysmovies.services.ManagerService;
import com.wendysmovies.services.implementation.CashierServiceImp;
import com.wendysmovies.services.implementation.CustomerServiceImp;
import com.wendysmovies.services.implementation.ManagerServiceImp;
import com.wendysmovies.staff.Cashier;
import com.wendysmovies.staff.Manager;
import com.wendysmovies.staff.Staff;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Mr Queen", "2021", 2500, Genre.ROMANCE, 21);
        Movie movie1 = new Movie("Fate", "2023", 2000, Genre.SCI_FI, 10);
        Movie movie2 = new Movie("Vincenzo", "2020", 1500, Genre.ACTION, 15);
        Movie movie3 = new Movie("Merlin", "2010", 1000, Genre.SCI_FI, 12);
        Movie movie4 = new Movie("Goblin", "2019", 3000, Genre.ROMANCE, 2);


        Theatre theatre1 = new Theatre("Simba's paradise", 300000.00, new ArrayList<>(List.of(movie, movie1, movie2, movie3, movie4)));
        ManagerService managerService = new ManagerServiceImp(theatre1);
        Manager manager = new Manager("Nte", Roles.MANAGER, managerService);


        CashierService cashierService = new CashierServiceImp(theatre1);
        Cashier cashier = new Cashier("Nike", Roles.CASHIER, cashierService);
        Cashier cashier1 = new Cashier("Lillian", Roles.CASHIER, cashierService);
        manager.hireCashier(new ArrayList<>(List.of(cashier, cashier1)));


        CustomerService customerService = new CustomerServiceImp();
        Customer customer1 = new Customer("Joy", 370000, customerService);
        Customer customer2 = new Customer("John",370000, customerService);
        Customer customer3 = new Customer("Jane",370000, customerService);

        customer1.chooseMovie(movie, 3);
        customer2.chooseMovie(movie2, 5);
        customer3.chooseMovie(movie3, 9);


        cashier1.addCustomerToQueue(customer1);
        cashier1.addCustomerToQueue(customer2);
        cashier1.addCustomerToQueue(customer3);

        cashier1.checkoutQueue();
    }
}
