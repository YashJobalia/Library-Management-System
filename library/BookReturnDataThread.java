package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookReturnDataThread extends Thread 
{
	Database database;
	DefaultTableModel model;
	
	public BookReturnDataThread(Database database, DefaultTableModel model)
	{
		this.database = database;
		this.model = model;
		start();
	}
	
	public void run()
	{
		try 
		{
			database.viewReturnedBook(model, 1);
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
