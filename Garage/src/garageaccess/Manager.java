package garageaccess;

import garage.Garage;

public class Manager {
    public void manage() {

        Garage garage = new Garage();


        System.out.println("Capacity: " + garage.getCapacity() + " cars");
        System.out.println("Square Footage: " + garage.getSquareFootage() + " sq ft");
        System.out.println("Has Electric Charger: " + garage.isHasElectricCharger());
        System.out.println("Door Count: " + garage.getDoorCount());
        System.out.println("Is Attached: " + garage.isAttached());
    }
}