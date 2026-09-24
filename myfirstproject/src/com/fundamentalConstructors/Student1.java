package com.fundamentalConstructors;

public class Student1 {
	int sid;
	String sname;
	int age;
	Student1(){
		sid=1;
		sname="bhagya";
		age=21;
	}

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.studinfo();		
		
		

	} 
	void studinfo() {
		System.out.println("Studentid:"+sid);
		System.out.println("Studentname:"+sname);
		System.out.println("Studentage:"+age);
	}

}
