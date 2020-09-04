package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Database
{
	static String url;
	static String uname;
	static String pass;
	static String sql;
	static String ip;
	static String port;
	
	public static void setDriver(int driver)
	{
		if(driver==1)
		{
			url = "jdbc:mysql://" + ip + ":" + port + "/library";
			sql = "com.mysql.cj.jdbc.Driver";
		}
	}
	public void readFile()
	{
		Scanner scan;
		try
		{
			scan = new Scanner(new File("C:\\Users\\jobal\\Desktop\\Data\\data3.lib"));
			uname = scan.next();
			pass = scan.next();
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null,"File Missing!");
		}
	}
	
	public void readFile1()
	{
		Scanner scan;
		try
		{
			scan = new Scanner(new File("C:\\Users\\jobal\\Desktop\\Data\\data4.lib"));
			ip = scan.next();
			port = scan.next();
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null,"File Missing!");
		}
	}
	
	public synchronized void addBook(String[] books_info) throws ClassNotFoundException, SQLException
	{			
		int bookid = Integer.parseInt(books_info[0]);
		int publishedyear = Integer.parseInt(books_info[8]);
		
		String query = "INSERT INTO BOOKS VALUES (?,?,?,?,?,?,?,?,?)";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		
		{
			st.setInt(1,bookid);                  //BOOK ID
			st.setString(2,books_info[1]);        //DATE
			st.setString(3,books_info[2]);		  //BOOK NAME
			st.setString(4,books_info[3]);        //AUTHOR NAME
			st.setString(5,books_info[4]);        //CATEGORY
			st.setString(6,books_info[5]);		  //EDITION
			st.setString(7,books_info[6]);		  //ISBN
			st.setString(8,books_info[7]);		  //PUBLICATIONS
			st.setInt(9,publishedyear);			  //PUBLISHED YEAR
			st.executeUpdate();                   //int count = st.executeUpdate();
			st.close();
		}	
		
	}	
	
	public synchronized void viewBook(DefaultTableModel model, int model_no) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT * FROM BOOKS";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			String s1 = rs.getString(1);		//BOOK ID
			String s2 = rs.getString(2);		//DATE OF ARRIVAL
			String s3 = rs.getString(3);		//BOOK NAME
			String s4 = rs.getString(4);		//AUTHOR
			String s5 = rs.getString(5);		//CATEGORY
			String s6 = rs.getString(6);		//EDITION
			String s7 = rs.getString(7);		//ISBN
			String s8 = rs.getString(8);		//PUBLICATIONS
			String s9 = rs.getString(9);		//PUBLISHED YEAR
			
			if(model_no==1)
				((DefaultTableModel) model).addRow(new Object[] {s1,s2,s3,s4,s5,s6,s7,s8,s9});
			
			else if(model_no==2)
				((DefaultTableModel) model).addRow(new Object[] {s1,s3,s4,s7});
		}
		
		st.close();
		connection.close();
	}
	
	public synchronized void addUser(String[] user_info) throws ClassNotFoundException, SQLException
	{			
		int userid = Integer.parseInt(user_info[0]);
		String query = "INSERT INTO USERS VALUES (?,?,?,?,?,?,?)";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		
		st.setInt(1,userid);          		 //USER ID
		st.setString(2,user_info[1]);        //DATE OF REGISTRATION
		st.setString(3,user_info[2]);		 //NAME
		st.setString(4,user_info[3]);        //DATE OF BIRTH
		st.setString(5,user_info[4]);        //CONTACT
		st.setString(6,user_info[5]);		 //EMAIL
		st.setString(7,user_info[6]);		 //ADDRESS		 
		st.executeUpdate();
		st.close();
	}
	
	public synchronized void viewUser(DefaultTableModel model , int model_no) throws ClassNotFoundException, SQLException
	{
		String query = "SELECT * FROM USERS";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			String s1 = rs.getString(1);		//USER ID
			String s2 = rs.getString(3);		//NAME
			String s3 = rs.getString(4);		//DATE OF BIRTH
			String s4 = rs.getString(5);		//CONTACT
			String s5 = rs.getString(6);		//EMAIL
			String s6 = rs.getString(7);		//RESIDENCE
			String s7 = rs.getString(2);		//DATE OF REGISTRATION
			if (model_no == 1)
				((DefaultTableModel) model).addRow(new Object[] {s1,s2,s3,s4,s5,s6,s7});
			else
				((DefaultTableModel) model).addRow(new Object[] {s1,s2,s3,s4});
			
		}
		st.close();
		connection.close();
	}
	
	public synchronized void issueBook(String[] book_issue_info) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO BOOKISSUE VALUES (?,?,?,?)";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		
		st.setInt(1,Integer.parseInt(book_issue_info[0]));          		 //BOOK ID
		st.setInt(2,Integer.parseInt(book_issue_info[1]));       			 //USER ID
		st.setString(3,book_issue_info[2]);		 							 //DATE OF ISSUE
		st.setString(4,book_issue_info[3]);       							 //DUE DATE
		st.executeUpdate();
		st.close();
		connection.close();
	}
	
	public synchronized void viewIssuedBook(DefaultTableModel model , int model_no) throws ClassNotFoundException, SQLException
	{
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		if(model_no ==1)
		{
			String query1 = "SELECT * FROM BOOKISSUE";
			PreparedStatement st = connection.prepareStatement(query1);
			ResultSet rs = st.executeQuery(query1);

			while(rs.next())
			{
				String s1 = rs.getString(1);		//BOOK ID
				String s2 = rs.getString(2);		//USER ID
				String s3 = rs.getString(3);		//DATE OF ISSUE
				String s4 = rs.getString(4);		//DUE DATE
				((DefaultTableModel) model).addRow(new Object[] {s1,s2,s3,s4});
			}
			st.close();
		}
		else if(model_no ==2)
		{
			String query = "SELECT B.BOOKID, B.BOOKNAME, BI.USERID, U.NAME, U.CONTACT, U.EMAIL, BI.DATEOFISSUE, BI.DUEDATE FROM BOOKS B NATURAL JOIN BOOKISSUE BI NATURAL JOIN USERS U";
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String s1 = rs.getString(1);		//BOOK ID
				String s2 = rs.getString(2);		//BOOK NAME
				String s3 = rs.getString(3);		//USER ID
				String s4 = rs.getString(4);		//USER NAME
				String s5 = rs.getString(5);		//CONTACT
				String s6 = rs.getString(6);		//EMAIL ID
				String s7 = rs.getString(7);		//DATE OF ISSUE
				String s8 = rs.getString(8);		//DUE DATE
				((DefaultTableModel) model).addRow(new Object[] {s1,s2,s3,s4,s5,s6,s7,s8});
			}
			st.close();
		}
		connection.close();
	}
	
	public synchronized void returnBookCheck(String bookid ,javax.swing.JLabel[] books_info, javax.swing.JLabel[] user_info, javax.swing.JTextField[] dates_fine) throws ClassNotFoundException, SQLException
	{
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		
		String query1 = "SELECT * FROM BOOKISSUE WHERE BOOKID = " + bookid;
		PreparedStatement st1 = connection.prepareStatement(query1);
		ResultSet rs1 = st1.executeQuery(query1);
		while(rs1.next())
		{
			String userid = rs1.getString(2);	//USERID
			String s3 = rs1.getString(3);		//DATE OF ISSUE
			String s4 = rs1.getString(4);		//DUE DATE
			dates_fine[0].setText(s3);
			dates_fine[1].setText(s4);
		}
		
		String query2 = "SELECT * FROM BOOKS WHERE BOOKID = " + bookid;
		PreparedStatement st2 = connection.prepareStatement(query2);
		ResultSet rs2 = st2.executeQuery(query2);
		while(rs2.next())
		{
			String s3 = rs2.getString(3);		//BOOK NAME
			String s4 = rs2.getString(4);		//AUTHOR
			String s5 = rs2.getString(5);		//CATEGORY
			String s6 = rs2.getString(6);		//EDITION
			String s8 = rs2.getString(8);		//PUBLICATIONS
			String s9 = rs2.getString(9);		//PUBLISHED YEAR
			
			books_info[0].setText(s3);
			books_info[1].setText(s4);
			books_info[2].setText(s5);
			books_info[3].setText(s6);
			books_info[4].setText(s8);
			books_info[5].setText(s9);
		}
		
		String query3 = "SELECT * FROM USERS WHERE USERID IN (SELECT USERID FROM BOOKISSUE WHERE BOOKID = " + bookid +  ")";
		PreparedStatement st3 = connection.prepareStatement(query3);
		ResultSet rs3 = st3.executeQuery(query3);
		while(rs3.next())
		{
			String s1 = rs3.getString(1);		//USER ID
			String s3 = rs3.getString(3);		//NAME
			String s4 = rs3.getString(4);		//DATE OF BIRTH
			String s5 = rs3.getString(5);		//CONTACT
			String s6 = rs3.getString(6);		//EMAIL ID
			
			user_info[0].setText(s1);
			user_info[1].setText(s3);
			user_info[2].setText(s4);
			user_info[3].setText(s5);
			user_info[4].setText(s6);
		}
	}
	
	public synchronized void returnBook(String[] book_issue_info) throws ClassNotFoundException, SQLException
	{
		String query = "INSERT INTO BOOKRETURN VALUES (?,?,?,?,?,?)";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		
		st.setInt(1,Integer.parseInt(book_issue_info[0]));					//BOOK ID
		st.setInt(2,Integer.parseInt(book_issue_info[1]));					//USER ID
		st.setString(3,book_issue_info[2]);									//DATE OF ISSUE
		st.setString(4,book_issue_info[3]);								   	//DUE DATE
		st.setString(5,book_issue_info[4]);								   	//RETURN DATE
		st.setInt(6,Integer.parseInt(book_issue_info[5]));					//FINE									
		st.executeUpdate();
		st.close();
	}
	
	public synchronized void deleteIssuedBook(String bookid) throws ClassNotFoundException, SQLException
	{
		String query = "DELETE FROM BOOKISSUE WHERE BOOKID = " + bookid;
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		st.executeUpdate();
		st.close();
	}
	
	public synchronized void viewReturnedBook(DefaultTableModel model , int model_no) throws ClassNotFoundException, SQLException
	{
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		if(model_no == 1)
		{
			String query = "SELECT * FROM BOOKRETURN";
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String s1 = rs.getString(1);		//BOOK ID
				String s2 = rs.getString(2);		//USER ID
				String s3 = rs.getString(3);		//DATE OF ISSUE
				String s4 = rs.getString(4);		//DUE DATE
				String s5 = rs.getString(5);		//RETURN DATE
				String s6 = rs.getString(6);		//FINE
				((DefaultTableModel) model).addRow(new Object[] {s1,s2,s3,s4,s5,s6});
			}
			st.close();
		}
		else if(model_no == 2)
		{
			String query = "SELECT U.USERID, U.NAME, BR.BOOKID, B.BOOKNAME, BR.DATEOFISSUE, BR.DUEDATE, BR.RETURNDATE, BR.FINE FROM BOOKS B NATURAL JOIN BOOKRETURN BR NATURAL JOIN USERS U";
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String s1 = rs.getString(1);		//USER ID
				String s2 = rs.getString(2);		//USER NAME
				String s3 = rs.getString(3);		//BOOK ID
				String s4 = rs.getString(4);		//BOOK NAME
				String s5 = rs.getString(5);		//DATE OF ISSUE
				String s6 = rs.getString(6);		//DUE DATE
				String s7 = rs.getString(7);		//RETURN DATE
				String s8 = rs.getString(8);		//FINE
				((DefaultTableModel) model).addRow(new Object[] {s1,s2,s3,s4,s5,s6,s7,s8});
			}
			st.close();
		}
		connection.close();
	}
	
	public synchronized void searchBook(DefaultTableModel model, String s1, String s2, String s3, String s4, String s5, String s6, String s7) throws ClassNotFoundException, SQLException
	{
		if(s1.equals("") && s2.equals("") && s7.equals(""))
		{
			String query = "SELECT * FROM BOOKS WHERE BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%'";
			
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();			
		}
		else if(s1.equals("") && s2.equals(""))
		{
			String query = "SELECT * FROM BOOKS WHERE BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%' AND PUBLISHEDYEAR = "+ s7;
			
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();			
		}
		else if(s1.equals("") && s7.equals(""))
		{
			String query = "SELECT * FROM BOOKS WHERE ISBN = '" + s2 + "' AND BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%'";
			
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();			
		}
		else if(s2.equals("") && s7.equals(""))
		{
			String query = "SELECT * FROM BOOKS WHERE BOOKID = " + s1 + " AND BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%'";
			
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();			
		}
		else if(s1.equals(""))
		{
			String query = "SELECT * FROM BOOKS WHERE ISBN = '" + s2 + "' AND BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%' AND PUBLISHEDYEAR = "+ s7;
			
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();
			
		}
		else if(s2.equals(""))
		{
			String query = "SELECT * FROM BOOKS WHERE BOOKID = " + s1 + " AND BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%' AND PUBLISHEDYEAR = "+ s7;
			System.out.println(query);
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();			
		}
		else if(s7.equals(""))
		{
			String query = "SELECT * FROM BOOKS WHERE BOOKID = " + s1 + " AND BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%' AND ISBN = "+ s2;
			
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();			
		}
		else
		{
			String query = "SELECT * FROM BOOKS WHERE BOOKID = " + s1+ " AND ISBN = '" + s2 + "' AND BOOKNAME LIKE '%" + s3 + "%' AND AUTHOR LIKE '" + s4 + "%' AND CATEGORY LIKE '" + s5 + "%' AND PUBLICATIONS LIKE '" + s6 + "%' AND PUBLISHEDYEAR = "+ s7;
			
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//BOOK ID
				String str2 = rs.getString(2);		//DATE OF ARRIVAL
				String str3 = rs.getString(3);		//BOOK NAME
				String str4 = rs.getString(4);		//AUTHOR
				String str5 = rs.getString(5);		//CATEGORY
				String str6 = rs.getString(6);		//EDITION
				String str7 = rs.getString(7);		//ISBN
				String str8 = rs.getString(8);		//PUBLICATIONS
				String str9 = rs.getString(9);		//PUBLISHED YEAR
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
			}
			st.close();
			connection.close();			
		}
	}
	
	public synchronized void searchBook(javax.swing.JTextField tf[]) throws ClassNotFoundException, SQLException
	{
		if(tf[0].getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Please Enter valid data");
		}
		else
		{
			String query = "SELECT * FROM BOOKS WHERE BOOKID = " + tf[0].getText();
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				//String s1 = rs.getString(1);		//BOOK ID
				String s2 = rs.getString(2);		//DATE OF ARRIVAL
				String s3 = rs.getString(3);		//BOOK NAME
				String s4 = rs.getString(4);		//AUTHOR
				String s5 = rs.getString(5);		//CATEGORY
				String s6 = rs.getString(6);		//EDITION
				String s7 = rs.getString(7);		//ISBN
				String s8 = rs.getString(8);		//PUBLICATIONS
				String s9 = rs.getString(9);		//PUBLISHED YEAR
				
				tf[1].setText(s7);
				tf[2].setText(s3);
				tf[3].setText(s4);
				tf[4].setText(s5);
				tf[5].setText(s8);
				tf[6].setText(s9);
				tf[7].setText(s6);
				tf[8].setText(s2);
			}
			st.close();
			connection.close();
		}
	}
	
	public synchronized void searchUser(DefaultTableModel model, String s1, String s2, String s3, String s4, String s5, String s6, String s7) throws ClassNotFoundException, SQLException 
	{
	
		if(s1.equals(""))
		{
			String query = "SELECT * FROM USERS WHERE DOB LIKE '" + s2 + "%' AND NAME LIKE '%" + s3 + "%' AND RESIDENCE LIKE '%" + s4 + "%' AND CONTACT LIKE '" + s5 + "%' AND EMAIL LIKE '" + s6 + "%' AND DATEOFREGISTRATION LIKE '"+ s7 + "%'";
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//USER ID
				String str2 = rs.getString(3);		//NAME
				String str3 = rs.getString(4);		//DOB
				String str4 = rs.getString(5);		//CONTACT
				String str5 = rs.getString(6);		//EMAIL ID
				String str6 = rs.getString(7);		//RESIDENCE
				String str7 = rs.getString(2);		//DATE OF REGISTRATION
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7});
			}
			st.close();
			connection.close();
		}
		else
		{
			String query = "SELECT * FROM USERS WHERE USERID = " + s1+ " AND DOB LIKE '" + s2 + "%' AND NAME LIKE '%" + s3 + "%' AND RESIDENCE LIKE '%" + s4 + "%' AND CONTACT LIKE '" + s5 + "%' AND EMAIL LIKE '" + s6 + "%' AND DATEOFREGISTRATION LIKE '"+ s7 + "%'";
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);

			while(rs.next())
			{
				String str1 = rs.getString(1);		//USER ID
				String str2 = rs.getString(3);		//NAME
				String str3 = rs.getString(4);		//DOB
				String str4 = rs.getString(5);		//CONTACT
				String str5 = rs.getString(6);		//EMAIL ID
				String str6 = rs.getString(7);		//RESIDENCE
				String str7 = rs.getString(2);		//DATE OF REGISTRATION
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7});
			}
			st.close();
			connection.close();			
		}
	}
	
	public synchronized void searchUser(javax.swing.JTextField tf[], javax.swing.JTextArea residence) throws ClassNotFoundException, SQLException
	{
		if(tf[0].getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Please Enter valid data");
		}
		else
		{
			String query = "SELECT * FROM USERS WHERE USERID = " + tf[0].getText();
			Class.forName(sql);
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				//String s1 = rs.getString(1);		//USER ID
				String s2 = rs.getString(3);		//NAME
				String s3 = rs.getString(4);		//DOB
				String s4 = rs.getString(5);		//CONTACT
				String s5 = rs.getString(6);		//EMAIL ID
				String s6 = rs.getString(7);		//RESIDENCE
				String s7 = rs.getString(2);		//DATE OF REGISTRATION
				
				tf[1].setText(s2);
				tf[2].setText(s3);
				tf[3].setText(s4);
				tf[4].setText(s5);
				residence.setText(s6);
				tf[5].setText(s7);
			}
			st.close();
			connection.close();
		}
	}
	
	public void searchAuthor(DefaultTableModel model, String s1, String s2, String s3) throws ClassNotFoundException, SQLException
	{
		String query = null;
		
		if(s1.equals("") && s2.equals("") && s3.equals(""))
			query = "SELECT DISTINCT BOOKNAME, AUTHOR FROM BOOKS";
		else if(s1.equals (""))
			query = "SELECT DISTINCT BOOKNAME, AUTHOR FROM BOOKS WHERE BOOKNAME LIKE '%" + s2 + "%' AND AUTHOR LIKE '" + s3 + "%'";
		else
			query = "SELECT DISTINCT BOOKNAME, AUTHOR FROM BOOKS WHERE BOOKID = '" + s1 + "' AND BOOKNAME LIKE '%" + s2 + "%' AND AUTHOR LIKE '" + s3 + "%'";
			
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		ResultSet rs = st.executeQuery(query);
		String str1 = "1";
		
		while(rs.next())
		{
			String str2 = rs.getString(1);
			String str3 = rs.getString(2);
			
			((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3});
			str1 = (Integer.parseInt(str1)) + 1 + "";
		}
		st.close();
		connection.close();
	}
	
	public synchronized void updateBook(DefaultTableModel model, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String str1, String str2, String str3, String str4, String str5, String str6, String str7) throws ClassNotFoundException, SQLException
	{
		String query1 = "UPDATE BOOKS SET ISBN = '" + s2 + "' WHERE BOOKID = " + s1;
		String query2 = "UPDATE BOOKS SET BOOKNAME = \"" + s3 + "\" WHERE BOOKID = " + s1;
		String query3 = "UPDATE BOOKS SET AUTHOR = \"" + s4 + "\" WHERE BOOKID = " + s1;
		String query4 = "UPDATE BOOKS SET CATEGORY = \"" + s5 + "\" WHERE BOOKID = " + s1;
		String query5 = "UPDATE BOOKS SET EDITION = \"" + s6 + "\" WHERE BOOKID = " + s1;
		String query6 = "UPDATE BOOKS SET PUBLICATIONS = \"" + s7 + "\" WHERE BOOKID = " + s1;
		String query7 = "UPDATE BOOKS SET PUBLISHEDYEAR = \"" + s8 + "\" WHERE BOOKID = " + s1;
		String query8 = "UPDATE BOOKS SET DATEOFARRIVAL = \"" + s9 + "\" WHERE BOOKID = " + s1;
		
		Class.forName(sql);
		
		Connection connection = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st1 = connection.prepareStatement(query1);
		PreparedStatement st2 = connection.prepareStatement(query2);
		PreparedStatement st3 = connection.prepareStatement(query3);
		PreparedStatement st4 = connection.prepareStatement(query4);
		PreparedStatement st5 = connection.prepareStatement(query5);
		PreparedStatement st6 = connection.prepareStatement(query6);
		PreparedStatement st7 = connection.prepareStatement(query7);
		PreparedStatement st8 = connection.prepareStatement(query8);
		
		st1.executeUpdate(query1);
		st2.executeUpdate(query2);
		st3.executeUpdate(query3);
		st4.executeUpdate(query4);
		st5.executeUpdate(query5);
		st6.executeUpdate(query6);
		st7.executeUpdate(query7);
		st8.executeUpdate(query8);
		
		st1.close();
		st2.close();
		st3.close();
		st4.close();
		st5.close();
		st6.close();
		st7.close();
		st8.close();
		connection.close();
		
		model.setRowCount(0);
		searchBook(model, str1,str2,str3,str4,str5,str6,str7);
	}
	
	public synchronized void deleteBook(DefaultTableModel model, String s1, String str1, String str2, String str3, String str4, String str5, String str6, String str7) throws ClassNotFoundException, SQLException
	{
		String query = "DELETE FROM BOOKS WHERE BOOKID = " + s1;
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		st.executeUpdate(query);
		st.close();
		connection.close();
		
		model.setRowCount(0);
		searchBook(model, str1,str2,str3,str4,str5,str6,str7);
	}
	
	public synchronized void deleteAllBooks() throws ClassNotFoundException, SQLException
	{
		String query = "TRUNCATE TABLE BOOKS";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		st.executeUpdate(query);
		st.close();
		connection.close();
	}
	
	public synchronized void updateUser(DefaultTableModel model, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String str1, String str2, String str3, String str4, String str5, String str6, String str7) throws ClassNotFoundException, SQLException
	{
		String query1 = "UPDATE USERS SET DOB = '" + s2 + "' WHERE USERID = " + s1;
		String query2 = "UPDATE USERS SET NAME = \"" + s3 + "\" WHERE USERID = " + s1;
		String query3 = "UPDATE USERS SET EMAIL = \"" + s6 + "\" WHERE USERID = " + s1;
		String query4 = "UPDATE USERS SET DATEOFREGISTRATION = \"" + s7 + "\" WHERE USERID = " + s1;
		String query5 = "UPDATE USERS SET CONTACT = \"" + s5 + "\" WHERE USERID = " + s1;
		String query6 = "UPDATE USERS SET RESIDENCE = \"" + s4 + "\" WHERE USERID = " + s1;
		
		Class.forName(sql);
		
		Connection connection = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st1 = connection.prepareStatement(query1);
		PreparedStatement st2 = connection.prepareStatement(query2);
		PreparedStatement st3 = connection.prepareStatement(query3);
		PreparedStatement st4 = connection.prepareStatement(query4);
		PreparedStatement st5 = connection.prepareStatement(query5);
		PreparedStatement st6 = connection.prepareStatement(query6);
		
		st1.executeUpdate(query1);
		st2.executeUpdate(query2);
		st3.executeUpdate(query3);
		st4.executeUpdate(query4);
		st5.executeUpdate(query5);
		st6.executeUpdate(query6);
		
		st1.close();
		st2.close();
		st3.close();
		st4.close();
		st5.close();
		st6.close();
		connection.close();
		
		model.setRowCount(0);
		searchUser(model, str1,str2,str3,str4,str5,str6,str7);
	}
	
	public synchronized void deleteUser(DefaultTableModel model, String s1, String str1, String str2, String str3, String str4, String str5, String str6, String str7) throws ClassNotFoundException, SQLException
	{
		String query = "DELETE FROM USERS WHERE USERID = " + s1;
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = connection.prepareStatement(query);
		st.executeUpdate(query);
		st.close();
		connection.close();
		
		model.setRowCount(0);
		searchUser(model, str1,str2,str3,str4,str5,str6,str7);
	}
	
	public synchronized void showBookIssuedAllData(String id,DefaultTableModel model, int model_no) throws ClassNotFoundException, SQLException
	{
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		
		if(model_no==1)
		{
			String query1 = "SELECT U.USERID, U.NAME, U.CONTACT, U.EMAIL, B.DATEOFISSUE, B.DUEDATE FROM USERS U NATURAL JOIN BOOKISSUE B WHERE B.BOOKID = " + id;
			String query2 = "SELECT U.USERID, U.NAME, U.CONTACT, U.EMAIL, B.DATEOFISSUE, B.DUEDATE, B.RETURNDATE, B.FINE FROM USERS U NATURAL JOIN BOOKRETURN B WHERE B.BOOKID = " + id;
		
			PreparedStatement st1 = connection.prepareStatement(query1);
			ResultSet rs1 = st1.executeQuery(query1);
			while(rs1.next())
			{
				String str1 = rs1.getString(1);		//USER ID
				String str2 = rs1.getString(2);		//NAME
				String str3 = rs1.getString(3);		//CONTACT
				String str4 = rs1.getString(4);		//EMAIL ID
				String str5 = rs1.getString(5);		//DATE OF ISSUE
				String str6 = rs1.getString(6);		//DUE DATE
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6});
			}
			st1.close();
			
			PreparedStatement st2 = connection.prepareStatement(query2);
			ResultSet rs2 =  st2.executeQuery(query2);
			while(rs2.next())
			{
				String str1 = rs2.getString(1);		//USER ID
				String str2 = rs2.getString(2);		//NAME
				String str3 = rs2.getString(3);		//CONTACT
				String str4 = rs2.getString(4);		//EMAIL ID
				String str5 = rs2.getString(5);		//DATE OF ISSUE
				String str6 = rs2.getString(6);		//DUE DATE
				String str7 = rs2.getString(7);		//RETURN DATE
				String str8 = rs2.getString(8);		//FINE
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8});
			}
			st2.close();
		}
		
		else if(model_no==2)
		{
			String query1 = "SELECT B.BOOKID, B.BOOKNAME, B.AUTHOR, B.ISBN, BI.DATEOFISSUE, BI.DUEDATE FROM BOOKS B NATURAL JOIN BOOKISSUE BI WHERE BI.USERID = " + id;
			String query2 = "SELECT B.BOOKID, B.BOOKNAME, B.AUTHOR, B.ISBN, BI.DATEOFISSUE, BI.DUEDATE, BI.RETURNDATE, BI.FINE FROM BOOKS B NATURAL JOIN BOOKRETURN BI WHERE BI.USERID = " + id;
		
			PreparedStatement st1 = connection.prepareStatement(query1);
			ResultSet rs1 = st1.executeQuery(query1);
			while(rs1.next())
			{
				String str1 = rs1.getString(1);		//BOOK ID
				String str2 = rs1.getString(2);		//BOOK NAME
				String str3 = rs1.getString(3);		//AUTHOR
				String str4 = rs1.getString(4);		//ISBN
				String str5 = rs1.getString(5);		//DATE OF ISSUE
				String str6 = rs1.getString(6);		//DUE DATE
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6});
			}
			st1.close();
			
			PreparedStatement st2 = connection.prepareStatement(query2);
			ResultSet rs2 =  st2.executeQuery(query2);
			while(rs2.next())
			{
				String str1 = rs2.getString(1);		//BOOK ID
				String str2 = rs2.getString(2);		//BOOK NAME
				String str3 = rs2.getString(3);		//AUTHOR
				String str4 = rs2.getString(4);		//ISBN
				String str5 = rs2.getString(5);		//DATE OF ISSUE
				String str6 = rs2.getString(6);		//DUE DATE
				String str7 = rs2.getString(7);		//RETURN DATE
				String str8 = rs2.getString(8);		//FINE
				((DefaultTableModel) model).addRow(new Object[] {str1,str2,str3,str4,str5,str6,str7,str8});
			}
			st2.close();
		}
		
		connection.close();	
	}
	
	public synchronized void clearDatabase() throws ClassNotFoundException, SQLException
	{
		String query1 = "DROP TABLE BOOKISSUE";
		String query2 = "TRUNCATE TABLE BOOKRETURN";
		String query3 = "TRUNCATE TABLE BOOKS";
		String query4 = "TRUNCATE TABLE USERS";
		String query5 = "CREATE TABLE BOOKISSUE (BOOKID INT PRIMARY KEY, USERID INT, DATEOFISSUE VARCHAR(10), DUEDATE VARCHAR(10), FOREIGN KEY (BOOKID) REFERENCES BOOKS(BOOKID), FOREIGN KEY (USERID) REFERENCES USERS(USERID))";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st1 = connection.prepareStatement(query1);
		PreparedStatement st2 = connection.prepareStatement(query2);
		PreparedStatement st3 = connection.prepareStatement(query3);
		PreparedStatement st4 = connection.prepareStatement(query4);
		PreparedStatement st5 = connection.prepareStatement(query5);
		
		st1.executeUpdate(query1);
		st2.executeUpdate(query2);
		st3.executeUpdate(query3);
		st4.executeUpdate(query4);
		st5.executeUpdate(query5);
		
		st1.close();
		st2.close();
		st3.close();
		st4.close();
		st5.close();
		
		connection.close();
	}
	
	public synchronized void deleteDatabase() throws ClassNotFoundException, SQLException
	{
		String query1 = "DROP TABLE BOOKISSUE";
		String query2 = "DROP TABLE BOOKRETURN";
		String query3 = "DROP TABLE BOOKS";
		String query4 = "DROP TABLE USERS";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st1 = connection.prepareStatement(query1);
		PreparedStatement st2 = connection.prepareStatement(query2);
		PreparedStatement st3 = connection.prepareStatement(query3);
		PreparedStatement st4 = connection.prepareStatement(query4);
		
		st1.executeUpdate(query1);
		st2.executeUpdate(query2);
		st3.executeUpdate(query3);
		st4.executeUpdate(query4);
		
		st1.close();
		st2.close();
		st3.close();
		st4.close();
		
		connection.close();
	}
	
	public synchronized void addDatabase() throws ClassNotFoundException, SQLException
	{
		String query1 = "CREATE TABLE BOOKS (BOOKID INT PRIMARY KEY, DATEOFARRIVAL VARCHAR(10), BOOKNAME VARCHAR(100), AUTHOR CHAR(50), CATEGORY CHAR(30), EDITION VARCHAR(20), ISBN CHAR(50), PUBLICATIONS VARCHAR(50), PUBLISHEDYEAR INT)";
		String query2 = "CREATE TABLE USERS (USERID INT PRIMARY KEY, DATEOFREGISTRATION VARCHAR(10), NAME CHAR(100), DOB VARCHAR(10), CONTACT CHAR(10), EMAIL VARCHAR(50), RESIDENCE VARCHAR(300))";
		String query3 = "CREATE TABLE BOOKISSUE (BOOKID INT PRIMARY KEY, USERID INT, DATEOFISSUE VARCHAR(10), DUEDATE VARCHAR(10), FOREIGN KEY (BOOKID) REFERENCES BOOKS(BOOKID), FOREIGN KEY (USERID) REFERENCES USERS(USERID))";
		String query4 = "CREATE TABLE BOOKRETURN (BOOKID INT, USERID INT, DATEOFISSUE VARCHAR(10), DUEDATE VARCHAR(10), RETURNDATE VARCHAR(10), FINE INT)";
		
		Class.forName(sql);
		Connection connection = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st1 = connection.prepareStatement(query1);
		PreparedStatement st2 = connection.prepareStatement(query2);
		PreparedStatement st3 = connection.prepareStatement(query3);
		PreparedStatement st4 = connection.prepareStatement(query4);
		
		st1.executeUpdate(query1);
		st2.executeUpdate(query2);
		st3.executeUpdate(query3);
		st4.executeUpdate(query4);
		
		st1.close();
		st2.close();
		st3.close();
		st4.close();
		
		connection.close();
	}
	
	public void test()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER USERNAME : ");
		String username = scan.next();
		
			
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nanay", "root"  , "T@nay123");
			PreparedStatement st = connection.prepareStatement("SELECT * FROM TABLE_NAME WHERE USERNAME = '" + username + "'");
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				System.out.println("VALID USERNAME");
			}
			else
			{
				System.out.println("INVALID USERNAME");
			}
			st.close();
			connection.close();
		} 
		catch (java.sql.SQLIntegrityConstraintViolationException e)
		{
			System.out.println("USERNAME ALREADY EXISTS");
		}
		catch (ClassNotFoundException | SQLException e1) 
		{
			e1.printStackTrace();
		}
	}
}