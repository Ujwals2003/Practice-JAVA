package com.xworkz.ujwal;

public class BankAccountException extends RuntimeException {
    public BankAccountException() {
        super();
    }

    public BankAccountException(String message) {
        super(message);
    }
}