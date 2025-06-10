package com.xworkz.ujwal.runner;

import com.xworkz.ujwal.exception.com.xworkz.ujwal.healthcare;

public class healthcareRunner extends healthcare {
    public static void main(String[] args) {
        boolean healthStatus = true;
        if(healthStatus == false)
        {
            System.out.println("the health is normal");
        }else{
            throw new healthcare("the health is not normal");
        }
    }
}
