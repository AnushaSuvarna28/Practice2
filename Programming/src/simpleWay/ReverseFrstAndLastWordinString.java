package simpleWay;

import java.util.Scanner;

public class ReverseFrstAndLastWordinString
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.nextLine();
		String str[] = name.split(" ");
		String temp = str[0];
		str[0] = str[str.length-1];
		str[str.length-1]=temp;
		/*for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}*/
		for(String s:str)
		{
			System.out.print(s+" ");
		}
	}

}
