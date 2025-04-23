package com.xworkz.external;

public class Tourist {
    public Tourist(){
        System.out.println("Running in Tourist");
    }

    public void vacation() {
        Beach beach = new Beach();
        beach.sunbathe();
        beach.swim();
    }
}
