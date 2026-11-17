
package Inheritance;

import java.util.Scanner;

public class PersonalLoan extends LoanImp {

    static Scanner sc = new Scanner(System.in);

    void PersonalLoanDocInfo() {
        System.out.println("All documents have been verified");
    }

    boolean isAadharValid() {
        System.out.println("Enter your Aadhar Number:");
        String aadhar = sc.next();

        boolean isValid = aadhar.matches("[2-9][0-9]{11}");
        return isValid;
    }

    boolean isPanValid() {
        System.out.println("Enter your PAN Card:");
        String pan = sc.next();

        boolean isValid = pan.matches(
            "[A-Z]{5}[0-9]{4}[A-Z]"
        );
        return isValid;
    }

    boolean isPhoneValid() {
        System.out.println("Enter your phone number:");
        String phone = sc.next();

        boolean isValid = phone.matches("[6-9][0-9]{9}");
        return isValid;
    }

    double getROI() {

        double roi = 20.0;

        int cibil = getcibilScore();

        if (cibil > 900 || cibil < 300) {

            System.out.println("CIBIL data is invalid");

        } else if (cibil >= 800 && cibil <= 900) {

            System.out.println("Excellent - Strong credit profile");
            roi = roi - 11.0;

        } else if (cibil >= 771 && cibil < 800) {

            System.out.println("Very Good - Strong credit profile");
            roi = roi - 9.0;

        } else if (cibil >= 701 && cibil <= 770) {

            System.out.println("Good - Eligible for most loans");
            roi = roi - 8.0;

        } else if (cibil >= 601 && cibil <= 700) {

            System.out.println("Average - May get loan");
            roi = roi - 7.0;

        } else {

            System.out.println("Poor - High risk profile");

        }

        return roi;
    }

    int getAge() {

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        return age;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Vcube Banking Loan");

        // Child class object and child class reference
        PersonalLoan pl = new PersonalLoan();

        // Parent class method
        double salary = pl.getCustomerSalary();

        // Child class method
        int age = pl.getAge();

        // Parent class method
        int cibil = pl.getcibilScore();

        // Child class methods
        boolean aadhar = pl.isAadharValid();
        boolean pan = pl.isPanValid();
        boolean phone = pl.isPhoneValid();

        if (salary >= 100000 &&
            age >= 23 &&
            cibil >= 300 &&
            cibil <= 900 &&
            aadhar && pan && phone) {

            System.out.println("Congratulations!");
            System.out.println("You are eligible for Personal Loan");

            double roi = pl.getROI();
            System.out.println("Rate of Interest: " + roi + "%");

            pl.PersonalLoanDocInfo();

        } else {

            System.out.println("Focus on your career!");
            System.out.println("Sorry! Your loan application is rejected.");

        }
    }
}
