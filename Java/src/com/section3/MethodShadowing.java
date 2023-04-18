package com.section3;

public class MethodShadowing 
{

	public static void m1()
	{
		System.out.println("m1() parent is executing");
	}
	public void m2()
	{
		System.out.println("m2() parent is executing");
	}
}
