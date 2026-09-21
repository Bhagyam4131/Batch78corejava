package com.fundamentals;

import java.util.Scanner;

public class TestDemo4 {

    public static void main(String[] args) {

        System.out.println("main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the father name");
        String fathername = sc.nextLine();

        System.out.println("Enter the mother name");
        String mothername = sc.nextLine();

        System.out.println("Enter father age");
        int fatherage = sc.nextInt();

        System.out.println("Enter father weight");
        double fatherweight = sc.nextDouble();

        System.out.println("Enter father height");
        float fatherheight = sc.nextFloat();

        // Call by value
        displayWeight(fatherweight);
        displayFatherName(fathername);
        displayMotherName(mothername);
        displayFatherAge(fatherage);
        displayFatherHeight(fatherheight);

        System.out.println("main method ended");

        sc.close();
    }

    static void displayWeight(double w) {
        System.out.println("Father weight is: " + w);
    }

    static void displayFatherName(String fname) {
        System.out.println("Father name is: " + fname);
    }

    static void displayMotherName(String mname) {
        System.out.println("Mother name is: " + mname);
    }

    static void displayFatherAge(int age) {
        System.out.println("Father age is: " + age);
    }

    static void displayFatherHeight(float height) {
        System.out.println("Father height is: " + height);
    }
}