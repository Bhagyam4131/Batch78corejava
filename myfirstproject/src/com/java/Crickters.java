package com.java;

public class Crickters {
	static  int countryId;
	static  String countryName;
	//instances variables
	int jersyno;
	String crickterName;

	

	public static void main(String[] args) {
		System.out.println("Main method started");
		// TODO Auto-generated method stub
		System.out.println("Welcome to India");
		System.out.println("countryId:"+ countryId);
		System.out.println("contryName:"+ countryName);
		countryId=91;
		countryName="India";
		Crickters msd = new Crickters();
		msd.jersyno=7;
		msd.crickterName="Dhoni";
		System.out.println("jersyno:" + msd.jersyno);
		System.out.println("crickterName:" + msd.crickterName);
		System.out.println("obj2 created************");
		Crickters vk= new Crickters();
		vk.jersyno=18;
		vk.crickterName="Virat Kohil";
		System.out.println("jersyno:" + vk.jersyno);
		System.out.println("crickterName:" + vk.crickterName);
		System.out.println("obj3 created************");
		Crickters hitman= new Crickters();
		hitman.jersyno=18;
		hitman.crickterName="Virat ";
		System.out.println("jersyno:" + hitman.jersyno);
		System.out.println("crickterName:" + hitman.crickterName);
		
		
		
		
	}

}
