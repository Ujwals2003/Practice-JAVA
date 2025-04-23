package occupationaccess;

import occupation.Occupation;

public class Manager {
    public void manage() {

        Occupation occupation = new Occupation();


        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Average Salary: $" + occupation.getAverageSalary());
        System.out.println("Years of Training: " + occupation.getYearsOfTraining());
        System.out.println("Requires License: " + occupation.isRequiresLicense());
        System.out.println("Industry Category: " + occupation.getIndustryCategory());
    }
}