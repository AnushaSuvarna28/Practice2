package Collection;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo 
{

	public static void main(String[] args) 
	{
		//Hashtable table = new Hashtable();	//capacity = 11, load factor = 0.75
		//Hashtable table = new Hashtable(initialcapacity);  //create hashtable object with some capacity
		//Hashtable table = new Hashtable(initialcapacity,loadfactor/fillratio); 
		
		Hashtable<Integer,String> htable = new Hashtable<Integer,String>();
		htable.put(101, "Anusha");
		htable.put(102, "Manisha");
		htable.put(103, "Demo");
		
		//to display all data
		System.out.println(htable);
		
		//to display all keys
		System.out.println(htable.keySet());
		
		//to display all values
		System.out.println(htable.values());
		
		//to get one value based on key
		System.out.println(htable.get(102));
		
		//to check whether key is there r not
		System.out.println(htable.containsKey(103));
		
		//to checck whether value is there r not
		System.out.println(htable.containsValue("Anusha"));
		
		//to display all values
		Set<Integer> keys = htable.keySet();  //keys are unique so return type is set
		Collection<String> values = htable.values();   //values are not unique so return type is collection
		
		//using for each loop to print all values

		for(Entry<Integer, String> entry:htable.entrySet())
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());     //insertion order not preserved
		}
		
		//using iterator displaying all elements

		Set<Entry<Integer, String>> s = htable.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> entry = (Entry)itr.next();
			System.out.println(entry.getKey()+ "    "+entry.getValue());
		}
	}
}
