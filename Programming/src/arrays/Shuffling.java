package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffling 
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}
}
