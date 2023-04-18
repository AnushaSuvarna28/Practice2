package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//find occurance of each character in string using hashmap
public class OccuranceOfEachChar 
{
	public static void main(String[] args) 
	{
		String s = "abcgdsahdaf";
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i),1);
			}
		}
		Iterator<Entry<Character, Integer>> itr = hm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
