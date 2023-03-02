package com.wendysmovies.staff;

import com.wendysmovies.customer.Customer;
import com.wendysmovies.enums.Roles;
import com.wendysmovies.movie.Movie;
import com.wendysmovies.services.CashierService;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Cashier extends Staff{
    private String name;
    CashierService cashierService;
    Queue<Customer> customerQueue;
    public Cashier(String name, Roles role, CashierService cashierService) {
        super(name, role);
        this.cashierService = cashierService;
        this.customerQueue = new PriorityQueue<>();
    }

    public Cashier(String name, Roles role, CashierService cashierService, Comparator<Customer> cartSizeComparator) {
        super(name, role);
        this.cashierService = cashierService;
        this.customerQueue = new PriorityQueue<>(cartSizeComparator);

    }

    public void checkoutCustomer(Customer customer){
        cashierService.checkoutCustomer(customer);
     }
    public void isMovieAvailable(Movie movie){
        cashierService.isMovieAvailable(movie);
    }
    public void updateMoviesCatalogue(Movie movie, int quantity){
       cashierService.updateMoviesCatalogue(movie, quantity);
    }
    public void addCustomerToQueue(Customer customer){
        customerQueue.offer(customer);
        System.out.println(customer.getName() + " has been added to the queue.");
    }
    public void checkoutQueue(){
        Customer nextCustomer;
        while(!customerQueue.isEmpty()){
            nextCustomer = customerQueue.poll();
            checkoutCustomer(nextCustomer);
            System.out.println(this.getName() + " is attending to " + nextCustomer.getName());
            System.out.println("Current queue: " + customerQueue);
        }
        System.out.println("Queue is empty....");
    }

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }
}
