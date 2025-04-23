package com.xworkz.interior;

public class Product {
    protected Product() {
        System.out.println("Product is the base class.");
    }

    public void info() {
        System.out.println("Products are manufactured goods sold to consumers.");
    }
}
