package arrays;

import java.util.LinkedHashSet;

public class Demo2 
{
	public static void main(String[] args) 
	{
		String s = "aaabbbccceeegggfff";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for(Character ss:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ss==s.charAt(i))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(ss+" present "+count+" times");
			}
		}
	}
}
