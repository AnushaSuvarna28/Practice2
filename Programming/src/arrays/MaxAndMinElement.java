package arrays;

import java.util.Scanner;

public class MaxAndMinElement 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			else if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Max element in the array "+max);
		System.out.println("Min element in the array "+min);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
