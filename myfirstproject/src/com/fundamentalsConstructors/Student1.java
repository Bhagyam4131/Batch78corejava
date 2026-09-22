package com.fundamentalsConstructors;

public class Student1 {
	int sid;
	String name;
	Student1(int id,String sname){
		sid=id;
		name=sname;
		
	}
	Student1(){
		System.out.println("the constructor");
		
	}

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.sid=101;
		s.name="bhagya";
		s.Studentinfo();
		Student1 s1=new Student1();
		s1.Studentinfo();
		Student1 s2=new Student1(102,"sam");
		s2.Studentinfo();
		
		

	}
	void Studentinfo() {
		System.out.println("Student id:"+ sid);
		System.out.println("Student name:"+ name);
	}

}
