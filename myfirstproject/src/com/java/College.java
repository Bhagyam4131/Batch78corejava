package com.java;

public class College {
	static String CollegeName;
	String studentName;
	int studentId;
	int marks;
	public static void main(String[] args) {
		CollegeName="QIS College";
		College qis=new College();
		qis.studentName="Bhagya";
		qis.studentId=12;
		qis.marks=100;
		
		
		System.out.println("welcome to college");
		System.out.println("studentName:"+ qis.studentName);
		System.out.println("studentId:"+ qis.studentId);
		System.out.println("marks:"+ qis.marks);
		
		System.out.println("object2 created *************");
		
		
		College place=new College();
		place.studentName="sam";
		place.studentId=10;
		place.marks=200;
		
		
		System.out.println("welcome to college");
		System.out.println("studentName:"+ place.studentName);
		System.out.println("studentId:"+ place.studentId);
		System.out.println("marks:"+ place.marks);



	}

}
