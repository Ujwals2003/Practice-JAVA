package gym;

public class Gym {
    private String name;
    private int memberCount;
    private double monthlyFee;
    private boolean has24HourAccess;
    private int equipmentCount;


    void setName(String name) {
        this.name = name;
    }

    void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    void setHas24HourAccess(boolean has24HourAccess) {
        this.has24HourAccess = has24HourAccess;
    }

    void setEquipmentCount(int equipmentCount) {
        this.equipmentCount = equipmentCount;
    }


    public String getName() {
        return name;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public boolean isHas24HourAccess() {
        return has24HourAccess;
    }

    public int getEquipmentCount() {
        return equipmentCount;
    }
}