package TYSS;

import java.util.HashSet;

public class CountOfChar 
{
	public static void main(String args[])
	{
		String s = "Hello";
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character str:set)
		{
			int count = 0;
			for(int i=0;i<s.length();i++)
			{
				if(str==s.charAt(i))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(str+" present "+count+" times");
			}
		}
	}
}
