package main;

import postoffice.Owner;
import postofficeaccess.Manager;

public class PostOfficeRunner {
    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.run();

        System.out.println("\n-----------------------\n");


        Manager manager = new Manager();
        manager.manage(); // Access PostOffice, only get
    }
}