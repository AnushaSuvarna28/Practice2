package com.section1;

public class Car {
	String model;
	String colour;
	String brand;
	double price;
	int cap;
	Engine e;
	Car(String model,String colour,String brand,double price,int cap,Engine e)
	{
		this.model = model;
		this.colour = colour;
		this.brand = brand;
		this.price = price;
		this.cap = cap;
		this.e = e;
	}
public void ShowCarDetails()
{
	System.out.println(model);
	System.out.println(colour);
	System.out.println(brand);
	System.out.println(price);
	System.out.println(cap);
}
public void ShowEngineDetails()
{
	System.out.println(e.cc);
	System.out.println(e.eng_no);
}
}
