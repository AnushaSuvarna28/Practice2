package CollectionPractice;

import java.util.TreeMap;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		//ele stored in key and value pair
		//duplicate keys are not allowed
		//duplicate values are allowed
		//Null key is not allowed
		//Null values are allowed
		//Data structure is red black tree
		//It has 4 constructor
		//It maintain ascending order
		
		TreeMap map = new TreeMap();
		map.put(12, "Anusha");
		map.put(13,"aasd");
		map.put(83,"dss");
		map.put(23, null);
		System.out.println(map);
	}

}
