package com.section1;

public class college 
{
	String cname;
	String loc;
	String pname;
	student s;
	college(String cname,String loc,String pname)
	{
		this.cname = cname;
		this.loc = loc;
		this.pname = pname;
	}
	public void addStudent()
	{
		if(this.s == null)
		{
			this.s = new student(90,"chandan",4343,"male","bangalore");
		}
		else
		{
			System.out.println("Student already exists");
		}
	}
	public void studentDetails()
	{
		if(this.s!=null)
		{
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.cno);
		System.out.println(s.gender);
		System.out.println(s.loc);
		}
		
	}
	public void showCollegeDetails()
	{
		System.out.println(cname);
		System.out.println(loc);
		System.out.println(pname);
		
	}
	public void updateStudentDetails()
	{
		if(this.s != null)
		{
			s.name = "akash";
		}
		else
		{
			System.out.println("Add student to show details");
		}
		
	}
	public void removeStudent()
	{
		if(this.s != null)
		{
			this.s = null;
		}
		else
		{
			System.out.println("Add student to remove");
		}
	}
}
