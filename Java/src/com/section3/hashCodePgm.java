package com.section3;

import java.util.Objects;

public class hashCodePgm 
{
	int a ;
	hashCodePgm(int a)
	{
		this.a = 10;
	}
	public int hashCode()
	{
		return Objects.hash(a);
	}
	public static void main(String[] args) 
	{
		hashCodePgm hash1 = new hashCodePgm(30);
		hashCodePgm hash2 = new hashCodePgm(30);
		//hashCodePgm hash2 = hash1;
		int a = hash1.hashCode();
		int b = hash2.hashCode();
		System.out.println(hash1.hashCode());
		System.out.println(hash2.hashCode());
		System.out.println(hash1.equals(hash2));
		System.out.println(hash1 == hash2);
	}

}
