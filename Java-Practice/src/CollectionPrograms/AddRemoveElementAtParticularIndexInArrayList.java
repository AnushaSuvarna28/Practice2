package CollectionPrograms;

import java.util.ArrayList;

public class AddRemoveElementAtParticularIndexInArrayList
{
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("z");
		al.add("A");
		al.add("S");
		al.add("a");
		al.add("s"); 
		
		//add element to arraylist at particular index
				al.add(2,"B");
				System.out.println(al);
				al.remove(2);
				System.out.println(al);
	}
}
