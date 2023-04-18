package simpleWay;

import java.util.Random;

public class RandomNoAndString
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		
		//random integer numbers
		int num = r.nextInt(10);
		System.out.println(num);
		
		//random double numbers
		double dnum = r.nextDouble();
		System.out.println(dnum);    //0.0 to 1.0
		
		//random decimal number
		System.out.println(Math.random());
		
		//Apache commons-lang API
		//String randnum = RandomStringUtils.randomNumeric(2);
		//System.out.println(randnum);   //It will print 2 digits random numbers
		
		//String randstr = RandomStringUtils.randomAlphabet(5);
		//System.out.println(randstr);   //it will print 5digits random alphabets
		

	}

}
