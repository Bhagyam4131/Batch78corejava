package logicalstatements.loops;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int t=n;
		while(n>0) {
	     int r=n*n;
	     n=r/10;
		sum=r+n; 
		
		

	}n=sum;
	if(t==n) {
		System.out.println("neon number:");
	}else {
		System.out.println("Not a Neon Number:");
	}
		
	}
	
	}


