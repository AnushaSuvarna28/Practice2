package GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseLibrary 
{
	Connection con = null;
	int res = 0;
	public String redDataFromDbAndValidate(String query,int colindex,String expData) throws SQLException
	{
		boolean flag = true;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(colindex).equalsIgnoreCase(expData))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Data is verified");
			return expData;
		}
		else
		{
			System.out.println("Data not verified");
			return " ";
		}
	}
	
	public void insertDataToDb(String query) throws SQLException
	{
		res = con.createStatement().executeUpdate(query);
		if(res==1)
		{
			System.out.println("Project is created");
		}
		else
		{
			System.out.println("Project is not created");
		}
	}
	
	public void deleteDataFromDb(String query) throws SQLException
	{
		res = con.createStatement().executeUpdate(query);
		if(res==1)
		{
			System.out.println("Project is deleted");
		}
		else
		{
			System.out.println("Project is not deleted");
		}
	}
	
	public void connectToDb() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IConstants.dbURL,IConstants.dbUsername,IConstants.dbPassword);
	}
	public void closeConnectionToDb() throws SQLException
	{
		con.close();
	}
}
