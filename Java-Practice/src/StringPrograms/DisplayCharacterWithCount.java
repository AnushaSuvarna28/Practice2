package StringPrograms;

import java.util.HashMap;

public class DisplayCharacterWithCount 
{
	public static void main(String[] args) 
	{
		String s = "Anusha Salian";
		HashMap<Character, Integer> hmap = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hmap.containsKey(s.charAt(i)))
					{
						hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
					}
			else
			{
				hmap.put(s.charAt(i), 1);
			}
		}
		System.out.println(hmap);
	}
}
