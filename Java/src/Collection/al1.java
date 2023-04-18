package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class al1 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(39);
		al.add(34);
		al.add(56);
		al.add(0);
		al.add(32);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		}
}
