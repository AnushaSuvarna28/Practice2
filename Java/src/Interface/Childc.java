package Interface;

public class Childc implements abc,xyz
{
	public void m3()
	{
		System.out.println("m3() from child");
	}

	public static void main(String[] args) 
	{
		abc c = new Childc();  //xyz c = new Child();
		c.m3();
		

	}

}
