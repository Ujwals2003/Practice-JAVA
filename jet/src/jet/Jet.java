package jet;

public class Jet {
    private String model;
    private double maxSpeed;
    private int passengerCapacity;
    private double fuelCapacity;
    private int maxAltitude;


    void setModel(String model) {
        this.model = model;
    }

    void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }


    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }
}