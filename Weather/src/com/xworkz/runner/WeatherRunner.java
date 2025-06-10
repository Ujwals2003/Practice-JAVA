package com.xworkz.runner;

import com.xworkz.ujwal.WeatherException;

public class WeatherRunner {
    public static void main(String[] args) {
        int temperature = 55;
        int maxSafeTemp = 50;

        if(temperature <= maxSafeTemp) {
            System.out.println("Weather conditions are normal");
        } else {
            throw new WeatherException("Extreme heat warning - temperature too high");
        }
    }
}
