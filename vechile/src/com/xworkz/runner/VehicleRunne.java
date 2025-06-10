package com.xworkz.runner;

import com.xworkz.ujwal.VehicleException;

public class VehicleRunne {
    public static void main(String[] args) {
        int fuelLevel = 5;
        int minimumFuel = 10;

        if(fuelLevel >= minimumFuel) {
            System.out.println("Vehicle is ready to start");
        } else {
            throw new VehicleException("Fuel level is too low to start vehicle");
        }
    }
}