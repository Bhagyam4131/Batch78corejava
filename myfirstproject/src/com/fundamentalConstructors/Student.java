package com.fundamentalConstructors;

public class Student {
	 static int count=0;
	 Student(){
		count++;
	}

	public static void main(String[] args) {
		Student t=new Student();
		Student t1=new Student();
		Student t2=new Student();
		
		System.out.println("count:"+count);
		
		

	}

}
