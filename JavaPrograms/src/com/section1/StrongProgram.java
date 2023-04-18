package com.section1;
import java.util.Scanner;

public class StrongProgram 
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = s.nextInt();
	int rem = 0;
	int sum = 0;
	int temp = n;
	while(n>0)
	{
		rem = n%10;
		int fact =1;
		for(int i=1;i<=rem;i++)
		{
			fact = fact*i;
		}
		sum = sum+fact;
		n=n/10;
	}
	if(temp == sum)
	{
		System.out.println("Strong Number");
	}
	else
	{
		System.out.println("Not Strong Number");
	}
	
	}
}
