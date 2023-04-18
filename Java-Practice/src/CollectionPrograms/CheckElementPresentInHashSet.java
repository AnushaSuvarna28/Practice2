package CollectionPrograms;

import java.util.HashSet;

public class CheckElementPresentInHashSet 
{
	public static void main(String[] args) 
	{
		String key = "Anush";
		HashSet set = new HashSet();
		set.add("Anusha");
		set.add(true);
		set.add(34);
		set.add("Amma");
		
		if(set.contains(key))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
}
