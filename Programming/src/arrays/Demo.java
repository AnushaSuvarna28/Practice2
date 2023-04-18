package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
class Demo
{
	public static void main(String[] args) {
		
	
	String s = "Mom dad child".toLowerCase();
	String[] str = s.split(" ");
	String total = "";
	for(int i=0;i<str.length;i++)
	{
		String word = str[i];
		String rev = "";
		for(int j=word.length()-1;j>=0;j--)
		{
			rev = rev+word.charAt(j);
		}
		if(rev.equals(word))
		{
			total=total+rev+" ";
		}
	}
	System.out.println(total);
	}
}





