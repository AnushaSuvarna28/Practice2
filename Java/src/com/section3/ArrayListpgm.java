package com.section3;

import java.util.ArrayList;

public class ArrayListpgm 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Anusha");
		al.add('S');
		al.add(1000);
		al.add(10.0987);
		al.add(true);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.contains(1000));
		al.remove(3);
		System.out.println(al);
		al.add(4,"Anchu");
		al.add("Amma");
		al.add("Anusha");
		System.out.println(al);
		System.out.println(al.contains(al.contains("Anusha")));
	}
}
