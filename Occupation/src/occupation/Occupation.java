package occupation;

public class Occupation {
    private String title;
    private double averageSalary;
    private int yearsOfTraining;
    private boolean requiresLicense;
    private String industryCategory;


    void setTitle(String title) {
        this.title = title;
    }

    void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    void setYearsOfTraining(int yearsOfTraining) {
        this.yearsOfTraining = yearsOfTraining;
    }

    void setRequiresLicense(boolean requiresLicense) {
        this.requiresLicense = requiresLicense;
    }

    void setIndustryCategory(String industryCategory) {
        this.industryCategory = industryCategory;
    }


    public String getTitle() {
        return title;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public int getYearsOfTraining() {
        return yearsOfTraining;
    }

    public boolean isRequiresLicense() {
        return requiresLicense;
    }

    public String getIndustryCategory() {
        return industryCategory;
    }
}