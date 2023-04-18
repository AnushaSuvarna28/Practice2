package com.section3;

public class MethodOverloading 
{
	public void m1()
	{
		System.out.println("This is m1");
	}
	public void m1(int a,int b)
	{
		System.out.println("this is m1 argument");
	}

	public static void main(String[] args) 
	{
		MethodOverloading mo = new MethodOverloading();
		mo.m1();
		MethodOverloading mo1 = new MethodOverloading();
		mo1.m1(10,67);

	}

}
