package main;

import badge.Owner;
import badgeaccess.Manager;

public class BadgeRunner {
    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.run();

        System.out.println("\n-----------------------\n");


        Manager manager = new Manager();
        manager.manage();
    }
}