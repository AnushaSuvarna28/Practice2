package com.section1;

public class Refill 
{
	int size;
	String shape;
	String colour;
	int capacity;
	Ink i ;
	Refill(int size,String shape,String colour,int capacity,Ink i)
	{
		this.size = size;
		this.shape = shape;
		this.colour = colour;
		this.capacity = capacity;
		this.i=i;
	}
	public void ShowRefillDetails()
	{
		System.out.println(size);
		System.out.println(shape);
		System.out.println(colour);
		System.out.println(capacity);
	}
	public void InkDetails()
	{
		System.out.println(i.colour);
		System.out.println(i.viscocity);
		System.out.println(i.combination);
	}

}
