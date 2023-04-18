package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hmap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Anusha");
		map.put(2, "Kavya");
		map.put(3, "Keerthi");
		map.put(4, "Sampoorna");
		map.put(5, "Vasanthi");
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Integer k:map.keySet())
		{
			System.out.println(k+"  "+map.get(k));
		}
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
			
		}
	}
}