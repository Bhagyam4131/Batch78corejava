package com.java;

public class Institute {
	static String TrainerName1;
	static String TrainerName2;
	
	//instance variables
	String EmpName;
	int empId;
	String empDesignation;
	public static void main(String[] args) {
		TrainerName1="Srikantha";
		TrainerName2="Viswa";
		Institute t=new Institute();
		t.EmpName="bhagya";
		t.empId=101;
		t.empDesignation="jsf";
		System.out.println("TrainerName1:"+TrainerName1);
		System.out.println("TrainerName2:"+TrainerName2);
		System.out.println("EmpName:"+t.EmpName);
		System.out.println("empId:"+t.empId);
		System.out.println("empDesignation:"+t.empDesignation);
		
		System.out.println("object2 created *************");
		Institute t1=new Institute();
		t1.EmpName="sam";
		t1.empId=102;
		t1.empDesignation="dev";
		System.out.println("EmpName:"+t1.EmpName);
		System.out.println("empId:"+t1.empId);
		System.out.println("empDesignation:"+t1.empDesignation);
		
		System.out.println("object3 created *************");
		Institute t2=new Institute();
		t2.EmpName="seshu";
		t2.empId=103;
		t2.empDesignation="data science";
		System.out.println("EmpName:"+t2.EmpName);
		System.out.println("empId:"+t2.empId);
		System.out.println("empDesignation:"+t2.empDesignation);
		
		System.out.println("object4 created *************");
		Institute t3=new Institute();
		t3.EmpName="prameela";
		t3.empId=104;
		t3.empDesignation="os";
		System.out.println("EmpName:"+t3.EmpName);
		System.out.println("empId:"+t3.empId);
		System.out.println("empDesignation:"+t3.empDesignation);
		
		System.out.println("object5 created *************");
		Institute t4=new Institute();
		t4.EmpName="ram";
		t4.empId=105;
		t4.empDesignation="psf";
		System.out.println("EmpName:"+t4.EmpName);
		System.out.println("empId:"+t4.empId);
		System.out.println("empDesignation:"+t4.empDesignation);
		
		
		
		

	}

}
