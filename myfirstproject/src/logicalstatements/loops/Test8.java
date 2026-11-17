package logicalstatements.loops;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Decimal number: ");
		int n= sc.nextInt();
		int r=0;
		String dec=" ";
		while(n>0) {
			r=n%10;
			n=n/10;
			dec=r+dec;
		}
		System.out.println(dec);

	}

}
