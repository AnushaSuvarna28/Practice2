package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility 
{
	Connection con = null;
	int result = 0;
	public void connecToDB() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPathConstant.DBURL,IPathConstant.DBUSERNAME,IPathConstant.DBPASSWORD);
	}
	
	public String readDataFromDB(String query,int colindex,String expData) throws SQLException
	{
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery(query);
		boolean flag = false;
		while(res.next())
		{
			String data = res.getString(colindex);
			if(data.equals(expData))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Project is created");
			return expData;
		}
		else
		{
			System.out.println("Project not created");
			return " ";
		}
	}
	
	public void insertIntoDB(String query) throws SQLException
	{
		Statement state = con.createStatement();
		result = state.executeUpdate(query);
		if(result==1)
		{
			System.out.println("Data is inserted successfully");
		}
		else
		{
			System.out.println("Data is not interested");
		}
	}
	
	public void closeDBConnection() throws SQLException
	{
		con.close();
	}
}
