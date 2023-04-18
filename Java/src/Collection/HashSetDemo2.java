package Collection;

import java.util.HashSet;

public class HashSetDemo2 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> even = new HashSet<Integer>();
		even.add(102);
		even.add(104);
		even.add(106);
		even.add(128);
		System.out.println(even);
		
		//addAll() - used toa add elements of one hashset to another
		HashSet hs = new HashSet();
		hs.addAll(even);
		hs.add(125);
		System.out.println(hs);
		
		//removeAll()
		hs.removeAll(even);
		System.out.println(hs);
	}

}
