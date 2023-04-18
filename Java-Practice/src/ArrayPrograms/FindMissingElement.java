package ArrayPrograms;

public class FindMissingElement 
{
	public static void main(String[] args) 
	{
		int a[] = {1,6,8};   //print missed no. between 1-10
		for(int i=1;i<=10;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i!=a[j])
				{
					System.out.print(i+" ");
				}
			}
		}
	}
}
