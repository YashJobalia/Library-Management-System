package library;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditUserThread extends Thread 
{
	Database database;
	DefaultTableModel model;
	String s1,s2,s3,s4,s5,s6,s7,str1,str2,str3,str4,str5,str6,str7;
	int no;
	
	public EditUserThread(int no, DefaultTableModel model, Database database, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String str1, String str2, String str3, String str4, String str5, String str6, String str7)
	{
		if(s1.equals("") || s2.equals("") || s3.equals("")  || s4.equals("") || s5.equals("") || s6.equals("") || s7.equals(""))
		{
			JOptionPane.showMessageDialog(null,"Please Enter valid data");
		}
		else
		{
			this.database = database;
			this.model = model;
			this.no = no;
			this.s1 = s1;				//EDIT USER ID
			if(no==1)
			{
				this.s2 = s2;			//EDIT DOB
				this.s3 = s3;			//EDIT NAME
				this.s4 = s4;			//EDIT RESIDENCE
				this.s5 = s5;			//EDIT CONTACT
				this.s6 = s6;			//EDIT EMAIL ID
				this.s7 = s7;			//EDIT DATE OF REGISTRATION
			}
			this.str1 = str1;			//SEARCH USER ID
			this.str2 = str2;			//SEARCH DOB
			this.str3 = str3;			//SEARCH NAME
			this.str4 = str4;			//SEARCH RESIDENCE
			this.str5 = str5;			//SEARCH CONTACT
			this.str6 = str6;			//SEARCH EMAIL ID
			this.str7 = str7;			//SEARCH DATE OF REGISTRATION
			start();
		}
	}
	
	public void run()
	{
		if (no==1)
		{
			try 
			{
				database.updateUser(model, s1, s2, s3, s4, s5, s6, s7, str1, str2, str3, str4, str5, str6, str7);
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
				database.deleteUser(model, s1, str1, str2, str3, str4, str5, str6, str7);
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
}
