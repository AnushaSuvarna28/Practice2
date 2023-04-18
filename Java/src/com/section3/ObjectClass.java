package com.section3;

public class ObjectClass 
{
	int a = 10;
	int b = 20;
	int c = 30;
	ObjectClass(int a,int b,int c)
	{
	this.a = a;
	this.b = b;
	this.c = c;
	}
	public static void main(String[] args) 
	{
		ObjectClass o = new ObjectClass(10,20,30);
		ObjectClass o1 = new ObjectClass(20,30,40);
		ObjectClass o2= new ObjectClass(30,40,50);
		System.out.println(o); //i.toString()
		System.out.println("*******************************");
		System.out.println(o1); // i1.toString
		System.out.println("*******************************");
		System.out.println(o2); //i2.toString
	}
	public String toString()
	{
		return "a value is "+a+"\nb value is "+b+"\nc value is "+c;
		
	}

}
