package apartmentaccess;

import apartment.Apartment;

public class Manager {
    public void manage() {
        Apartment apartment = new Apartment();


        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
        System.out.println("Square Footage: " + apartment.getSquareFootage() + " sq ft");
        System.out.println("Has Parking Space: " + apartment.isHasParkingSpace());
        System.out.println("Floor Number: " + apartment.getFloorNumber());
        System.out.println("Monthly Rent: $" + apartment.getMonthlyRent());
    }
}