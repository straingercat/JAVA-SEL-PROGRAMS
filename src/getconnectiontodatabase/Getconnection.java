package getconnectiontodatabase;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;


public class Getconnection {
	Connection con=null;
	Driver driverRef;
	
	
	public void ConnectionTODatabase() throws Throwable
	{
		DriverManager.registerDriver(driverRef);
		DriverManager.getConnection(null);
	}
	
	
	
	public void CloseConnection() throws Throwable
	{
		con.close();
	}

}
