package main;

import com.xworkz.utility.Revolver;

public class WeaponRunner {
    public static void main(String[] args) {
        Revolver revolver = new Revolver();
        revolver.usage();
        revolver.type();
        revolver.fire();
    }
}
