package com.xworkz.runner;

import com.xworkz.ujwal.BankAccountException;

public class BankAccountRunner {
    public static void main(String[] args) {
        double balance = 500.0;
        double withdrawAmount = 1000.0;

        if(balance >= withdrawAmount) {
            System.out.println("Transaction successful");
        } else {
            throw new BankAccountException("Insufficient balance for withdrawal");
        }
    }
}