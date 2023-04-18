package CollectionPrograms;

import java.util.LinkedHashMap;

public class HMap1 
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
				// 1 2 3 4 5 3 4 5 6
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(i, a[i]);
		}
		System.out.println(map);
		for(int i=1;i<a.length;i++)
		{
			map.put(map.size()+i,a[i]+1);
		}
		System.out.println(map.values());
	}
}
