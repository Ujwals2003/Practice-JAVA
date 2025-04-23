package gym;

public class Owner {
    public void run() {

        Gym gym = new Gym();


        gym.setName("FitLife Gym");
        gym.setMemberCount(1200);
        gym.setMonthlyFee(49.99);
        gym.setHas24HourAccess(true);
        gym.setEquipmentCount(250);


        System.out.println("Name: " + gym.getName());
        System.out.println("Member Count: " + gym.getMemberCount());
        System.out.println("Monthly Fee: $" + gym.getMonthlyFee());
        System.out.println("Has 24-Hour Access: " + gym.isHas24HourAccess());
        System.out.println("Equipment Count: " + gym.getEquipmentCount());
    }
}