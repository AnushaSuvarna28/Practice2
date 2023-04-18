package simpleWay;

import java.util.Scanner;

public class CountwordsinString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.nextLine();
		String str[] = name.split(" ");
		int count = 0;
		for(int  i=0;i<str.length;i++)
		{
			count++;
		}
		System.out.println("Count of words in a string is "+count);
	}

}
