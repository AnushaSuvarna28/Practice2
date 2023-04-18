package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseOrIterateArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(3);
		al.add(4);
		al.add(60);
		
		//using for loop
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.print(al.get(i)+" ");
//		}
//		System.out.println();
//		
//		//using for each loop
//		for(Integer a:al)
//		{
//			System.out.print(a+" ");
//		}
		
		//using iterator
//		Iterator<Integer> itr = al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+" ");
//		}
		
		//using list iterator (forward traversing)
		ListIterator<Integer> le = al.listIterator();
		while(le.hasNext())
		{
			System.out.print(le.next()+" ");
		}
		System.out.println();
		//using list iterator (backward traversing)
		while(le.hasPrevious())
		{
			System.out.print(le.previous()+" ");
		}
		System.out.println();
		//if u want to get the index
		while(le.hasNext())
		{
			System.out.println(le.nextIndex()+"--->"+le.next()+" ");
		}

	}
}
