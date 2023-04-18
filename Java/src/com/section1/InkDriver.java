package com.section1;

public class InkDriver {

	public static void main(String[] args) 
	{
		Refill r = new Refill(12,"square","red",10,new Ink("black",1,"redblack"));
		r.ShowRefillDetails();
		r.InkDetails();
	}
}