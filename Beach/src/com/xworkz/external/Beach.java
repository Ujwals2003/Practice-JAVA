package com.xworkz.external;

public class Beach {
    public Beach(){
        System.out.println("no-args Beach constructor");
    }

    public void swim(){
        System.out.println("Swimming at the beach");
    }

    void sunbathe(){
        System.out.println("Sunbathing...");
        relax();
    }

    private void relax(){
        System.out.println("Relaxing on the sand");
    }
}
