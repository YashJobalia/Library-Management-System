package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewUserDataThread extends Thread
{
	Database database;
	DefaultTableModel model;
	
	public NewUserDataThread(Database database, DefaultTableModel model)
	{
		this.database = database;
		this.model = model;
		start();
	}
	
	public void run()
	{
		try 
		{
			database.viewUser(model, 2);
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
