//exception object propogation
package com.section3;
public class ExceptionHandling1 
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 0;
		try
		{
		m1(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisible by zero is not allowed");
		}
	}
	public static void m1(int a, int b)
	{
		int c = a/b;
		
	}

}
