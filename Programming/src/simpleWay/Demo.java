package simpleWay;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
//replace space with coma in a given string
public class Demo 
{
	public static void main(String args[])
	{
		String s = "Anusha Suvarna from Udupi";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				ch[i] = ',';
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"");
		}
	}
}
