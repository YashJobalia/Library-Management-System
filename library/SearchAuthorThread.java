package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SearchAuthorThread extends Thread 
{
	DefaultTableModel model;
	Database database;
	String s1,s2,s3;
	public SearchAuthorThread(Database database, DefaultTableModel model, String s1, String s2, String s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.model = model;
		this.database = database;
		start();
	}
	
	public void run()
	{
		try 
		{
			database.searchAuthor(model,s1,s2,s3);
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
