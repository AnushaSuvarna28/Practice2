package arrays;

import java.util.Scanner;

public class EvenandOddNoInArray 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int even = 0;
		int odd = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even numbers are "+even);
		System.out.println("Odd numbers are "+odd);
	}

}
