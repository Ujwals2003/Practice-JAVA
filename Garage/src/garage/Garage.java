package garage;

public class Garage {
    private int capacity;
    private double squareFootage;
    private boolean hasElectricCharger;
    private int doorCount;
    private boolean isAttached;


    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    void setHasElectricCharger(boolean hasElectricCharger) {
        this.hasElectricCharger = hasElectricCharger;
    }

    void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    void setAttached(boolean isAttached) {
        this.isAttached = isAttached;
    }


    public int getCapacity() {
        return capacity;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public boolean isHasElectricCharger() {
        return hasElectricCharger;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public boolean isAttached() {
        return isAttached;
    }
}