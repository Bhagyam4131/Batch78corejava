package com.java;

public class TaskPencil {
	int money=100;
	int pencilcost=7;
	int  Pencils =money / pencilcost;
	int Balance=money % pencilcost;
	

	public static void main(String[] args) {
		int money=100;
		int pencilcost=7;
		int  Pencils =money / pencilcost;
		int Balance=money % pencilcost;
		
		
		System.out.println("Pencils buy :"+ Pencils);
		System.out.println("Balance :"+Balance);
		

	}

}
