package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetTys {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> set =new LinkedHashSet<Object>();
		set.add("anusha");
		set.add("amma");
		set.add("poppa");
		set.add("akka");
		set.add("akka"); //duplicates not allowed
		set.add(15);
		set.add(false);
		set.add("");
		set.add(100.34656);
		set.add(null);
		set.add(null); //only one null is allowed
		System.out.println(set);   //insertion order is maintained
		System.out.println(set.size());
		System.out.println(set.contains("poppa"));
		set.remove("poppa");
		System.out.println(set);
	}
}
