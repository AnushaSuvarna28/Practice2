package abstraction;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Occurance 
{
	public static void main(String[] args) 
	{
		String name = "Good Morning Everyone";
		String[] str = name.split(" ");
		String rev = "";
		for(int i=str.length-1;i>=0;i--)
		{
			rev = rev+str[i]+" ";
		}
		System.out.println(rev);
	}
}
