package tank;

public class Owner {
    public void run() {

        Tank tank = new Tank();


        tank.setModel("Abrams M1A2");
        tank.setArmorThickness(450);
        tank.setSpeed(72.5);
        tank.setCountry("USA");
        tank.setAmmoCapacity(40);

        
        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Armor Thickness: " + tank.getArmorThickness() + " mm");
        System.out.println("Speed: " + tank.getSpeed() + " km/h");
        System.out.println("Country: " + tank.getCountry());
        System.out.println("Ammo Capacity: " + tank.getAmmoCapacity());
    }
}