// Write a Java program to create a Product class with productId, productName,
//price, and quantity. Initialize product1 using a parameterized constructor and create 
//product2 using a copy constructor. Change the quantity of 
//product2 to 3 and use a calculateTotal() method to display the total 
//price of both products. Verify that changing product2 does not affect product1

package com.fundamentalConstructors;

public class Product {
	int pro_id;
	String p_name;
	int price;
	int quantity;

	Product(int pro_id, String p_name, int price, int quantity) {
		this.pro_id = pro_id;
		this.p_name = p_name;
		this.price = price;
		this.quantity = quantity;

	}

	Product(Product p, int quantity) {
		this.pro_id = p.pro_id;
		this.p_name = p.p_name;
		this.price = p.price;
		this.quantity = quantity;

	}
	void calculatortotal() {
		 //return price*quantity;
		System.out.println(price*quantity);
		
	}

	public static void main(String[] args) {
		Product p = new Product(1, "soaps", 300, 2);
		p.display();
		Product p1 = new Product(p, 4);
		p1.display();

	}

	void display() {
		System.out.println("product id:" + pro_id);
		System.out.println("product Name:" + p_name);
		System.out.println("product price:" + price);
		System.out.println("product quantity:" + quantity);
		//System.out.println("Total:"+calculatortotal());
		calculatortotal();
	}

}
