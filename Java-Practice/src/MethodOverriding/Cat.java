package MethodOverriding;

public class Cat extends Animal
{
	public void m() 
	{		
		System.out.println("Meow Meow");
	}
	public static void main(String args[])
	{
		//creating object of same class
		Cat c = new Cat();
		c.m();
		//creating object of cat class and  storing it in parent type reference
		Animal a = new Cat();
		a.m();
		//converting parent again to child
		Cat c1 = (Cat)a;
		c1.m();
	}
}
