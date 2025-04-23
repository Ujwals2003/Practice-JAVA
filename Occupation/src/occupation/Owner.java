package occupation;

public class Owner {
    public void run() {

        Occupation occupation = new Occupation();


        occupation.setTitle("Software Engineer");
        occupation.setAverageSalary(120000.00);
        occupation.setYearsOfTraining(4);
        occupation.setRequiresLicense(false);
        occupation.setIndustryCategory("Technology");


        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Average Salary: $" + occupation.getAverageSalary());
        System.out.println("Years of Training: " + occupation.getYearsOfTraining());
        System.out.println("Requires License: " + occupation.isRequiresLicense());
        System.out.println("Industry Category: " + occupation.getIndustryCategory());
    }
}