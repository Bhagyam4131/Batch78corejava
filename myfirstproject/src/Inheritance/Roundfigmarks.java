package Inheritance;

import java.util.Arrays;

public class Roundfigmarks {
	public static void main(String[] args) {
		int[] arr= {99,95,71,84,81,75,60};
		for(int i=0;i<arr.length;i++) {
			int r=arr[i]%10;
			if(r>5) {
			arr[i]=arr[i]+(10-r);
		}else {
			arr[i]=arr[i]-r;
		}
		
	}
		System.out.println(Arrays.toString(arr));
			
		}

}

