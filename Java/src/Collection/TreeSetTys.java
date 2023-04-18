package Collection;

import java.util.TreeSet;

public class TreeSetTys {

	public static void main(String[] args) 
	{
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(10);
		set.add(789);
		set.add(40);
		set.add(1);
		set.add(456);
		System.out.println(set);   //by default sorted in Asc
		System.out.println(set.descendingSet());     // to sort in desc order
		System.out.println(set.first());   // first object
		System.out.println(set.last());    // last object
		System.out.println(set.higher(1));  //after 1 which one is higher eg:10
		System.out.println(set.lower(456));  //after 456 which one is lower eg:89
		System.out.println(set.headSet(100)); //objects before 100 eg:1,10,89
		System.out.println(set.tailSet(50));  //objects after 50 eg:89,456,789
		System.out.println(set.subSet(10, 50));   //between 10 and 60	
	}
}
