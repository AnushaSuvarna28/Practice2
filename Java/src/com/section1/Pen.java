package com.section1;

public class Pen 
{
	int size;
	int price;
	Fill f;
	Pen(int size,int price,Fill f)
	{
		this.size = size;
		this.price = price;
		this.f = f;
	}
	public void showPenDetails()
	{
		System.out.println(size);
		System.out.println(price);
	}
	public void showFillDetails()
	{
		System.out.println(f.size);
		System.out.println(f.shape);
		System.out.println(f.colour);
		System.out.println(f.capacity);
	}

}
