package com.section1;
import java.util.Scanner;
public class Instagram 
{
	String id;
	int secno;
	User u;
	Instagram(String id,int secno)
	{
		this.id = id;
		this.secno = secno;
	}
	public void Login()
	{
		if(this.u == null)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = s.nextLine();
		System.out.println("Enter the cno");
		int cno = s.nextInt();
		System.out.println("Enter the emailid");
		String emailid = s.nextLine();
		emailid = s.nextLine();
		this.u = new User(name,cno,emailid);
		System.out.println("**********USER IS CREATED************");
		}
		else
		{
			System.out.println("USER ALREADY EXISTS");
		}
	}
	public void showUserDetails()
	{
		if(this.u !=null)
		{
			//System.out.println(u.name);
			//System.out.println(u.cno);
			//System.out.println(u.emailid);
			u.showUserDetails();
		}
		else
		{
			System.out.println("Add user to show details");
		}
		
	}
	public void updateUserName()
	{
		if(this.u != null)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a name to update");
			String uname = s.nextLine();
			u.name = uname;
		}
		else
		{
			System.out.println("Add user to update name");
		}
	}
	public void updateUserCno()
	{
		if(this.u != null)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a cno to update");
			int ucno = s.nextInt();
			u.cno = ucno;
		}
		else
		{
			System.out.println("Add user to update cno");
		}
	}
	public void deleteAccount()
	{
		if(this.u != null)
		{
			this.u = null;
		
		}
		else
		{
			System.out.println("Add user to delete");
		}
	}
}
