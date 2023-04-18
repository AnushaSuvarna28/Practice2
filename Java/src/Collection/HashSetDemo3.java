package Collection;

import java.util.HashSet;

public class HashSetDemo3 
{

	public static void main(String[] args) 
	{
		//union, intersection and difference
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("Set1 "+set1);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Set2 "+set2);
		
//		//union - used to identify unique elements
//		set1.addAll(set2);
//		System.out.println(set1);
//		
//		//intersection - get common elements
//		set1.retainAll(set2);
//		System.out.println(set1);
//		
//		//difference 
//		set1.removeAll(set2);
//		System.out.println(set1);
		
		//subset - verifying whether set2 is subset of set1
		System.out.println(set1.containsAll(set2));
		//System.out.println(set1);
	}

}
