package StringPrograms;

import java.util.Arrays;

public class ReverseSecondAndFourthWordsInString 
{
	public static void main(String[] args) 
	{
		String s = "Anusha Archana Kavya Amma";
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));
		String temp = str[1];
		str[1] = str[str.length-1];
		str[str.length-1] = temp;
		System.out.println(Arrays.toString(str));
	}
}
