package CollectionPrograms;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TraverseTreeMap 
{
	public static void main(String[] args) 
	{
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		map.put("Anusha", 10);
		map.put("Nithya", 9);
		map.put("Amma", 100);
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> s:set)
		{
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}
}
