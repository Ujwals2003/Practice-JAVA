package com.xworkz.internal;

public abstract class Education {
    public String name;
    public String status;
    public Education(String name,String status){
        this.name=name;
        this.status=status;
        System.out.println("educaation constructor is called");
    }
    public void display(){
        System.out.println("Name: "+name+" Status: "+status);
    }

}
