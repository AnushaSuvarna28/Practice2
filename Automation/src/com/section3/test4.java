package com.section3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test4
{
	@Test(dependsOnMethods = "signup")
	public void signin()
	{
		System.out.println("sign in that application");
	}
	@Test
	public void signup()
	{
		System.out.println("first sign up ");
	}
}
