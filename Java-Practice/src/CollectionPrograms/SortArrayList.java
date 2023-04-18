package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class SortArrayList 
{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("z");
		al.add("A");
		al.add("S");
		al.add("a");
		al.add("s");
		
		//asending ordre
		Collections.sort(al);
		System.out.println(al);
				
		//descending order
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
				
		//another way to reverse in a ode 
		System.out.println();		
		ListIterator<String> itr = al.listIterator();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous()+" ");
		}
	}
}
