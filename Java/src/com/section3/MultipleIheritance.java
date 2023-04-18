package com.section3;

public class MultipleIheritance implements A,B,C
{
@Override
	public void m1() 
	{
		System.out.println("This is m1 method from class ");
		
	}
	public static void main(String args[])
	{
		MultipleIheritance mi = new MultipleIheritance();
		mi.m1();	
	}


}
