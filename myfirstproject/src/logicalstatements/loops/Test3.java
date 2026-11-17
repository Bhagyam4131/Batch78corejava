
package logicalstatements.loops;

import java.util.Scanner;

public class Test3 {

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
        int count=0;
        System.out.println("enter which we want: ");
        int n1=sc.nextInt();
    

        for (int i = 0; i <= n; i++) {
        if (isprime(i)) {
         	count++;
         	if(count==n1) {
         		 System.out.println(i + "-" + count);
         		
         		
         	}
                
            }
        }

      
    }
}
