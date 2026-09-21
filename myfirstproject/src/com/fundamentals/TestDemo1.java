package com.fundamentals;

public class TestDemo1 {
	short Employee_ID=22565;
	byte  Employee_age=21;
	int Employee_salary=20000;
	char Employee_grade='A';
	float Years_of_Experience=2.5F;
	boolean Employee_is_active= true;
	int Number_of_leaves=3;
	long Employee_Phone_related_numeric_value=328790L;
	void display() {
		System.out.println("Employee_ID:"+Employee_ID);
		System.out.println("Employee_age:"+Employee_age);
		System.out.println("Employee_salary:"+Employee_salary);
		System.out.println("Employee_grade:"+Employee_grade);
		System.out.println("Employee_Years_of_Experience:"+Years_of_Experience);
		System.out.println("Employee_is_active:"+Employee_is_active);
		System.out.println(" Number_of_leaves:"+Number_of_leaves);
		System.out.println("Employee_Phone_related_numeric_value:"+Employee_Phone_related_numeric_value);
	}
	
	
	

	public static void main(String[] args) {
		TestDemo1 n=new TestDemo1();
		n.Employee_ID=22565;
		n.Employee_age=21;
		n. Employee_salary=20000;
		n.Employee_grade='A';
		n. Years_of_Experience=2.5F;
		n. Employee_is_active= true;
	     n. Number_of_leaves=3;
		n. Employee_Phone_related_numeric_value=328790L;
		System.out.println("Details***********");
		n.display();
		
		TestDemo1 n1=new TestDemo1();
		n1.Employee_ID=22566;
		n1.Employee_age=22;
		n1. Employee_salary=30000;
		n1.Employee_grade='B';
		n1. Years_of_Experience=2.7F;
		n1. Employee_is_active= false;
	     n1. Number_of_leaves=2;
		n1. Employee_Phone_related_numeric_value=328787L;
		System.out.println("Details***********");
		n1.display();
		
		
		
		
		

	}

}
