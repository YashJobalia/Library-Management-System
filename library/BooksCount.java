package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BooksCount extends Thread
{
	String url = "jdbc:mysql://localhost:3306/library";
	String sql = "com.mysql.cj.jdbc.Driver";
	String uname = "root";
	String pass = "@yash0201";
	int no_of_books = 0;
	JPanel panel;
	JLabel label;
	
	public BooksCount(JPanel panel, JLabel label)
	{
		this.panel = panel;
		this.label = label;
		start();
	}
	
	public void run()
	{
		while(true)
		{
			String query = "SELECT COUNT(BOOKID) FROM BOOKS";
		
			try 
			{
				Class.forName(sql);
			} 
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			Connection connection;
			try 
			{
				connection = DriverManager.getConnection(url,uname,pass);
				PreparedStatement st = connection.prepareStatement(query);
				ResultSet rs = st.executeQuery(query);
				
				if(rs.next())
				{
					no_of_books = Integer.parseInt(rs.getString("COUNT(BOOKID)")); 
				}
				
				label.setText("No. of Books : " + no_of_books);
				
				st.close();
				connection.close();
			} 
			catch (SQLException e) 
			{}
		}
	}
}
