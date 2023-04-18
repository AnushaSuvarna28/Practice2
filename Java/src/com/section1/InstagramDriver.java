package com.section1;
import java.util.Scanner;
public class InstagramDriver {

	public static void main(String[] args) 
	{
		Instagram i = new Instagram("anusha_143",4834738);
		Scanner s = new Scanner(System.in);
		boolean cond = true;
		while(cond)
		{ 
			System.out.println("Enter the option sshown in the below menu");
			System.out.println("1.Login\n2.User Details\n3.Update user name\n4.update user no\n5.Delete account\n6.exit");
			int choice = s.nextInt();
			switch(choice)
		   {
		   		case 1:i.Login();
							break;
		   		case 2:i.showUserDetails();
		   		    		break;
		   		case 3:i.updateUserName();
		   		    		break;
		   		case 4:i.updateUserCno();
		   					break;
		   		case 5:i.deleteAccount();
		   					break;
		   		case 6:cond = false;
		   }

	}
	}

}
