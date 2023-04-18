package com.section1;
import java.util.Scanner;

public class StrongOrNot 
{
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			int fact = 1;
			for(int i=1;i<=rem;i++)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			n=n/10;
		}
		if(sum == temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	
	}
}
