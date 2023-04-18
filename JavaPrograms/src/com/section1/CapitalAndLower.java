
//WAP to convert first letter of given name into capital and rest in lower case.

package com.section1;
public class CapitalAndLower
{

	public static void main(String[] args) 
	{
		String name = "Anusha";
		String converted = name.toLowerCase();
		String firstletter = name.substring(0,1).toUpperCase();
		String remaining = name.substring(1,6);
		System.out.println(firstletter.concat(remaining));

	}

}
