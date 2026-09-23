package com.fundamentalConstructors;
//*Java* 
//1.Create a Java class Employee with the following requirements:

//->Create instance variables name, id, and salary.
//Create a parameterized constructor to initialize these variables.

//->Use the this keyword to differentiate instance variables from constructor parameters.

//->Create an object in the main() method by passing employee details.
//Display the employee details.

public class Employee {
	String name;
	int id;
	double sal;
	Employee(String name,int id,double sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee emp=new Employee("bhagya",1,180000);
		emp.empinfo();	
		System.out.println("main method ended");
	

	}
	void empinfo() {
		System.out.println("Employee name:"+name);
		System.out.println("Employee id:"+id);
		System.out.println("Employee sal:"+sal);
		
	}

}
