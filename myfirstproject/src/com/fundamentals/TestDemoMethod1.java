package com.fundamentals;

public class TestDemoMethod1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		getAgeInfo(21);
		getFUllName("BhagyaLaksmi","S");
		weightinfo(65.0);
		heightinfo(55);
		getgender('M');
		pincode(522435);
		
		
		System.out.println("main method ended");
		

	}
	
	static void pincode(int pincode) {
		System.out.println("pincode :"+ pincode);
	}
	static void getgender(char gender) {
		System.out.println("The person gender is:"+ gender);
	}
	static void heightinfo(float height) {
		System.out.println("The Person height is:"+height);
		
	}
	static void weightinfo(double weight ) {
		System.out.println("The Person weight is:"+ weight);
		
	}
	static void getFUllName(String fname, String lname) {
		System.out.println("The Person fullname is:"+ fname + " " + lname);
	}
	
	static void getAgeInfo(int age) {
		System.out.println("Age of the Person is : " + age);
	}

}
