package com.springcore.ci;

public class Adition {

	private int a;
	private int b;
	public Adition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	System.out.println("cons:int");
	}


	public Adition(double a, double b) {
		super();
		this.a =(int) a;
		this.b =(int) b;
		System.out.println("const double");
	}

public void doSum() {
	System.out.println(this.a + this.b);
}
}
