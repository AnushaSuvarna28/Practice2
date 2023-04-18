package com.section3;

import java.util.Scanner;

public class DateAge
{

	public static void main(String[] args) throws AgeTooLessException, AgeTooHighException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(age<21)
		{
			throw new AgeTooLessException();
		}
		else if (age>30)
		{
			throw new AgeTooHighException();
		}
		else
		{
			System.out.println("Perfect for dating");
		}
	}

}
