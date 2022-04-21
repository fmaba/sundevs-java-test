package com.company.cuisines;

public abstract class Cuisine {
    String dish;

    public abstract Cuisine serveFood(String dish);

    public String getDish() {
        return this.dish;
    }
}
