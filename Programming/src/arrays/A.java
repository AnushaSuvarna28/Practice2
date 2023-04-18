package arrays;

public class A 
{
	public static void main(String[] args) 
	{
		int n = 1357;
		int a[] = new int[4];
		int j=0;
		while(n>0)
		{
			int rem = n%10;
			a[j] = rem;
			n=n/10;
			j++;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
