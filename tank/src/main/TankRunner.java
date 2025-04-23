package main;

import tank.Owner;
import tankaccess.Manager;

public class TankRunner {
    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.run();

        System.out.println("\n-----------------------\n");


        Manager manager = new Manager();
        manager.manage();
    }
}