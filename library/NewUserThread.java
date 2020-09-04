package library;

import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import tools.QuickResponseCode;

public class NewUserThread extends Thread
{
	Database database;
	DefaultTableModel model;
	String s1,s2,s3,s4,s5,s6,s7;
	int userid;
	
	public NewUserThread(DefaultTableModel model, String s1, String s2, String s3, String s4, String s5, String s6, String s7)
	{
		database = new Database();
		this.model = model;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		userid = Integer.parseInt(s1);
		start();
	}
	
	public void run()
	{
			QuickResponseCode qr = new QuickResponseCode();
			
			try 
			{
				database.addUser(new String[] {s1,s2,s3,s4,s5,s6,s7});
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
			
			new NewUserDataThread(database, model);
			
			try 
			{
				qr.generateQR("user_"  + userid,"USER Information","USER ID : " + s1 , "USER Name : " + s3 , "DATE OF BIRTH : " + s4 , "CONTACT : " + s5 , "EMAIL ID : " + s6 , "ADDRESS : " + s7 , "DATE OF REGISTRATION : " + s2);
			} catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null,e);
			}
	}
}
