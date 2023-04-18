package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemoTys {

	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(true);
		al.add(null);
		al.add("anusha");
		al.add('a');
		al.add(10.78689808900);
		al.add(19.3);
		al.add("");
		al.add("false");
		System.out.println(al);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(-89);
		list.add(29);
		list.add(900);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10000);
		al2.addAll(list);
		
		System.out.println(al2);
		
		if(al.contains('a'))
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}
		System.out.println(al.size());
		System.out.println(list.size());
		System.out.println(al.isEmpty());
		System.out.println(al2.containsAll(list));
		//al.remove(4);
		al2.removeAll(list);
		System.out.println(al2);
		
		al.addAll(list);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		
		al.add(0,"anusha");
		al.add(1,"navya");
		System.out.println(al);
		al.set(0, "amma");
		System.out.println(al);
	
		//System.out.println(al.get(0));
		//fetch element 1 by 1
		for(Object obj:al)
		{
			System.out.println(obj);
		}

	}

}
