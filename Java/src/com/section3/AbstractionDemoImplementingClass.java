package com.section3;

public class AbstractionDemoImplementingClass extends AbstractionDemo
{

	AbstractionDemoImplementingClass(int a, int b) 
	{
		super(a, b);
	}

	public static void main(String[] args) 
	{
		AbstractionDemoImplementingClass ac = new AbstractionDemoImplementingClass(10,20);
		ac.m1();
		System.out.println(ac.m2());
	}
	@Override
	public void m1() 
	{
		System.out.println("This is m1 method from child class");
		
	}

}
