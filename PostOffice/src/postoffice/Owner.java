package postoffice;

public class Owner {
    public void run() {
        // Create PostOffice instance
        PostOffice postOffice = new PostOffice();

        // Use setters (available because Owner is in the same package as PostOffice)
        postOffice.setLocation("123 Main Street");
        postOffice.setZipCode(10001);
        postOffice.setNumberOfEmployees(20);
        postOffice.setOpen24Hours(false);
        postOffice.setNumberOfMailboxes(500);

        // Use getters
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Zip Code: " + postOffice.getZipCode());
        System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
        System.out.println("Is Open 24 Hours: " + postOffice.isOpen24Hours());
        System.out.println("Number of Mailboxes: " + postOffice.getNumberOfMailboxes());
    }
}