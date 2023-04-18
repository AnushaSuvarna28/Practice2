package com.section3;
public class Book1 
{
	String bname;
	Book1(String bname)
	{
		this.bname = bname;
	}
	public boolean equals(Object a)
	{
		Book1 b = (Book1)a;
		if(this.bname == b.bname)
			return true;
		else
			return false;	
	}
	public static void main(String[] args) 
	{
		Book1 b1 = new Book1("Java");
		Book1 b2 = new Book1("Java");
		System.out.println(b1.bname);
		System.out.println(b2.bname);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}

}
