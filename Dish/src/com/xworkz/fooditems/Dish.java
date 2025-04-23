package com.xworkz.fooditems;

public class Dish {
    protected Dish() {
        System.out.println("Dish is the base class.");
    }

    public void category() {
        System.out.println("Category: Main or Side food items.");
    }
}
