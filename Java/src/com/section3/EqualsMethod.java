package com.section3;

public class EqualsMethod 
{
	String name;
		EqualsMethod(String name)
		{
			this.name = name;
		}
		@Override
		public boolean equals(Object a)
		{
			EqualsMethod b = (EqualsMethod)a;
			if(this.name == b.name)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	    public static void main(String[] args) 
	    {
	    	EqualsMethod e = new EqualsMethod("Anusha");
	    	EqualsMethod e1 = new EqualsMethod("Anushaa");
	    	System.out.println(e);
	    	//EqualsMethod e1 = e;
	    	System.out.println(e1);
	    	System.out.println(e.equals(e1));
	    	
		}

}
