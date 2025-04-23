package badge;

public class Owner {
    public void run() {

        Badge badge = new Badge();


        badge.setBadgeId("B12345");
        badge.setHolderName("Jane Smith");
        badge.setDepartment("IT Security");
        badge.setActive(true);
        badge.setSecurityLevel(4);


        System.out.println("Badge ID: " + badge.getBadgeId());
        System.out.println("Holder Name: " + badge.getHolderName());
        System.out.println("Department: " + badge.getDepartment());
        System.out.println("Is Active: " + badge.isActive());
        System.out.println("Security Level: " + badge.getSecurityLevel());
    }
}