package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		//HashSet hs = new HashSet(); //default capacity is 16 load factor is 0.75
		
		//HashSet hs = new HashSet(100); //capacity is 100
		
		//HashSet hs = new HashSet(100,(float)0.95);  capacity 100 and load factor is 95%
		
		//if u want to store elements of same datatype
		//HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet hs = new HashSet(); 
		
		//add elements 
		hs.add("anusha");
		hs.add(1000);
		hs.add(false);
		hs.add(100.454);
		hs.add('A');
		
		//print all elements
		System.out.println(hs);    //insertion order not preserved
		
		//remove a element
		hs.remove(false);
		
		//print elements after removing
		System.out.println(hs);
		
		//here we donnt hv get() method to print specific data
		
		//searching
		System.out.println(hs.contains("anusha"));
		System.out.println(hs.contains("amma"));
		
		//checking whether hashset is empty or not
		System.out.println(hs.isEmpty());
		
		//print elements using for each loop
		for(Object hset:hs)
		{
			System.out.println(hset);
		}
		
		//print elements using iterator
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			Object it = itr.next();
			System.out.println(it);
		}
	}

}
