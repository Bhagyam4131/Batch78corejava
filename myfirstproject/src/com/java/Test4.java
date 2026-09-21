package com.java;

public class Test4 {
	static void  welcome(){
		
		
		
		System.out.println("welcome method called");
		
		
	}
	 void show() {
		 welcome();
			System.out.println("show method called");
			
		}
	
	static {
		System.out.println("this method1 called");
		Test4 t=new Test4();
		t.show();
		
	}
	{
		System.out.println("this method2 called");
	}

	
	


	public static void main(String[] args) {
		

	}

}
