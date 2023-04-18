package com.section1;

public class User 
{
  String name;
  int cno;
  String emailid;
  User(String name)
  {
	  this.name = name;
  }
  User(String name,int cno)
  {
	  this(name);
	  this.cno = cno;
  }
  User(String name,int cno,String emailid)
  {
	this(name,cno);
	this.emailid = emailid;
  }
  public void showUserDetails()
  {
	  System.out.println(name);
	  System.out.println(cno);
	  System.out.println(emailid);
  }
}
