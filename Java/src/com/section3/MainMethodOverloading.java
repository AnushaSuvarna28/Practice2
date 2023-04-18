package com.section3;

public class MainMethodOverloading 
{

	public static void main(String[] args) 
	{
		System.out.println("Main is executing");
		MainMethodOverloading.main(10,20);
		MainMethodOverloading.main(56);
	}
	public static void main(int a)
	{
		System.out.println("main one integer method is executing");
	}
	public static void main(int b,int a)
	{
		System.out.println("main 2 integer method is executing");
	}
}
