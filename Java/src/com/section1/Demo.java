package com.section1;
//count words occurance in a string
public class Demo 
{

	public static void main(String[] args) 
	{
		String name = "Good mo mo ne mo eveneing";
		name = name.toLowerCase();
		String str[] = name.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String word1 = str[i];
			int count = 0;
			for(int j=0;j<str.length;j++)
			{
				String word2 = str[j];
				if(word1.equals(word2)&&(i>j))
				{
					break;
				}
				if(word1.equals(word2))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(word1+" -----> "+count);
			}
		}
	}
}
