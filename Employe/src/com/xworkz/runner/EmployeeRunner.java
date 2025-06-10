package com.xworkz.runner;

import com.xworkz.ujwal.EmployeeException;

public class EmployeeRunner {
    public static void main(String[] args) {
        int age = 16;
        int minimumAge = 18;

        if(age >= minimumAge) {
            System.out.println("Employee is eligible for hiring");
        } else {
            throw new EmployeeException("Employee is underage for this position");
        }
    }
}
