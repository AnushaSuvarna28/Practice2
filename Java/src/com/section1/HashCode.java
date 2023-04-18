package com.section1;

import java.util.Objects;

public class HashCode 
{
	int a;
	int b;
	String name;
	HashCode(int a , int b,String name)
	{
		this.a = a;
		this.b = b;
		this.name = name;
	}
	public int hashCode()
	{
		return Objects.hash(a,b,name);
	}

	public static void main(String[] args) 
	{
		HashCode a1 = new HashCode(10,20,"Anu");
		HashCode a2 = new HashCode(10,20,"Anusha");
		int h1= a1.hashCode();
		int h2 = a2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1==h2);
	}

}
