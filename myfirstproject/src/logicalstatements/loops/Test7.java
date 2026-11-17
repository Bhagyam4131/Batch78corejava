package logicalstatements.loops;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the boolean number");
		int n= sc.nextInt();
		int r=0;
		String bin=" ";
		while(n>0) {
			r=n%2;
			n=n/2;
			bin=r+bin;
		}
		System.out.println(bin);

	}

}
