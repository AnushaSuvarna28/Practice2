package com.section3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert 
{
	@Test
	public void checkAssert() 
	{
		String actual = "Google";
		String exp = "Gopogl";
		
		//compare using hard assertion
		Assert.assertEquals(actual,exp);
		Assert.assertTrue(actual.contains(exp));
		
		//compare using soft assert
		SoftAssert sa  = new SoftAssert();
		sa.assertEquals(actual, exp);
		sa.assertTrue(actual.contains(exp));
		
		System.out.println("Test Case Passed");
		sa.assertAll();

	}

}
