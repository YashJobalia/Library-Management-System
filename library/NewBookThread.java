package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import tools.QuickResponseCode;

public class NewBookThread extends Thread
{
	int nob;
	Database database;
	DefaultTableModel model;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9;
	int bookid;
	String book_id;
	
	public NewBookThread(DefaultTableModel model, int nob, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9)
	{
		this.nob = nob;
		database = new Database();
		this.model = model;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		this.s8 = s8;
		this.s9 = s9;
		bookid = Integer.parseInt(s1);
		start();
	}
	
	public void run()
	{
		for(int i=1;i<=nob;i++)
		{
			QuickResponseCode qr = new QuickResponseCode();
			
			try 
			{
				database.addBook(new String[] {bookid + "",s2,s3,s4,s5,s6,s7,s8,s9});
			} 
			catch (ClassNotFoundException e1) 
			{
				JOptionPane.showMessageDialog(null,"Driver is not working");
			} 
			catch(NumberFormatException e1)
			{
				JOptionPane.showMessageDialog(null,"Please Enter valid data");
			}
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			model.setRowCount(0);
			
			new NewBookDataThread(database, model);
			
			try 
			{
				qr.generateQR("book_" + bookid,"Book Information\n","Book ID : " + bookid , "Book Name : " + s3 , "Author : " + s4 , "Category : " + s5 , "Edition : " + s6 , "ISBN : " + s7 , "Publications : " + s8 , "Published Year : " + s9 );
			} 
			catch (Exception e) 
			{}
			
			bookid ++;
		}
	}
}
