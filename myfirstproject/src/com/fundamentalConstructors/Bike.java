package com.fundamentalConstructors;
// parent class

class Vehicle {

    String model;
    String brand;
    int price;

    Vehicle() {
        System.out.println("No argument constructor Vehicle");
    }
}
//child class
public class Bike extends Vehicle {

    Bike() {
        super();   // Parent class constructor call
        System.out.println("No argument constructor Bike");
    }

    public Bike(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        System.out.println("Main method started");

        Bike b = new Bike();

        b.bikeinfo();
       
        

        System.out.println("Main method ended");
    }

    void bikeinfo() {
        System.out.println("Model of the bike: " +super. model);
        System.out.println("Brand of the bike: " + super.brand);
        System.out.println("Price of the bike: " +super. price);
    }
}