package com.xworkz.runner;

import com.xworkz.ujwal.LibraryException;

public class LibraryRunner {
    public static void main(String[] args) {
        int booksIssued = 8;
        int maxBooksAllowed = 5;

        if(booksIssued <= maxBooksAllowed) {
            System.out.println("Book can be issued");
        } else {
            throw new LibraryException("Maximum book limit exceeded");
        }
    }
}