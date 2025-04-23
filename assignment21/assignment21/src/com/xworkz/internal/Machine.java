package com.xworkz.internal;

public abstract class Machine {
    public abstract void start();
    public abstract void stop();
    public  void reboot(){
        System.out.println("Rebooting");

    }
    public void display(){
        System.out.println("I am a Machine");
    }
}
