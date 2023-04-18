package Array;
import java.util.Scanner;
public class ArrayUsingMethods 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int a[] = new int[n];
		m1(a);

	}
	public static void m1(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
