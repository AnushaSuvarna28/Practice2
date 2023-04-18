package StringPrograms;

import java.util.Arrays;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
		String s = "My name is Anusha";
				  //ym eman si ahsunA
		String[] str = s.split(" ");
		String total = "";
		for(String st:str)
		{
			String word = st;
			String rev = "";
			for(int i=word.length()-1;i>=0;i--)
			{
				rev = rev+word.charAt(i);
			}
			total = total+rev+" ";
		}
		System.out.println(total);
	}
}
