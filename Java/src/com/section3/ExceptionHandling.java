package com.section3;
import java.util.Scanner;
public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		System.out.println("Enter another number");
		int b = s.nextInt();
		try 
		{
		int c = a/b;
		System.out.println(c);
		System.out.println("Pgm ends");
		}
		catch(ArithmeticException x)
		{
			System.out.println("Zero is not allowed");
		}

	}

}
