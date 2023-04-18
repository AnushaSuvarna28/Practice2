package ArrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class RR1 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3};
		int prev=arr[0];
		arr[0]=arr[0]+arr[1];
		for (int i = 1; i < arr.length-1; i++) {
		    int curr=arr[i];
		    arr[i]=prev+arr[i+1];
		    prev=curr;
		}
		arr[arr.length-1]=prev+arr[arr.length-1];
		System.out.println(Arrays.toString(arr));

		HashMap< Integer, Integer> hs=new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
		   hs.put(i, arr[i]);	
		}
           System.out.println(hs);
			}
}
