package com.wendysmovies.services.implementation;

import com.wendysmovies.Theatre;
import com.wendysmovies.movie.Movie;
import com.wendysmovies.services.ManagerService;
import com.wendysmovies.staff.Cashier;

import java.util.List;

public class ManagerServiceImp implements ManagerService {
    private Theatre theatre;

    public ManagerServiceImp(Theatre theatre) {
        this.theatre = theatre;
    }

    @Override
    public void hireCashier(List<Cashier> cashiers) {
        theatre.setCashiers(cashiers);

    }

    @Override
    public void fireCashier(Cashier cashier) {
        Cashier cashierToFire = null;
        for (Cashier eachCashier : theatre.getCashiers()) {
            if (eachCashier.getStaffId().equals(cashier.getStaffId())) {
                cashierToFire = eachCashier;
                break;
            }
        }
        theatre.getCashiers().remove(cashierToFire);
        System.out.println(cashier.getName() + " your services are no longer required.");
    }

    @Override
    public void paySalary( double amount) {
        for(Cashier eachCashier : theatre.getCashiers()){
            eachCashier.setStaffAccount(amount);
        }

    }
}
