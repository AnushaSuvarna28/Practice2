package CollectionPrograms;

import java.util.ArrayList;

public class CheckElementPresentInArrayList 
{
	public static void main(String[] args) 
	{
		int key = 1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(5);
		//System.out.println(al.contains(key));
		if(al.contains(key))
		{
			System.out.println("key is present");
		}
		else
		{
			System.out.println("Key is not present");
		}
	}
}
