
package com.wendysmovies.staff;

import com.wendysmovies.enums.Roles;

public abstract class Staff {
    private String name;
    private static int ID = 100;
    private String staffId;
    private double staffAccount = 0.0;

    public Staff(String name, Roles role) {
        this.name = name;
        this.staffId = generateId(role);
    }
    public String generateId(Roles role){
        String firstChar;
        if(role.toString().equals("manager")){
            firstChar = "M";
        }else{
            firstChar = "C";
        }
       this.staffId = firstChar + ID++;
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffAccount(double staffSalary) {
        this.staffAccount += staffSalary;
    }
}

