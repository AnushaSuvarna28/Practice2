package com.section3;

public class ConstructorChaining 
{
	int a ;
	int b ;
	String name ;
	ConstructorChaining(int a)
	{
		this.a = a;
	}
	ConstructorChaining(int a,int b)
	{
		this(a);
		this.b=b;
	}
	ConstructorChaining(int a,int b,String name)
	{
		this(a,b);
		this.name = name;
	}
	public static void main(String[] args)
	{
		ConstructorChaining cc = new ConstructorChaining(10,20,"Anusha");
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.name);
	}

}
