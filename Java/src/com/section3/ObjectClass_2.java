package com.section3;

public class ObjectClass_2 
{
	String name;
	int id;
	String add;
	ObjectClass_2(String name,int id,String add)
	{
		this.name = name;
		this.id = id;
		this.add = add;
	}
	public static void main(String[] args) 
	{
		ObjectClass_2 i = new ObjectClass_2("anusha", 123, "nallur");
		ObjectClass_2 i1 = new ObjectClass_2("anu", 123, "karkala");
		ObjectClass_2 i2 = new ObjectClass_2("anchu", 123, "udupi");
		System.out.println(i); //i.toString()
		System.out.println("***********************************");
		System.out.println(i1); //i1.toString
		System.out.println("***********************************");
		System.out.println(i2); //i2.toString
	}
	public String toString()
	{
		return " My name is "+name+"\n Id is "+id+"\n Address is "+add;
	}

}
