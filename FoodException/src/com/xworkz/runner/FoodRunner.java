package com.xworkz.runner;

import com.xworkz.ujwal.FoodException;

public class FoodRunner {
    public static void main(String[] args) {
        String expiryDate = "2025-01-01";
        String currentDate = "2025-06-10";

        if(currentDate.compareTo(expiryDate) <= 0) {
            System.out.println("Food is fresh and safe to consume");
        } else {
            throw new FoodException("Food has expired and is not safe to consume");
        }
    }
}