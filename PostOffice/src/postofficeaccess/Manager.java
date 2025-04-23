package postofficeaccess;

import postoffice.PostOffice;

public class Manager {
    public void manage() {

        PostOffice postOffice = new PostOffice();


        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Zip Code: " + postOffice.getZipCode());
        System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
        System.out.println("Is Open 24 Hours: " + postOffice.isOpen24Hours());
        System.out.println("Number of Mailboxes: " + postOffice.getNumberOfMailboxes());
    }
}