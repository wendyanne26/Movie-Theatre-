package com.wendysmovies.services;

import com.wendysmovies.staff.Cashier;

import java.util.List;

public interface ManagerService {
    void hireCashier(List<Cashier>cashiers);
    void fireCashier(Cashier cashier);
    void paySalary(double amount);

}
