package simpleWay;

import java.util.Scanner;

public class NumofOddEvenDigits 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;
		while(n>0)
		{
			int rem = n%10;
			if(rem%2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			n=n/10;
		}
		System.out.println("Number of even digits is "+even);
		System.out.println("Number of odd digits is "+odd);
	}

}
