package com.section3;

public class AnimalDriver 
{

	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.sound();
		Cat c = new Cat();
		c.sound();
		Animal a = new Animal();
		a.sound();
		Animal aa = new Cat();
		aa.sound();
		Animal a1a = new Dog();
		a1a.sound();
	}

}
