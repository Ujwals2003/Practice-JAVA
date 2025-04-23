package main;

import garage.Owner;
import garageaccess.Manager;

public class GarageRunner {
    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.run();

        System.out.println("\n-----------------------\n");


        Manager manager = new Manager();
        manager.manage(); // Access Garage, only get
    }
}