package com.fundamentalConstructors;

public class Vehicles{
	String type;
	 Vehicles(String type){
		this.type=type;
System.out.println("no arg constructor vehicle");
	}
}
	
class Car1 extends Vehicles{
	String brand;
	int price;
	Car1(String type, String brand,int price){
		super(type);
		this.brand=brand;
		this.price=price;
		System.out.println("no arg constructor Car");
	}
}
class ElectricCar extends Car1{
	int batteryCapacity;
	ElectricCar(String type,String brand,int price,int batteryCapacity){
		super(type,brand,price);
		this.batteryCapacity=batteryCapacity;
		System.out.println("no arg constructor ElectricCar");
	}

	


	public static void main(String[] args) {
		System.out.println("main method started");
		ElectricCar v=new  ElectricCar("Electic","Tesla",5000000,100);
		 v.display();
		 
	}
	void display() {
		System.out.println("Vehicle type:"+type);
		System.out.println("Vehicle brand:"+brand);
		System.out.println("Car price:"+price);
		System.out.println("car batteryCapacity:"+batteryCapacity);
		
	}
	}

