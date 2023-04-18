//WAJP to print the no of vowels and consonants present in the given string

package com.section1;
import java.util.Scanner;

public class VowelsAndConsonants 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = s.nextLine().toLowerCase();
		char ch;
		int vcount =0,ccount =0;
		for(int i=0;i<name.length();i++)
		{
			ch = name.charAt(i);
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("Vowels count is: "+vcount);
		System.out.println("Consonants count is: "+ccount);
	}

}
