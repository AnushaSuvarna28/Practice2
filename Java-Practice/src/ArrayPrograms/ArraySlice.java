package ArrayPrograms;

import java.util.Arrays;

public class ArraySlice 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		int[] b = Arrays.copyOfRange(a, 2, 5); //3 4 5
		System.out.println(Arrays.toString(b));
	}
}
