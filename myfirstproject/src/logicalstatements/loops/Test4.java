package logicalstatements.loops;

import java.util.Scanner;

public class Test4 {
	static boolean isprime(int n) {
    	boolean status=true;

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
              
               
            }
        }

        return status;
    }

	public static void main(String[] args) {
		System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int flag=0;
         
        	if(flag==0) {
        		System.out.println("prime");
        	}
        	else {
        		System.out.println("not prime");
        	}
        	 

	}

}
