package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BooksSearchThread extends Thread 
{
	Database database;
	DefaultTableModel model;
	String s1,s2,s3,s4,s5,s6,s7;
	
	public BooksSearchThread(Database database, DefaultTableModel model, String s1, String s2, String s3, String s4, String s5, String s6, String s7)
	{
		this.model = model;
		this.database = database;
		this.s1 = s1;			//BOOKID
		this.s2 = s2;			//ISBN
		this.s3 = s3;			//BOOK NAME
		this.s4 = s4;			//AUTHOR
		this.s5 = s5;			//CATEGORY
		this.s6 = s6;			//PUBLICATIONS
		this.s7 = s7;			//PUBLISHED YEAR
		start();
	}
	
	public void run()
	{
		try 
		{
			database.searchBook(model, s1,s2,s3,s4,s5,s6,s7);
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
