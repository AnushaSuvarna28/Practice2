package CollectionPractice;

import java.util.HashMap;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		// Elements ate stored as key and value pair
		// Duplicate keys are not allowed
		// Duplicate values are allowed
		// Null key is allowed once
		// Insertion order is not preserved
		// Default capacity is 16
		// Data Structure is HashTable
		// Stores heterogeneous data
		
		HashMap map = new HashMap();
		map.put(1, "Anusha");
		map.put('c', 123);
		map.put(12213.87980,true);
		map.put(null, "sdd");
		map.put(12, null);
		map.put("fsdf", null);
		System.out.println(map);
	}
}
