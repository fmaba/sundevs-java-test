package com.company.cuisines;

public class Italian extends Cuisine {

    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }
}
