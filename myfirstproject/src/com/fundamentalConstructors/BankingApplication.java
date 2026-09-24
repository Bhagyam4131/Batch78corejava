package com.fundamentalConstructors;

public class BankingApplication {
	int accountNumber;
	String CustomerName;
	String Acctype;
	int balance;
	
	
	BankingApplication(int accnum,String cusname,String acctype,int bal ){
		accountNumber=accnum;
		CustomerName=cusname;
		Acctype=acctype;
		balance=bal;
		
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
		BankingApplication b=new BankingApplication(3872902,"sam","sbi",5000);
		b.bankinfo();
		BankingApplication b1=new BankingApplication(3872901,"bhagya","indian",2000);
		b1.bankinfo();
		System.out.println("main method endede");
		
		

	}
	void bankinfo() {
		System.out.println("person accnum:"+accountNumber);
		System.out.println("person cusname:"+CustomerName);
		System.out.println("person acctype:"+Acctype);
		System.out.println("check the balance:"+balance);
		}

}
