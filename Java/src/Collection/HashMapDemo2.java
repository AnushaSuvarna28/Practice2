package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 
{

	public static void main(String[] args) 
	{
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("A", "Anusha");
		map.put("B", "Bharathi");
		map.put("C", "Chandravathi");
		map.put("D", "Divya");
		map.put("U", "Usha");
		
		//fetching all keys 
		for(String key:map.keySet())
		{
			System.out.print(key+" ");
		}
		
		System.out.println();
		
		//fetching all values
		for(String value:map.values())
		{
			System.out.print(value+" ");
		}
		
		System.out.println();
		
		//fetch all entries using key 
		for(String keyref : map.keySet())
		{
			System.out.println(keyref +"   "+map.get(keyref));
		}
		
		//Fetch all entries using Entry interface methods
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"           "+entry.getValue());
		}

		//Fetch all entries using iterator method
	    Set s = map.entrySet();
	    
	    Iterator itr = s.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry entry = (Entry) itr.next();
	    	System.out.println(entry.getKey()+"  "+entry.getValue());
	    }
	}

}
