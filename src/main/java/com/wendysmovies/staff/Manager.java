package com.wendysmovies.staff;

import com.wendysmovies.Theatre;
import com.wendysmovies.enums.Roles;
import com.wendysmovies.services.ManagerService;

import java.util.List;

public class Manager extends Staff{
    ManagerService managerService;
    public Manager(String name, Roles role, ManagerService managerService) {
        super(name, role);
        this.managerService = managerService;
    }
    public void hireCashier(List<Cashier> cashiers) {
        managerService.hireCashier(cashiers);
        for(Cashier eachCashier : cashiers){
            System.out.println("congratulations "+ eachCashier.getName() + " your application has been approved. Here is Your ID: "+ eachCashier.getStaffId());
        }
    }

    public void fireCashier(Cashier cashier) {
        managerService.fireCashier(cashier);
    }

    public void paySalary( double amount) {
        managerService.paySalary(amount);
    }
}
