package badgeaccess;

import badge.Badge;

public class Manager {
    public void manage() {

        Badge badge = new Badge();


        System.out.println("Badge ID: " + badge.getBadgeId());
        System.out.println("Holder Name: " + badge.getHolderName());
        System.out.println("Department: " + badge.getDepartment());
        System.out.println("Is Active: " + badge.isActive());
        System.out.println("Security Level: " + badge.getSecurityLevel());
    }
}