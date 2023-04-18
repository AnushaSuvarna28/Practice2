package com.section1;

public class PenDriver {

	public static void main(String[] args) 
	{
	Pen p = new Pen(1,100,new Fill(11,"circle","blue",10));
	p.showPenDetails();
	p.showFillDetails();

	}

}
