package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hmap2 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
		hmap.put(101, "Anusha");
		hmap.put(102, "Amma");
		hmap.put(103,"Akka");
		hmap.put(104,"Dodda");
		hmap.put(105,"Poppa");
		
		//to print all entries
		System.out.println(hmap);
		
		//to print all keys
		System.out.println(hmap.keySet());
		
		//to retur all values
		System.out.println(hmap.values());
		
		//to get value based on key
		System.out.println(hmap.get(105));
		
		//to check whether key is there r not
		System.out.println(hmap.containsKey(103));
		
		//to check whether value is there r not
		System.out.println(hmap.containsValue("Amma"));
		
		//to get size of the map
		System.out.println(hmap.size());
		
		//to check whether the map is empty or not
		System.out.println(hmap.isEmpty());
		
		//to get all keys and values using for each
		for(Entry<Integer, String> map:hmap.entrySet())
		{
			System.out.println(map.getKey()+"  "+map.getValue());
		}
		
		//to get all values using iterator
		Set<Entry<Integer, String>> map = hmap.entrySet();
		Iterator<Entry<Integer, String>> s = map.iterator();
		while(s.hasNext())
		{
			Map.Entry entry = (Entry)s.next();
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}

	}

}
