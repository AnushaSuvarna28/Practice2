package simpleWay;

import java.util.Scanner;
//arrange as character digit and spl character 
public class CharDigitSplchar 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String name = sc.nextLine();
		String character = "";
		String digits = "";
		String splchar = "";
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				character = character+ch;
			}
			else if(Character.isDigit(ch))
			{
				digits = digits+ch;
			}
			else
			{
				splchar = splchar+ch;
			}
		}
		System.out.println(character+digits+splchar);
	}

}
