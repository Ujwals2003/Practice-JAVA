package main;

import occupation.Owner;
import occupationaccess.Manager;

public class OccupationRunner {
    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.run();

        System.out.println("\n-----------------------\n");


        Manager manager = new Manager();
        manager.manage();
    }
}