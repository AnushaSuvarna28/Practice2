package com.section3;

import java.util.Random;

public class RandomClass 
{

	public String Random(String acname)
	{
		Random r = new Random();
		int num= r.nextInt(10000);
		acname = acname+num;
		return acname;
	}
	public static void main(String args[])
	{
		RandomClass r = new RandomClass();
		String aname = "Anusha";
		String acname = r.Random(aname);
		System.out.println("Customer name is "+acname);
	}

}
