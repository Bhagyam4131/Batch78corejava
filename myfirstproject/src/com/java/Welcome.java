package com.java;

public class Welcome {

	public static void main(String[] args) throws ClassNotFoundException{
	System.out.println("main method started");
		System.out.println("welcome to java");
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		Class.forName("com.java.Welcome");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		System.out.println("main method ended");
		
		
		
	
	}

}
