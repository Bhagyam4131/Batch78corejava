package com.fundamentalConstructors;

public class Bankacc {
	int accnum;
	String acchN;
	int bal;
	String branch;

	Bankacc(int accnum, String acchN, int bal, String branch) {
		this.accnum=accnum;
		this.acchN=acchN;
		this.bal=bal;
		this.branch=branch;
		
		System.out.println("parametrized constructor");

	}
	


	public Bankacc(Bankacc b,int accnum,String acchN) {
		this.bal=b.bal;
		this.branch=b.branch;
		this.accnum =accnum;
		this.acchN = acchN;
	}

	public static void main(String[] args) {
		Bankacc b = new Bankacc(2561,"Bhagya",2000,"sbi");
		b.display();
		Bankacc b1 = new Bankacc(b,34678,"sam");
		b1.display();

	}

	void display() {
		System.out.println("accnum:" + accnum);
		System.out.println("acchN:" + acchN);
		System.out.println("bal:" + bal);
		System.out.println("branch:" + branch);
	}

}
