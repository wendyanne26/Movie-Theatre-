package com.wendysmovies.enums;

public enum Roles {
    MANAGER, CASHIER;

    @Override
    public String toString() {
        return switch(this){
            case CASHIER -> "cashier";
            case MANAGER -> "manager";
        };

    }
}
