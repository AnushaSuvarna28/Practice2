package com.section3;

public class AgeTooLessException extends Exception
{
		public String getMessage()
		{
			return "Age is too less for you to date go drink milk";
		}
}
