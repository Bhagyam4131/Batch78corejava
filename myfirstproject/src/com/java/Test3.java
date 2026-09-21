package com.java;

public class Test3 {
	
	 static void  method1() {
		 System.out.println("this method called");
		
		
	}
	 static void  welcome(){
		 method1();
		
		
		System.out.println("welcome method called");
		
		
	}
	 void show() {
		 welcome();
			System.out.println("show method called");
			
		}
		void show2() {
			show();
			System.out.println("show2 method called");
		}


	public static void main(String[] args) {
		System.out.println("main method started");
		Test3 t=new Test3();
		t.show2();
		System.out.println("main method ended");
		

	}

}
