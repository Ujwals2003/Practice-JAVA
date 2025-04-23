package com.xworkz.internal;
public class Student extends Education {
    public String course;
    public Student(String name,String status ,String course){
        super(name,status);
        this.course = course;
        System.out.println("Student constructor");

    }
    public void details(){
        super.display();
        System.out.println("course : "+course);
    }

}
