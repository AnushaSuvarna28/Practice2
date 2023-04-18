package com.section3;

import java.util.Objects;

public class Pen 
{
	double price;
	Pen(double price)
	{
		this.price = price;
	}
	public int hashCode()
	{
		return Objects.hash(price);
	}
	public static void main(String args[])
	{
		Pen p1 = new Pen(100.898);
		Pen p2 = new Pen(100.898);
		int h1 = p1.hashCode();
		int h2 = p2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1 == h2);
	}

}
