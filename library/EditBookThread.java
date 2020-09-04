package library;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditBookThread extends Thread 
{
	Database database;
	DefaultTableModel model;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,str1,str2,str3,str4,str5,str6,str7;
	int no;
	
	public EditBookThread(int no, DefaultTableModel model, Database database, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String str1, String str2, String str3, String str4, String str5, String str6, String str7)
	{
		if(s1.equals("") || s2.equals("") || s3.equals("")  || s4.equals("") || s5.equals("") || s6.equals("") || s7.equals("") || s8.equals("") || s9.equals(""))
		{
			JOptionPane.showMessageDialog(null,"Please Enter valid data");
		}
		else
		{
			this.database = database;
			this.model = model;
			this.no = no;
			this.s1 = s1;				//EDIT BOOKID
			if(no==1)
			{
				this.s2 = s2;			//EDIT ISBN
				this.s3 = s3;			//EDIT BOOK NAME
				this.s4 = s4;			//EDIT AUTHOR
				this.s5 = s5;			//EDIT CATEGORY
				this.s6 = s6;			//EDIT EDITION
				this.s7 = s7;			//EDIT PUBLICATIONS
				this.s8 = s8;			//EDIT PUBLISHED YEAR
				this.s9 = s9;			//EDIT DATE OF ARRIVAL
			}
			this.str1 = str1;			//SEARCH BOOKID
			this.str2 = str2;			//SEARCH ISBN
			this.str3 = str3;			//SEARCH BOOK NAME
			this.str4 = str4;			//SEARCH AUTHOR
			this.str5 = str5;			//SEARCH CATEGORY
			this.str6 = str6;			//SEARCH PUBLICATIONS
			this.str7 = str7;			//SEARCH PUBLISHED YEAR
			start();
		}
	}
	
	public void run()
	{
		if (no==1)
		{
			try 
			{
				database.updateBook(model, s1, s2, s3, s4, s5, s6, s7, s8, s9, str1, str2, str3, str4, str5, str6, str7);
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
		else if(no==2)
		{
			try 
			{
				database.deleteBook(model, s1, str1, str2, str3, str4, str5, str6, str7);
			} 
			catch (ClassNotFoundException e) 
			{
				JOptionPane.showMessageDialog(null,"Driver is not working");
			} 
			catch (SQLIntegrityConstraintViolationException e) 
			{
				JOptionPane.showMessageDialog(null,"The Book is issued by a user");
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
