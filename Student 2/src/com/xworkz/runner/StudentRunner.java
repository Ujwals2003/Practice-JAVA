package com.xworkz.runner;

import com.workz.ujwal.StudentException;

public class StudentRunner {
    public static void main(String[] args) {
        int marks = 25;
        int passingMarks = 35;

        if(marks >= passingMarks) {
            System.out.println("Student has passed the exam");
        } else {
            throw new StudentException("Student has failed the exam");
        }
    }
}