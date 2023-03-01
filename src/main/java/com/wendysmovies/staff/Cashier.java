package com.wendysmovies.staff;

import com.wendysmovies.enums.Roles;
import com.wendysmovies.services.CashierService;

public class Cashier extends Staff{
    CashierService cashierService;
    public Cashier(String name, Roles role, CashierService cashierService) {
        super(name, role);
        this.cashierService = cashierService;
    }
}
