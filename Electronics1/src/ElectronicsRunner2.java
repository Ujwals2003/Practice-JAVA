public class ElectronicsRunner2 {
    public static void main(String[] args) {
        Electronics1 laptop = new Electronics1("Laptop", "Dell", "Computer", 65.0, 100000.0, true, 3, "WiFi & Bluetooth", "5000mAh", 2023);
        Electronics1 smartphone = new Electronics1("Smartphone", "Samsung");

        System.out.println("Electronics Information ");
        laptop.displayInfo();
        System.out.println();
        smartphone.displayInfo();
    }
}
