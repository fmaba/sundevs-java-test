package com.company.cuisines;

public class Mexican extends Cuisine {

    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }
}
