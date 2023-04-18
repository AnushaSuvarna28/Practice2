package com.section3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 
{
	@Test(enabled = false)
	public void m1()
	{
		System.out.println("Hii this is m1");
	}
	@Test
	public void m2()
	{
		System.out.println("Hii this is m2");
		Reporter.log("This is from m2() method");
	}
	@Test
	public void a()
	{
		System.out.println("This is a");
		Reporter.log("This from a() method",true);
	}
}
