package com.xworkz.runner;

import com.xworkz.ujwal.HotelException;

public class HotelRunner {
    public static void main(String[] args) {
        int availableRooms = 0;
        int requestedRooms = 2;

        if(availableRooms >= requestedRooms) {
            System.out.println("Rooms are available for booking");
        } else {
            throw new
                    HotelException("No rooms available for booking");
        }
    }
}