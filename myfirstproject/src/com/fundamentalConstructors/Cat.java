package com.fundamentalConstructors;
class Animal{
	String color;
	String name;
	int age;

Animal(){
	System.out.println("no arg Constructor Animal");
	
}
Animal(Animal c){
	this.color=c.color;
	this.name=c.name;
	this.age=c.age;
}
}

public class Cat extends Animal {
	

Cat(){
	super();
}
Cat(Cat c){
	this.color=c.color;
	this.name=c.name;
	this.age=c.age;
}
	
	
	
	

	public static void main(String[] args) {
		Cat c= new Cat();
		c.color="white";
		c.name="abc";
		c.age=12;
		c.display();
		Cat c1=new Cat(c);
		c1.display();
		
		
		
		
	

	}
	void display() {
		System.out.println("cat color:"+color);
		System.out.println("cat name:"+name);
		System.out.println("cat age:"+age);
	}
}


