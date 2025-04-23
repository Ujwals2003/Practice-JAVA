package jetaccess;

import jet.Jet;

public class Manager {
    public void manage() {

        Jet jet = new Jet();

        System.out.println("Model: " + jet.getModel());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Passenger Capacity: " + jet.getPassengerCapacity());
        System.out.println("Fuel Capacity: " + jet.getFuelCapacity() + " liters");
        System.out.println("Max Altitude: " + jet.getMaxAltitude() + " feet");
    }
}