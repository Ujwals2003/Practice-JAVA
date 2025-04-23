package tankaccess;

import tank.Tank;

public class Manager {
    public void manage() {

        Tank tank = new Tank();


        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Armor Thickness: " + tank.getArmorThickness() + " mm");
        System.out.println("Speed: " + tank.getSpeed() + " km/h");
        System.out.println("Country: " + tank.getCountry());
        System.out.println("Ammo Capacity: " + tank.getAmmoCapacity());
    }
}