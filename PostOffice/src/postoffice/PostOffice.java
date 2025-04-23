package postoffice;

public class PostOffice {
    private String location;
    private int zipCode;
    private int numberOfEmployees;
    private boolean isOpen24Hours;
    private int numberOfMailboxes;


    void setLocation(String location) {
        this.location = location;
    }

    void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    void setOpen24Hours(boolean isOpen24Hours) {
        this.isOpen24Hours = isOpen24Hours;
    }

    void setNumberOfMailboxes(int numberOfMailboxes) {
        this.numberOfMailboxes = numberOfMailboxes;
    }


    public String getLocation() {
        return location;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public boolean isOpen24Hours() {
        return isOpen24Hours;
    }

    public int getNumberOfMailboxes() {
        return numberOfMailboxes;
    }
}