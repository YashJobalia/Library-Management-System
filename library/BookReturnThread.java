package library;

import java.sql.SQLException;

public class BookReturnThread extends Thread
{
	Database database;
	String bookid;
	javax.swing.JLabel[] books_info, user_info;
	javax.swing.JTextField[] dates_fine;
	
	public BookReturnThread(Database database,String bookid ,javax.swing.JLabel[] books_info, javax.swing.JLabel[] user_info, javax.swing.JTextField[] dates_fine)
	{
		this.database = database;
		this.bookid = bookid;
		this.books_info = books_info;
		this.user_info = user_info;
		this.dates_fine = dates_fine;
		
//		this.books_info = new String[6];
//		this.books_info[0] = books_info[0].getText();
//		this.books_info[1] = books_info[1].getText();
//		this.books_info[2] = books_info[2].getText();
//		this.books_info[3] = books_info[3].getText();
//		this.books_info[4] = books_info[4].getText();
//		this.books_info[5] = books_info[5].getText();
//		
//		this.user_info = new String[5];
//		this.user_info[0] = user_info[0].getText();
//		this.user_info[1] = user_info[1].getText();
//		this.user_info[2] = user_info[2].getText();
//		this.user_info[3] = user_info[3].getText();
//		this.user_info[4] = user_info[4].getText();
		
		start();
	}
	
	public void run()
	{
		try
		{
			database.returnBookCheck(bookid, books_info, user_info, dates_fine);
		} 
		catch (ClassNotFoundException e) 
		{
			javax.swing.JOptionPane.showMessageDialog(null,"Driver is not working");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
