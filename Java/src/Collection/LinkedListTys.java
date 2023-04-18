package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTys {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add("anusha");
		ll.add("anna");
		ll.add("akka");
		ll.add(1,"amma");
		ll.add(null);
		ll.add("anusha");
		ll.add(true);
		ll.add("");
		ll.add(10);
		ll.add(10.3243423232);
		ll.add(34);
		System.out.println(ll);
		System.out.println(ll.contains("anusha"));
		
		LinkedList<Object> ll2 = new LinkedList<Object>();
		ll2.add("divya");
		ll2.add("bhavya");
		ll2.add(0,"poppa");
		ll2.addAll(ll);
		System.out.println(ll2);
		System.out.println(ll2.contains(""));
		System.out.println(ll2.containsAll(ll));
		//ll2.remove("anusha");
		ll2.removeAll(ll);
		System.out.println(ll2);
		
		//to print 1 by 1
		for(Object list:ll)
		{
			System.out.println(list);
		}
		
		ll2.remove(0);
		System.out.println(ll2);
		
		//finding index of element
		System.out.println(ll2.indexOf("bhavya"));
		System.out.println(ll2.size());
		System.out.println(ll2.getFirst());   //to get first element in the list
		System.out.println(ll2.getLast());    // to get last element in the list
		
		ll2.addFirst("anusha");
		ll2.addLast("poppa");
		System.out.println(ll2);
		ll2.removeFirst();
		System.out.println(ll2);
		ll2.removeLast();
		System.out.println(ll2);
//		for(Object ll1: ll2)
//		{
//			System.out.println(ll1);
//		}
		Iterator<Object> ll1 = ll2.iterator();
		while(ll1.hasNext())
		{
			System.out.println(ll1.next());
		}
	}

}
