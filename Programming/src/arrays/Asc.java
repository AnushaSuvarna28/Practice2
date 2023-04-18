package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Asc 
{
	public static void main(String[] args) {
		int n = 561130;
		ArrayList<Integer> al  =new ArrayList<Integer>();
		while(n>0)
		{
			int sum = n%10;
			//System.out.print(sum+" ");
			al.add(sum);
			n = n/10;
		}
		//System.out.println(al);
		Collections.sort(al);
		//System.out.println(al);
		ArrayList<Integer> rev = new ArrayList<Integer>();
		for(int i=al.size()-1;i>=0;i--)
		{
			rev.add(al.get(i));
		}
		String sum = "";
		for(int i=0;i<rev.size();i++)
		{
			//System.out.print(rev.get(i)+" ");
			sum = sum+rev.get(i);
		}
		//converting string to number
		System.out.println(Integer.parseInt(sum));
		
	}

}
