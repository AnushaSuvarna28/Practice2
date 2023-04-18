package simpleWay;

import java.util.Scanner;

public class swpaTwoNumbers
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter another number");
		int b = sc.nextInt();
		System.out.println("The values of a and b before swapping is "+a+" "+b);
		int temp =a;
		a = b;
		b = temp;
		System.out.println("The values of a and b after swapping is "+a+" "+b);
	}

}
