package com.section3;

public class InterfaceDemoInplementingClass implements IntefaceDeo
{
	@Override
	public void m1() 
	{
		System.out.println("This is m1()");
	}
	public static void main(String args[])
	{
		InterfaceDemoInplementingClass ic = new InterfaceDemoInplementingClass();
		ic.m1();
		IntefaceDeo.main();
	}

}
