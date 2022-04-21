package com.company.cuisines;

public class Chinese extends Cuisine {

    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }
}
