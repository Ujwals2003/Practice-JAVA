package com.xworkz.external;

public class Believer {
    public Believer(){
        System.out.println("Running in Believer");
    }

    public void faith() {
        Church church = new Church();
        church.bell();
        church.pray();
    }
}
