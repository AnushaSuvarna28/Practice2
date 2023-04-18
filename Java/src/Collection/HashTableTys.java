package Collection;

import java.util.Hashtable;

public class HashTableTys 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hashtable<Integer,Object> map = new Hashtable<Integer,Object>();
		map.put(10, "Anusha");
		map.put(20, 40);
		map.put(30, "Anusha");
		map.put(null, "Kavya");
		map.put(null, map);
		System.out.println(map);
	}

}
