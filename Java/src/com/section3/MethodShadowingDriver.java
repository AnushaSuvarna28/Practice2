package com.section3;

public class MethodShadowingDriver 
{

	public static void main(String[] args) 
	{
		MethodShadowing ms = new MethodShadowing();
		ms.m1();
		MethodShadowingChild mc = new MethodShadowingChild();
		mc.m1();
		MethodShadowing mss = new MethodShadowingChild();
		mss.m1();
		MethodShadowingChild msc = (MethodShadowingChild)mss;
		msc.m1();
	}

}
