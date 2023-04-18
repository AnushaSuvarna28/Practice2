package Collection;

import java.util.HashSet;

public class HashSetTys {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet<Object> set = new HashSet<Object>();
		set.add("hi");
		set.add("bye");
		set.add("hi");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("hi"));
		System.out.println(set.isEmpty());

	}

}
