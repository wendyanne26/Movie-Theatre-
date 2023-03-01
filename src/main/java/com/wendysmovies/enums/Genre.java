package com.wendysmovies.enums;

public enum Genre {
    ACTION, THRILLER, SCI_FI, HORROR, COMEDY, ROMANCE, ANIME;

    @Override
    public String toString() {
        return switch (this){
            case ANIME ->  "anime";
            case ACTION -> "action";
            case COMEDY ->  "comedy";
            case HORROR ->  "horror";
            case SCI_FI -> "sci_fi";
            case ROMANCE -> "romance";
            case THRILLER -> "thriller";
            default -> "not available";
        };
    }
}
