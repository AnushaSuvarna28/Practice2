package CollectionPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapByKeys 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("N", 1);
		map.put("Z", 8);
		map.put("A", 10);
		map.put("B", 20);
		map.put("Y",23);
		
		//Asc order
		TreeMap<String, Integer> t = new TreeMap<>(map);
		System.out.println(t);
		
		//Desc order
		System.out.println(t.descendingMap());
		
	}
}
