package com.section1;

import java.util.Scanner;

public class CollegeDriver {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		college c = new college("GPT Karkala","udupi","sdf");
		boolean cond = true;
		while(cond)
		{ 
			System.out.println("Enter the option sshown in the below menu");
			System.out.println("1.Admission\n2.student details\n3.college details\n4.update name\n5.remove student\n6.exit");
			int choice = s.nextInt();
			switch(choice)
		   {
		   		case 1:c.addStudent();
					break;
		   		case 2:c.studentDetails();
		   		    break;
		   		case 3:c.showCollegeDetails();
		   		    break;
		   		case 4:c.updateStudentDetails();
		   			break;
		   		case 5:c.removeStudent();
		   			break;
		   		case 6:cond = false;
		   }

	}
	}

}
