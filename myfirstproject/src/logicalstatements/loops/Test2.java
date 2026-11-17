package logicalstatements.loops;

import java.util.Scanner;

//WAP to find the given number is Perfect or not ..?
//perfect number:sum of the factors is equal to the given number excluding
//ex:input:6-->1 2 3= 1+2+3=6
//output: true
public class Test2 {
	public static void main(String[]args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		isPerfect(n);
		System.out.println("main method ended");

}
	 static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum =sum + i;
			}
		}
		if(sum==n) {
			status=true;
		}
		return status;
	}
}
