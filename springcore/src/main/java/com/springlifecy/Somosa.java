package com.springlifecy;

public class Somosa {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Somosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Somosa [price=" + price + "]";
}

public void init() {
	System.out.println("init");
}
public void destror() {
	System.out.println("dest");
}
}
