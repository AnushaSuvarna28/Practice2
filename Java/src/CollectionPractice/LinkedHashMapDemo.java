package CollectionPractice;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo 
{

	public static void main(String[] args) 
	{
		// Data stored as key and value pair
		// Insertion order is preserved
		// Duplicate keys are not allowed
		// Duplicate values are allowed
		// Null key is allowed once
		// Null values are allowed multiple times
		// Default size is 16
		// Data Structure is HashTable and Doubly Linkedlist
		// it has 5 constructors
		
		LinkedHashMap map = new LinkedHashMap();
		map.put(12, "Anusha");
		map.put('a',null);
		map.put(null, "Kavya");
		//map.put(null, "Shravya");
		map.put("Kavya", null);
		System.out.println(map);
	}

}
