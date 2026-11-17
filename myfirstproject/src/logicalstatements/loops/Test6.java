package logicalstatements.loops;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		while(n>9) {
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			n=sum;
			
			
		}
		if(n==1) {
			System.out.println("Magic number");
		}else{
			System.out.println("Not Magic number");
		}
		
		

	}

}
