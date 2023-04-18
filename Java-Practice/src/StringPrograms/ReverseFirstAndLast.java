package StringPrograms;

import java.util.Arrays;

public class ReverseFirstAndLast 
{
	public static void main(String[] args) 
	{
		String s = "Anusha is a gud girl";
		String[] str = s.split(" ");
		String temp = str[0];
		str[0] = str[str.length-1];
		str[str.length-1] = temp;
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}
