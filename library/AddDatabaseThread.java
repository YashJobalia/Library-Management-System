package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AddDatabaseThread extends Thread 
{
	Database database;
	
	public AddDatabaseThread(Database database)
	{
		this.database = database;
		start();
	}
	
	public void run()
	{
		try 
		{
			database.addDatabase();
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