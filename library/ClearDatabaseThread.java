package library;

import java.sql.SQLException;

public class ClearDatabaseThread extends Thread 
{
	Database database;
	
	public ClearDatabaseThread(Database database)
	{
		this.database = database;
		start();
	}
	
	public void run()
	{
		try 
		{
			database.clearDatabase();
		} 
		catch (ClassNotFoundException e1) 
		{
			javax.swing.JOptionPane.showMessageDialog(null,"Driver is not working");
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
	}
}
