
package Inheritance;

import java.util.Scanner;

public class LoanImp {

    static Scanner sc = new Scanner(System.in);

    double getCustomerSalary() {
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        return salary;
    }

    int getcibilScore() {
        System.out.println("Enter your CIBIL Score:");
        int cibil = sc.nextInt();
        return cibil;
    }

}
