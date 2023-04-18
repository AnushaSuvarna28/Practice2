package CollectionPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class TraverseHashSet 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(6);
		set.add(7);
		set.add(9);
		set.add(3);
//		for(Integer s:set)
//		{
//			System.out.println(s);
//		}
		
		Iterator<Integer> itr = set.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
	}
}
