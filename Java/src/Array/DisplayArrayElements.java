package Array;

public class DisplayArrayElements 
{

	public static void main(String[] args) 
	{
	  int a[] = {1,2,3,4,5};
	  
	  //using for each loop
	  for(int i:a)
	  {
		  System.out.print(i+"  ");
	  }
	  System.out.println();
	  
	  //using for loop
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+"  ");
	  }

	}

}
