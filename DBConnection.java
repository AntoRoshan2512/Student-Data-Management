package main;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection 
{
	static Connection con;
	public static Connection createDBConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/eee";
			String username="root";
			String password="Roshan2512@";
			con = DriverManager.getConnection(url, username, password);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return con;
	
}
	public static void closeConnection(Connection con2) {
		return;
		
	}
}
