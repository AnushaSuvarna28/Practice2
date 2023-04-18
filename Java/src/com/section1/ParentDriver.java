package com.section1;

public class ParentDriver {

	public static void main(String[] args) 
	{
	 Parent p = new Parent();
	 Child c = new Child();
	 System.out.println("************* PARENT CLASS *********************");
	 System.out.println(p.name);
	 System.out.println(p.id);
	 System.out.println(p.add);
	 System.out.println(p.fname);
	 System.out.println(p.mname);
	 System.out.println("************* CHILD CLASS *********************");
	 System.out.println(c.cname);
	 System.out.println(c.cid);
	 System.out.println(c.cadd);
	 System.out.println(c.cfname);
	 System.out.println(c.cmname);
	 System.out.println("************* UPCASTING *********************");
	 Parent p1 = new Child();
	 System.out.println(p1.name);
	 System.out.println(p1.id);
	 System.out.println(p1.add);
	 System.out.println(p1.fname);
	 System.out.println(p1.mname);
	 System.out.println("************* DOWN CASTING *********************");
	 Child c1 = (Child)p1;
	 System.out.println(c1.cname);
	 System.out.println(c1.cid);
	 System.out.println(c1.cadd);
	 System.out.println(c1.cfname);
	 System.out.println(c1.cmname);
	}

}
