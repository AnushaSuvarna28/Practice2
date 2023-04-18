package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HMap1 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
		hmap.put(1, "Anusha");
		hmap.put(2, "Keerthi");
		hmap.put(3, "Sampoorna");
		hmap.put(4, "Vasanthi");
		hmap.put(5, "Lalitha");
		Set<Entry<Integer, String>> s = hmap.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
