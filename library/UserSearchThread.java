package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserSearchThread extends Thread 
{
	Database database;
	DefaultTableModel model;
	String s1,s2,s3,s4,s5,s6,s7;
	
	public UserSearchThread(Database database, DefaultTableModel model, String s1, String s2, String s3, String s4, String s5, String s6, String s7)
	{
		this.model = model;
		this.database = database;
		this.s1 = s1;			//USER ID
		this.s2 = s2;			//DOB
		this.s3 = s3;			//NAME
		this.s4 = s4;			//RESIDENCE
		this.s5 = s5;			//CONTACT
		this.s6 = s6;			//EMAIL ID
		this.s7 = s7;			//DATE OF REGISTRATION
		start();
	}
	
	public void run()
	{
		try 
		{
			database.searchUser(model, s1,s2,s3,s4,s5,s6,s7);
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