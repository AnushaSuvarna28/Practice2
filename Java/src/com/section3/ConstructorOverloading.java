package com.section3;

public class ConstructorOverloading 
{
	int a ;
	int b;
	String name;
	ConstructorOverloading(int a,int b)
	{
		this.a= a;
		this.b = b;
	}
	ConstructorOverloading(int a )
	{
		this.a = a;
	}
	ConstructorOverloading(String name)
	{
		this.name = name;
	}
	public static void main(String[] args) 
	{
		ConstructorOverloading co = new ConstructorOverloading("Anusha");
		System.out.println(co.a);
		System.out.println(co.b);
		System.out.println(co.name);
	}

}
