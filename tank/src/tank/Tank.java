package tank;

public class Tank {
    private String model;
    private int armorThickness;
    private double speed;
    private String country;
    private int ammoCapacity;

    // Package-access setters
    void setModel(String model) {
        this.model = model;
    }

    void setArmorThickness(int armorThickness) {
        this.armorThickness = armorThickness;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    void setCountry(String country) {
        this.country = country;
    }

    void setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }


    public String getModel() {
        return model;
    }

    public int getArmorThickness() {
        return armorThickness;
    }

    public double getSpeed() {
        return speed;
    }

    public String getCountry() {
        return country;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }
}