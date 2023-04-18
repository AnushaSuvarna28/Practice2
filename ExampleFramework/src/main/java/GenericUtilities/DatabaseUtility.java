package GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility 
{
	Connection con = null;
	int res = 0;
	public void connectToDB() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPathConstant.DBUrl,IPathConstant.DBUsername,IPathConstant.DBPassword);		
	}
	
	public ResultSet readDataFromDB(String query) throws SQLException
	{
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery(query);
		return result;
	}
	
	public int insertDataToDB(String query) throws SQLException
	{
		Statement state = con.createStatement();
		res = state.executeUpdate(query);
		return res;
	}
	
	public int deleteDataInDB(String query) throws SQLException
	{
		Statement state = con.createStatement();
		res = state.executeUpdate(query);
		return res;
	}
	public void disconnectToDB() throws SQLException
	{
		con.close();
	}
}
