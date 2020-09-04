package library;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;

import javax.swing.JOptionPane;

public class DeleteBooksThread extends Thread 
{
	Database database;
	
	public DeleteBooksThread(Database database) 
	{
		this.database = database;
		start();
	}
	
	public void run()
	{
		try 
		{
		//	database.updateForeignKey();	
			database.deleteAllBooks();
		} 
		catch (ClassNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null,"Driver is not working");
		} 
		catch (SQLSyntaxErrorException e) 
		{
			e.printStackTrace();
		}
		catch (com.mysql.cj.jdbc.exceptions.CommunicationsException e) 
		{
			JOptionPane.showMessageDialog(null,"The driver has not received any packets from the server");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
