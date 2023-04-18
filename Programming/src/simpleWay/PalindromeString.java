package simpleWay;

import java.util.Scanner;

public class PalindromeString
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.nextLine();
		String rev = "";
		int len = name.length();
		for(int i = len-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of the given string is "+rev);
		if(name.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
