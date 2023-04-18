package CollectionPrograms;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertListToArray 
{
	public static void main(String[] args) 
	{
		//Arraylist and Linkedlist both are converted using toArray() method
		LinkedList ll = new LinkedList();
		ll.add("Anusha");
		ll.add("Peddu");
		ll.add(420);
		ll.add(33);
		
		//converting list to array
		Object[] la = ll.toArray();
		System.out.println(Arrays.toString(la));
	}
}
