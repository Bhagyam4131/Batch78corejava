package com.fundamentalConstructors;

public class Bankacc {
	int accnum;
	String acchN;
	int bal;
	String branch;

	Bankacc(int accnum, String acchN, int bal, String branch) {
		System.out.println("parametrized constructor");

	}

	public Bankacc(Bankacc b) {
		this.accnum = b.accnum;
		this.acchN = b.acchN;
	}

	public static void main(String[] args) {
		Bankacc b = new Bankacc(21356,"bhagya",3000,"sbi");
		b.accnum = 2561;
		b.acchN = "Bhagya";
		b.bal = 2000;
		b.branch = "sbi";
		b.display();
		Bankacc b1 = new Bankacc(b);
		b1.bal=3000;
		b1.branch="india";
		b1.display();

	}

	void display() {
		System.out.println("accnum:" + accnum);
		System.out.println("acchN:" + acchN);
		System.out.println("bal:" + bal);
		System.out.println("branch:" + branch);
	}

}
