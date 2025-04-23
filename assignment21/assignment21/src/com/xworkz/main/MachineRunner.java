package com.xworkz.main;

import com.xworkz.internal.WashingMachine;
import com.xworkz.internal.WashingMachineStatus;

public class MachineRunner {
    public static void main(String[] args) {
        WashingMachineStatus s=new WashingMachineStatus();
        s.start();
        s.stop();
        s.reboot();
        s.display();
    }
}
