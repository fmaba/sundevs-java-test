package com.company.cuisines;

public class Japanese extends Cuisine {

    public Cuisine serveFood(String dish) {
        this.dish = dish;
        return this;
    }
}
