package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CountOfChar 
{
	public static void main(String[] args) 
	{
		String s = "I love India".toLowerCase();
		HashMap<Character, Integer> hmap = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hmap.containsKey(s.charAt(i)))
			{
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
			}
			else
			{
				hmap.put(s.charAt(i),1);
			}
		}
		Iterator<Entry<Character, Integer>> itr = hmap.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
