package com.section1;

public class CarDriver {

	public static void main(String[] args) 
	{
		Car c = new Car("model","colour","brand",1,111,new Engine(10,300));
		c.ShowCarDetails();
		c.ShowEngineDetails();

	}

}
