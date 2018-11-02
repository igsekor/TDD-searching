package com.company;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        if (test.searchingTest()) System.out.println("Searching test is passed.");
        else System.out.println("Searching test is not passed.");
    }
}
