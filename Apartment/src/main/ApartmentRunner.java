package main;

import apartment.Owner;
import apartmentaccess.Manager;

public class ApartmentRunner {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.run();

        System.out.println("\n-----------------------\n");


        Manager manager = new Manager();
        manager.manage();
    }
}