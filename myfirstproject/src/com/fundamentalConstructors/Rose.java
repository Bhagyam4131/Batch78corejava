package com.fundamentalConstructors;
class Flower{
	String color;
	String name;
	int price;
	Flower(){
		System.out.println("no arg constructor flower");
	}
	Flower(String color,String name,int price){
		this.color=color;
		this.name=name;
		this.price=price;
	}
	
	
}

public class Rose extends Flower{
	Rose(){
		super("red","lotus",30);
		System.out.println("no arg Constructor rose");
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Rose r=new Rose();
		r.display();
		

	}
	void display() {
		System.out.println("Flower color:"+color);
		System.out.println("Flower name:"+name);
		System.out.println("Flower price:"+ price);
	}

}
