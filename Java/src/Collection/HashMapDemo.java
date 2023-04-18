package Collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(101, "Anusha");
		map.put(102, "Bhavya");
		map.put(103, "Divya");
		map.put(104,"Anusha");
		map.put(105, "Navya");
		
		//fetch all entries from map
		System.out.println(map.entrySet());
		
		//fetch all fetch all keys from map
		System.out.println(map.keySet());
		
		//fetch all values from map
		System.out.println(map.values());
		
		//fetch a value based on key
		System.out.println(map.get(102));
	
		//remove a value based on key
		System.out.println(map.remove(105));
		
		//check whether key is present or not
		System.out.println(map.containsKey(102));
		
		//check whether value is present or not
		System.out.println(map.containsValue("Anusha"));
		
		//check whether the map is empty or not
		System.out.println(map.isEmpty());
		
		//check how many entries are there in map
		System.out.println(map.size());
		
		//clear all the entries
		map.clear();
		
		System.out.println(map.entrySet());
		
		
	}

}
