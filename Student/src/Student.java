public class Student {
    private String name;
    private int rollNumber;
    private String course;


    public Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }


    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}
