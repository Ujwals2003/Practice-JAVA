package jet;

public class Owner {
    public void run() {

        Jet jet = new Jet();


        jet.setModel("Gulfstream G650");
        jet.setMaxSpeed(956.0);
        jet.setPassengerCapacity(19);
        jet.setFuelCapacity(6500.0);
        jet.setMaxAltitude(51000);


        System.out.println("Model: " + jet.getModel());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Passenger Capacity: " + jet.getPassengerCapacity());
        System.out.println("Fuel Capacity: " + jet.getFuelCapacity() + " liters");
        System.out.println("Max Altitude: " + jet.getMaxAltitude() + " feet");
    }
}