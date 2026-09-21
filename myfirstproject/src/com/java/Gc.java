package com.java;

public class Gc {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("fanial method");
		
		super.finalize();
	}
	void hello() {
		System.out.println("hello world");
		Gc c3=new Gc();
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Gc c=new Gc();
		System.out.println("c called");
		System.out.println("c1 called");
		System.out.println("c2 called");
		
		//finalized 
		c=null;
		System.gc();
		// reassigning 
		Gc c1=new Gc();
		Gc c2=new Gc();
		c2=c1;
		System.gc();
		//out of scope
		{
		Gc c3=new Gc();
		}
		//anonymous
		new Gc();
		System.gc();
		

	}

}
