package com.section3;

public class Book 
{
	String bname;
	Book(String bname)
	{
		this.bname = bname;
	}
	public static void main(String[] args)
	{
		Book b = new Book("Java");
		//Book b1 = b;
		Book b1 = new Book("Java");
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b == b1);
		System.out.println(b.equals(b1));

	}

}
