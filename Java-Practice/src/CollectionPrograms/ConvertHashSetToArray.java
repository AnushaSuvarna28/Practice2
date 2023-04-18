package CollectionPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertHashSetToArray 
{
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Anusha");
		set.add("Amma");
		set.add("Nithya");
		set.add("Sathya Adeki Daiva");
		
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));
	}
}
