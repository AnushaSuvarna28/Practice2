package CollectionPractice;

import java.util.Hashtable;

public class HashTableDemo 
{

	public static void main(String[] args) 
	{
		// data stored as key and value pair
		// duplicate keys are not allowed
		// duplicate values allowed
		// null is not allowed as key and value
		// insertion order is not preserved
		// data structure is hashtable
		// default size is 11
		// it has 4 constructors
		//stores heterogeneous data
		
		Hashtable table = new Hashtable();
		table.put(12, "ayyo");
		table.put("a", "sdsd");
		table.put(13, 454);
		table.put(87,224);
		
		System.out.println(table);
		

	}

}
