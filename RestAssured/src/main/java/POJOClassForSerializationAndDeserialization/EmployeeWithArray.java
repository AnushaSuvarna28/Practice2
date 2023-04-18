package POJOClassForSerializationAndDeserialization;

public class EmployeeWithArray 
{
	    //Step1 : Declare the variables globally
		String name;
		int id;
		int[] phno;
		//Step2 : Create constructor to initialize values
		public EmployeeWithArray(String name, int id, int[] phno) 
		{
			
			this.name = name;
			this.id = id;
			this.phno = phno;
		}
		public EmployeeWithArray() 
		{
			
		}
		public String getName() 
		{
			return name;
		}
		public int getId() 
		{
			return id;
		}
		public int[] getPhno() 
		{
			return phno;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public void setId(int id) 
		{
			this.id = id;
		}
		public void setPhno(int[] phno) 
		{
			this.phno = phno;
		}
		
		
		
}
