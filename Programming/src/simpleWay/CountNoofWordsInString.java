package simpleWay;

import java.util.Scanner;

public class CountNoofWordsInString 
{

	public static void main(String[] args)
	{
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter a string");
		//String name = sc.nextLine();
		String name ="sffggh hjhk hjhk";
		int count = 1;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ' && name.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("No. of words in a string is "+count);
	}

}
