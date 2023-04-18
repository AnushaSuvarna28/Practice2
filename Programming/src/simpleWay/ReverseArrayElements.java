package simpleWay;

import java.util.Scanner;

public class ReverseArrayElements
{

	public static void main(String[] args) 
	{
		int x[] = {10,30,80,3,6};
		int rev[] = new int[x.length];
		int count = 0;
		for(int i=x.length-1;i>=0;i--)
		{
			rev[count]=x[i];
			count++;
		}
		System.out.println("Reverse array is ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		for(int y:rev)
		{
			System.out.print(y+" ");
		}
	}

}
