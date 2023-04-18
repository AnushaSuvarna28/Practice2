package com.section3;

public abstract class AbstractionDemo 
{
	
	{
		System.out.println("It is a non static multiline initializer");
	}
	int a;
	int b;
	AbstractionDemo(int a,int b)
	{
		this.a = a;
		this.b=b;
	}
	public static void main(String[] args) 
	{
		System.out.println("This is main method");
	}
	
	abstract public void m1();
	
	public static String m2()
	{
		return "Hii";
	}
	public void m3()
	{
		System.out.println("This is m3 non static method from abstract class");
	}
	static
	{
		System.out.println("This is a static multiline initializer");
	}

}
