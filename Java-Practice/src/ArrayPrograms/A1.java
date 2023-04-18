package ArrayPrograms;

public class A1 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int key = 2;
		int m=0;
		int n=a.length-1;
		int b[] = new int[a.length]; //2 3 4 5 1
		for(int i=0;i<a.length;i++)
		{	
			if(i<key)
			{
				b[n] = a[i];
				n--;
			}
			else
			{
			b[m] = a[i];
			m++;
			}
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
	}
}
