package com.company.factory;

import com.company.cuisines.Cuisine;
import com.company.exception.UnservableCuisineRequestException;

import java.util.HashMap;
import java.util.Map;

public class FoodFactory {

    private static FoodFactory instance;
    private static Map<String, Cuisine> cuisines = new HashMap<>();

    public static FoodFactory getFactory() {
        if (instance == null) {
            instance = new FoodFactory();
            return instance;
        }
        return instance;
    }


    public void registerCuisine(String cuisineKey, Cuisine cuisine) {
        cuisines.putIfAbsent(cuisineKey, cuisine);
    }

    public static Cuisine serveCuisine(String cuisineKey, String dish) throws UnservableCuisineRequestException {
        Cuisine cuisine = cuisines.get(cuisineKey);

        if (cuisine == null) {
            String message = "Unservable cuisine " + cuisineKey + " for dish " + dish;
            throw new UnservableCuisineRequestException(message);
        }

        return cuisine.serveFood(dish);
    }
}
