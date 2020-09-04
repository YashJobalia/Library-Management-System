package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UsersCount extends Thread
{
	String url = "jdbc:mysql://localhost:3306/library";
	String sql = "com.mysql.cj.jdbc.Driver";
	String uname = "root";
	String pass = "@yash0201";
	int no_of_users = 0;
	JPanel panel;
	JLabel label;
	
	public UsersCount(JPanel panel, JLabel label)
	{
		this.panel = panel;
		this.label = label;
		start();
	}
	
	public void run()
	{
		while(true)
		{
			
			String query = "SELECT COUNT(USERID) FROM USERS";
			
			try 
			{
				Class.forName(sql);
				Connection connection = DriverManager.getConnection(url,uname,pass);
				PreparedStatement st = connection.prepareStatement(query);
				ResultSet rs = st.executeQuery(query);
				
				if(rs.next())
				{
					no_of_users = Integer.parseInt(rs.getString("COUNT(USERID)")); 
				}
				
				label.setText("No. of Users : " + no_of_users);
				
				st.close();
				connection.close();
			} 
			catch (ClassNotFoundException e) 
			{
				JOptionPane.showMessageDialog(null,"Driver is not working");
			} 
			catch (SQLException e) 
			{}
		}
	}
}
