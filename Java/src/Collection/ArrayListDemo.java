package Collection;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Anusha");
		al.add(134);
		al.add(true);
		al.add(10000.7896);
		System.out.println(al);
		
		al.add(2,"143");
		System.out.println(al);
		
		al.add("Amma");
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.removeAll(al);
		System.out.println(al);
		
		al.add("Anusha");
		al.add(134);
		al.add(true);
		al.add(10000.7896);
		System.out.println(al);
		
		ArrayList<Object> all = new ArrayList<Object>();
		all.addAll(al);
		System.out.println(all);
		
		System.out.println(al.containsAll(all));
		
	
	}

}
