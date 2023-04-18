package simpleWay;

import java.util.Scanner;

public class ReverseeachWordsinString
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  string");
		String name = sc.nextLine();
		String reverseString = "";
		String[] words = name.split(" ");
		for(String w:words)
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword = reverseword+w.charAt(i);
			}
			reverseString= reverseString+reverseword+" ";
		}
		System.out.println("Reverse of the string is "+reverseString);
	}

}
