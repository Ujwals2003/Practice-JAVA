package apartment;

public class Apartment {
    private int numberOfRooms;
    private double squareFootage;
    private boolean hasParkingSpace;
    private int floorNumber;
    private double monthlyRent;


    void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    void setHasParkingSpace(boolean hasParkingSpace) {
        this.hasParkingSpace = hasParkingSpace;
    }

    void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }


    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public boolean isHasParkingSpace() {
        return hasParkingSpace;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }
}