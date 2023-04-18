package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(34);
		al.add(5);
		al.add(9);
		al.add(89);
		al.add(3);
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==34)
			{
				System.out.println(i +" "+al.get(i));
			}
		}
		
//		System.out.println(al);
//		Collections.reverse(al);
//		System.out.println(al);
	}
}
