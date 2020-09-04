package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DeleteDatabaseThread extends Thread 
{
	Database database;
	
	public DeleteDatabaseThread(Database database)
	{
		this.database = database;
		start();
	}
	
	public void run()
	{
		try 
		{
			database.deleteDatabase();
		} 
		catch (ClassNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null,"Driver is not working");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
