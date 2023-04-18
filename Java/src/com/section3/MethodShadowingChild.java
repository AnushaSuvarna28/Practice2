package com.section3;

public class MethodShadowingChild extends MethodShadowing
{

	public static void m1()
	{
		System.out.println("m1() child is executing");
	}
	public void m2()
	{
		System.out.println("m2() child is executing");
	}
}
