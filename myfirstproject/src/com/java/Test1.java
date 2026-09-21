package com.java;

public class Test1 {
	void show() {
		System.out.println("method show  class");
	}
	public static void method1() {
		System.out.println("method1 class");
	}
	
	public static void welcome(){
		Test1 t=new Test1();
		t.show();
		
		System.out.println("method class");
		
		 
	 }

	public static void main(String[] args) {
	System.out.println("main method started");
	method1();
	welcome();
	System.out.println("main method ended");
	
	

	}

}
