package logicalstatements.loops;
import java.util.Scanner;
// WAP to print Factors/Divisors of given number...?
public class Test1 {
	public static void main(String[]args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		findFactors(n);
		System.out.println("main method ended");
	}
	static void findFactors(int n) {
		for(int i=1; i<=n / 2; i++) {
			if(n%i == 0) {
				System.out.println( i + " ");
			}
		}
		System.out.println(" "+  n);
	}

}
