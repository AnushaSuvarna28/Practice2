package com.section3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HierarchyOfAnnotations 
{
	@BeforeSuite
	public void openServerConnection()
	{
		System.out.println("Open server connection");
	}
	@BeforeTest
	public void openDatabaseConnection()
	{
		System.out.println("Open database connection");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch the  browser");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login to application");
	}
	@Test
	public void test1()
	{
		System.out.println("Customer creation");
	}
	@Test
	public void test2()
	{
		System.out.println("Employee creation");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout to application");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close the  browser");
	}
	@AfterTest
	public void closeDatabaseConnection()
	{
		System.out.println("close database connection");
	}
	@AfterSuite
	public void closeServerConnection()
	{
		System.out.println("close server connection");
	}
}
