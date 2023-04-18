package simpleWay;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountWordOccuranceinString
{

	public static void main(String[] args)
	{
		String name = "I am good girl aas girl";
		String[] words = name.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String word1 = words[i];
			int count=0;
			for(int j=0;j<words.length;j++)
			{
				String word2 = words[j];
				if(word1.equals(word2)&&(i>j))
				{
					break;
				}
				if(word1.equals(word2))
				{
					count++;
				}
			}
			if(count>0) // to count duplicates we have to give count>1 and for unique values we have to give count==1
			{
				System.out.println(word1+" ----> "+count+" times");
			}
		}
		
	}
}
