package garage;

public class Owner {
    public void run() {

        Garage garage = new Garage();


        garage.setCapacity(2);
        garage.setSquareFootage(400.0);
        garage.setHasElectricCharger(true);
        garage.setDoorCount(2);
        garage.setAttached(true);


        System.out.println("Capacity: " + garage.getCapacity() + " cars");
        System.out.println("Square Footage: " + garage.getSquareFootage() + " sq ft");
        System.out.println("Has Electric Charger: " + garage.isHasElectricCharger());
        System.out.println("Door Count: " + garage.getDoorCount());
        System.out.println("Is Attached: " + garage.isAttached());
    }
}