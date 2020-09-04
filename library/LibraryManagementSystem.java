package library;

import java.awt.EventQueue;
import java.awt.Font;
import tools.Clock;


import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import javax.swing.JRadioButtonMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;

public class LibraryManagementSystem 
{
	private JFrame frame;
	private JFrame login_frame;
	private JLabel current_time;
	private JLabel current_date;
	private JPanel status_bar;
	private JLabel status_no_of_books;
	private JLabel status_no_of_users;
	private JLabel status_books_issued;
	private JTextField booksdate_tf;
	private JTextField nob_tf;
	private JTextField bookname_tf;
	private JTextField author_tf;
	private JTextField category_tf;
	private JTextField edition_tf;
	private JTextField isbn_tf;
	private JTextField publications_tf;
	private JTextField publishedyear_tf;
	private JTextField issue_dateofissue_tf;
	private JTextField issue_bookid_tf;
	private JTextField issue_userid_tf;
	private JTextField issue_duedate_tf;
	private JTextField return_bookid_tf;
	private JTextField return_returndate_tf;
	private JTextField return_fine_tf;
	private JTextField newuser_date_tf;
	private JTextField fname_tf;
	private JTextField userid_tf;
	private JTextField mname_tf;
	private JTextField lname_tf;
	private JTextField dob_tf;
	private JTextField phone_tf;
	private JTextField emailid_tf;
	private JTextField searchbook_bookid_tf;
	private JTextField searchbook_isbn_tf;
	private JTextField searchbook_bookname_tf;
	private JTextField searchbook_author_tf;
	private JTextField searchbook_category_tf;
	private JTextField searchbook_publications_tf;
	private JTextField searchbook_publishedyear_tf;
	private JTextField searchuser_userid_tf;
	private JTextField searchuser_dob_tf;
	private JTextField searchuser_name_tf;
	private JTextField searchuser_contact_tf;
	private JTextField searchuser_email_tf;
	private JTextField searchuser_registrationdate_tf;
	private JTextField searchauthor_bookid_tf;
	private JTextField searchauthor_bookname_tf;
	private JTextField searchauthor_author_tf;
	private JTextField updatebook_search_bookid_tf;
	private JTextField updatebook_search_isbn_tf;
	private JTextField updatebook_search_bookname_tf;
	private JTextField updatebook_search_author_tf;
	private JTextField updatebook_search_category_tf;
	private JTextField updatebook_search_publications_tf;
	private JTextField updatebook_search_publishedyear_tf;
	private JTextField updatebook_update_bookid_tf;
	private JTextField updatebook_update_isbn_tf;
	private JTextField updatebook_update_bookname_tf;
	private JTextField updatebook_update_author_tf;
	private JTextField updatebook_update_category_tf;
	private JTextField updatebook_update_publications_tf;
	private JTextField updatebook_update_publishedyear_tf;
	private JTextField updatebook_update_edition_tf;
	private JTextField updatebook_update_dateofarrival_tf;
	private JTextField updateuser_search_userid_tf;
	private JTextField updateuser_search_dob_tf;
	private JTextField updateuser_search_name_tf;
	private JTextField updateuser_search_contact_tf;
	private JTextField updateuser_search_email_tf;
	private JTextField updateuser_search_dateofregistration_tf;
	private JTextField updateuser_update_userid_tf;
	private JTextField updateuser_update_dob_tf;
	private JTextField updateuser_update_name_tf;
	private JTextField updateuser_update_contact_tf;
	private JTextField updateuser_update_email_tf;
	private JTextField updateuser_update_dateofregistration_tf;
	private JTextArea searchuser_residence_tf;
	private JTextArea updateuser_search_residence_tf;
	private JTextArea updateuser_update_residence_tf;
	private JTable user_update_table;
	private JTable user_data_table;
	private JTable books_update_table;
	private JTable author_search_table;
	private JTable user_search_table;
	private JTable books_search_table;
	private JTable books_data_table;
	private JTable bookissue_table;
	private JTable bookreturn_table;
	private JTable new_book_table;
	private JTable new_user_table;
	private JTable booksissued_data_table;
	private JTable returnbooks_data_table;
	private String bookid, userid, driver;
	private JTextField books_user_bookid_tf;
	private JTextField books_user_isbn_tf;
	private JTextField books_user_bookname_tf;
	private JTextField books_user_author_tf;
	private JTextField books_user_category_tf;
	private JTextField books_user_publications_tf;
	private JTextField books_user_publishedyear_tf;
	private JTextField books_user_edition_tf;
	private JTextField books_user_dateofarrival_tf;
	private JTextField return_issuedate_tf;
	private JTextField return_duedate_tf;
	private JLabel return_userid_lbl2;
	private JLabel return_name_lbl2;
	private JLabel return_dob_lbl2;
	private JLabel return_contact_lbl2;
	private JLabel return_email_lbl2;
	private JLabel return_bookname_lbl2;
	private JLabel return_author_lbl2;
	private JLabel return_category_lbl2;
	private JLabel return_edition_lbl2;
	private JLabel return_publications_lbl2;
	private JLabel return_publishedyear_lbl2;
	private JTextField user_books_userid_tf;
	private JTextField user_books_dob_tf;
	private JTextField user_books_name_tf;
	private JTextField user_books_contact_tf;
	private JTextField user_books_email_tf;
	private JTextField user_books_registrationdate_tf;
	private JTextArea user_books_residence_tf;
	private Formatter x;
	private static String username;
	private static String password;
	int date_year;
	private JTextField login_username_tf;
	private JTextField login_password_tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try
				{
					LibraryManagementSystem window = new LibraryManagementSystem();
					//window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public LibraryManagementSystem() 
	{
		//readFile1();
		initialize();
		//checkPassword();
	}
	
	public void checkPassword()
	{
		JFrame login_frame = new JFrame();
		login_frame.setSize(466, 224);
		login_frame.setLocationRelativeTo(null);
		login_frame.setResizable(false);
		login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login_frame.getContentPane().setLayout(null);
		login_frame.setVisible(true);
		login_frame.setTitle("Library Management System");
		
		KeyListener cancel_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ESCAPE || c==KeyEvent.VK_ENTER)
				{
					login_frame.dispose();
				}
			}
		};
		JLabel login_username_lbl = new JLabel("Username            : ");
		login_username_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		login_username_lbl.setBounds(45, 25, 146, 50);
		login_frame.getContentPane().add(login_username_lbl);
		
		JLabel login_password_lbl = new JLabel("Password             : ");
		login_password_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		login_password_lbl.setBounds(45, 70, 146, 50);
		login_frame.getContentPane().add(login_password_lbl);
		
		login_username_tf = new JTextField();
		login_username_tf.setBounds(212, 35, 180, 22);
		login_frame.getContentPane().add(login_username_tf);
		login_username_tf.setColumns(10);
		login_username_tf.addKeyListener(cancel_key);
		
		login_password_tf = new JTextField();
		login_password_tf.setBounds(212, 80, 180, 22);
		login_frame.getContentPane().add(login_password_tf);
		login_password_tf.setColumns(10);
		login_password_tf.addKeyListener(cancel_key);
		
		ActionListener loggedin = new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if((login_username_tf.getText()).equals(username) && ((login_password_tf.getText()).equals(password)))
				{
					login_frame.dispose();
					initialize();
					Date date = new Date();
					//SimpleDateFormat dateformat1 = new SimpleDateFormat("dd/MM/YYYY");
					SimpleDateFormat dateformat2 = new SimpleDateFormat("YYYY");
					date_year = Integer.parseInt(dateformat2.format(date));
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Username or Password");
				}
			}
		};
		
		
		JButton login_btn = new JButton("Login");
		login_btn.setBounds(88, 131, 140, 23);
		login_frame.getContentPane().add(login_btn);
		login_btn.addActionListener(loggedin);
		
		JButton login_cancel_btn = new JButton("Cancel");
		login_cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_frame.dispose();
			}
		});
		login_cancel_btn.setBounds(262, 131, 130, 23);
		login_frame.getContentPane().add(login_cancel_btn);
		login_cancel_btn.addKeyListener(cancel_key);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		System.out.println("Hello World");
		
		Date date = new Date();
		SimpleDateFormat dateformat1 = new SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat dateformat2 = new SimpleDateFormat("YYYY");
		date_year = Integer.parseInt(dateformat2.format(date));
		
		frame = new JFrame();
		frame.setSize(1440, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Library Management System");
		
		status_bar = new JPanel();
		status_bar.setLayout(null);
		status_bar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		status_bar.setBounds(0, 704, 1424, 35);
		frame.getContentPane().add(status_bar);
		
		current_date = new JLabel();
		current_date.setBounds(1231, 5, 76, 25);
		
		current_time = new JLabel();
		current_time.setBounds(1317, 5, 97, 25);
		
		Clock clk = new Clock();
		
		clk.clock(status_bar, current_date, current_time);
		
		Database database = new Database();
		database.readFile();
		database.readFile1();
		readFile();
		Database.setDriver(Integer.parseInt(driver));
		
		DefaultTableModel book_issue_model = new DefaultTableModel();
		book_issue_model.addColumn("Book ID");
		book_issue_model.addColumn("User ID");			
		book_issue_model.addColumn("Date of Issue");
		book_issue_model.addColumn("Due Date");
		
		DefaultTableModel book_return_model = new DefaultTableModel();
		book_return_model.addColumn("Book ID");
		book_return_model.addColumn("User ID");			
		book_return_model.addColumn("Date of Issue");
		book_return_model.addColumn("Due Date");
		book_return_model.addColumn("Return Date");
		book_return_model.addColumn("Fine");
		
		DefaultTableModel new_book_model = new DefaultTableModel();
		new_book_model.addColumn("Book ID");			
		new_book_model.addColumn("Book Name");
		new_book_model.addColumn("Author");
		new_book_model.addColumn("ISBN");
		
		DefaultTableModel new_user_model = new DefaultTableModel();
		new_user_model.addColumn("UID");
		new_user_model.addColumn("NAME");
		new_user_model.addColumn("DOB");
		new_user_model.addColumn("CONTACT");
		
		DefaultTableModel books_data_model = new DefaultTableModel();
		books_data_model.addColumn("Book ID");
		books_data_model.addColumn("Date of Arrival");
		books_data_model.addColumn("Book Name");
		books_data_model.addColumn("Author");
		books_data_model.addColumn("Category");
		books_data_model.addColumn("Edition");
		books_data_model.addColumn("ISBN");
		books_data_model.addColumn("Publications");
		books_data_model.addColumn("Published Year");
		
		DefaultTableModel user_data_model = new DefaultTableModel();
		user_data_model.addColumn("User ID");
		user_data_model.addColumn("Name");
		user_data_model.addColumn("Date of Birth");
		user_data_model.addColumn("Contact");
		user_data_model.addColumn("Email ID");
		user_data_model.addColumn("Residence");
		user_data_model.addColumn("Date of Registration");
		
		DefaultTableModel book_return_info_model = new DefaultTableModel();
		book_return_info_model.addColumn("User ID");
		book_return_info_model.addColumn("Name");
		book_return_info_model.addColumn("Book ID");
		book_return_info_model.addColumn("Book Name");
		book_return_info_model.addColumn("Date of Issue");
		book_return_info_model.addColumn("Due Date");
		book_return_info_model.addColumn("Return Date");
		book_return_info_model.addColumn("Fine");
		
		DefaultTableModel search_author_model = new DefaultTableModel();
		search_author_model.addColumn("Sr. No");
		search_author_model.addColumn("Book Name");
		search_author_model.addColumn("Author");
		
		DefaultTableModel books_user_info_model = new DefaultTableModel();
		books_user_info_model.addColumn("User ID");
		books_user_info_model.addColumn("User Name");
		books_user_info_model.addColumn("Contact");
		books_user_info_model.addColumn("Email ID");
		books_user_info_model.addColumn("Date of Issue");
		books_user_info_model.addColumn("Due Date");
		books_user_info_model.addColumn("Return Date");
		books_user_info_model.addColumn("Fine");
		
		DefaultTableModel books_issued_info_model = new DefaultTableModel();
		books_issued_info_model.addColumn("Book ID");
		books_issued_info_model.addColumn("Book Name");			
		books_issued_info_model.addColumn("User ID");
		books_issued_info_model.addColumn("User Name");
		books_issued_info_model.addColumn("Contact");
		books_issued_info_model.addColumn("Email ID");			
		books_issued_info_model.addColumn("Date of Issue");
		books_issued_info_model.addColumn("Due Date");
		
		DefaultTableModel user_books_info_model = new DefaultTableModel();
		user_books_info_model.addColumn("Book ID");
		user_books_info_model.addColumn("Book Name");			
		user_books_info_model.addColumn("Author");
		user_books_info_model.addColumn("ISBN");
		user_books_info_model.addColumn("Date of Issue");
		user_books_info_model.addColumn("Due Date");
		user_books_info_model.addColumn("Return Date");
		user_books_info_model.addColumn("Fine");
		
		book_issue_model.setRowCount(0);
		book_return_model.setRowCount(0);
		new_book_model.setRowCount(0);
		new_user_model.setRowCount(0);
		books_data_model.setRowCount(0);
		user_data_model.setRowCount(0);
		search_author_model.setRowCount(0);
		books_user_info_model.setRowCount(0);
		books_issued_info_model.setRowCount(0);
		user_books_info_model.setRowCount(0);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(1004, 7, 150, 23);
		status_bar.add(progressBar);
		
		status_no_of_books = new JLabel("No. of Books : 0");
		status_no_of_books.setBounds(10, 7, 125, 23);
		status_bar.add(status_no_of_books);
		
		status_no_of_users = new JLabel("No. of Users : 0");
		status_no_of_users.setBounds(145, 7, 125, 23);
		status_bar.add(status_no_of_users);
		
		status_books_issued = new JLabel("Books Issued : 0");
		status_books_issued.setBounds(275, 7, 125, 23);
		status_bar.add(status_books_issued);
		
		new BooksCount(status_bar, status_no_of_books);
		new UsersCount(status_bar, status_no_of_users);
		new BooksIssuedCount(status_bar, status_books_issued);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(140, 2, 2, 31);
		status_bar.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(270, 2, 2, 31);
		status_bar.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setBounds(400, 2, 2, 31);
		status_bar.add(separator_13);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		toolBar.setBounds(0, 0, 1424, 33);
		frame.getContentPane().add(toolBar);
		
		JButton btnBack = new JButton("BACK");
		toolBar.add(btnBack);
		
		JLayeredPane main_layeredpane = new JLayeredPane();
		main_layeredpane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		main_layeredpane.setBounds(0, 34, 1424, 626);
		frame.getContentPane().add(main_layeredpane);
		main_layeredpane.setLayout(new CardLayout(0, 0));
		
		JPanel main_panel = new JPanel();
		main_layeredpane.add(main_panel);
		main_panel.setLayout(null);
		
		JPanel title_panel = new JPanel();
		title_panel.setBounds(10, 11, 1395, 80);
		title_panel.setLayout(null);
		main_panel.add(title_panel);
		title_panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JLabel title_lbl = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		title_lbl.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		title_lbl.setBounds(0, 0, 1395, 80);
		title_lbl.setHorizontalAlignment(JLabel.CENTER);
		title_lbl.setBackground(Color.BLACK);
		
		title_panel.add(title_lbl);
		
		JLayeredPane data_layeredpane = new JLayeredPane();
		data_layeredpane.setBounds(848, 102, 557, 500);
		main_panel.add(data_layeredpane);
		
		data_layeredpane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		data_layeredpane.setLayout(new CardLayout(0, 0));
		
		JPanel bookissue_data_panel = new JPanel();
		bookissue_data_panel.setLayout(null);
		data_layeredpane.add(bookissue_data_panel);
		
		JScrollPane bookissue_data_scrollpane = new JScrollPane();
		bookissue_data_scrollpane.setSize(543, 485);
		bookissue_data_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		bookissue_data_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bookissue_data_panel.add(bookissue_data_scrollpane);
		
		bookissue_table = new JTable(book_issue_model);
		
		bookissue_table.getColumnModel().getColumn(0).setPreferredWidth(10);
		bookissue_table.getColumnModel().getColumn(1).setPreferredWidth(10);
		bookissue_table.getColumnModel().getColumn(2).setPreferredWidth(30);
		bookissue_table.getColumnModel().getColumn(3).setPreferredWidth(30);
		
		bookissue_data_scrollpane.setViewportView(bookissue_table);
		
		JPanel bookreturn_data_panel = new JPanel();
		bookreturn_data_panel.setLayout(null);
		data_layeredpane.add(bookreturn_data_panel);
		
		JScrollPane bookreturn_data_scrollpane = new JScrollPane();
		bookreturn_data_scrollpane.setBounds(0, 0, 543, 485);
		bookreturn_data_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		bookreturn_data_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bookreturn_data_panel.add(bookreturn_data_scrollpane);
		
		bookreturn_table = new JTable(book_return_model);
		
		bookreturn_table.getColumnModel().getColumn(0).setPreferredWidth(8);
		bookreturn_table.getColumnModel().getColumn(1).setPreferredWidth(8);
		bookreturn_table.getColumnModel().getColumn(2).setPreferredWidth(30);
		bookreturn_table.getColumnModel().getColumn(3).setPreferredWidth(30);
		bookreturn_table.getColumnModel().getColumn(4).setPreferredWidth(30);
		bookreturn_table.getColumnModel().getColumn(5).setPreferredWidth(1);
		
		bookreturn_data_scrollpane.setViewportView(bookreturn_table);
		
		JPanel newbook_data_panel = new JPanel();
		newbook_data_panel.setLayout(null);
		data_layeredpane.add(newbook_data_panel);
		
		JScrollPane newbook_data_scrollpane = new JScrollPane();
		newbook_data_scrollpane.setBounds(0, 0, 543, 485);
		newbook_data_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		newbook_data_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		newbook_data_panel.add(newbook_data_scrollpane);
	
		new_book_table = new JTable(new_book_model);
		
		new_book_table.getColumnModel().getColumn(0).setPreferredWidth(1);
		new_book_table.getColumnModel().getColumn(1).setPreferredWidth(170);
		new_book_table.getColumnModel().getColumn(2).setPreferredWidth(35);
		new_book_table.getColumnModel().getColumn(3).setPreferredWidth(30);
		
		newbook_data_scrollpane.setViewportView(new_book_table);
		
		JPanel newuser_data_panel = new JPanel();
		newuser_data_panel.setLayout(null);
		data_layeredpane.add(newuser_data_panel);
		
		JScrollPane newuser_data_scrollpane = new JScrollPane();
		newuser_data_scrollpane.setBounds(0, 0, 543, 485);
		newuser_data_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		newuser_data_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		newuser_data_panel.add(newuser_data_scrollpane);
		
		new_user_table = new JTable(new_user_model);
		
		new_user_table.getColumnModel().getColumn(0).setPreferredWidth(1);
		new_user_table.getColumnModel().getColumn(1).setPreferredWidth(170);
		new_user_table.getColumnModel().getColumn(2).setPreferredWidth(35);
		new_user_table.getColumnModel().getColumn(3).setPreferredWidth(30);
		
		newuser_data_scrollpane.setViewportView(new_user_table);
		
		JLayeredPane admin_layeredpane = new JLayeredPane();
		admin_layeredpane.setBounds(10, 102, 828, 501);
		main_panel.add(admin_layeredpane);
		admin_layeredpane.setBorder(UIManager.getBorder("DesktopIcon.border"));
		admin_layeredpane.setLayout(new CardLayout(0, 0));
		
		JPanel bookissue_panel = new JPanel();
		bookissue_panel.setLayout(null);
		bookissue_panel.setBorder(new TitledBorder(null, "Book Issue", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		admin_layeredpane.add(bookissue_panel);
		
		JLabel issuebookid_lbl = new JLabel("BOOK ID                 : ");
		issuebookid_lbl.setBounds(55, 50, 120, 50);
		bookissue_panel.add(issuebookid_lbl);
		
		JLabel issue_userid_lbl = new JLabel("USER ID                 : ");
		issue_userid_lbl.setBounds(55, 130, 120 , 50);
		bookissue_panel.add(issue_userid_lbl);
		
		JLabel issue_dateofissue_lbl = new JLabel("DATE OF ISSUE    : ");
		issue_dateofissue_lbl.setBounds(55, 210, 120, 50);
		bookissue_panel.add(issue_dateofissue_lbl);
		
		JLabel issue_duedate_lbl = new JLabel("DUE DATE             : ");
		issue_duedate_lbl.setBounds(55, 290, 120, 50);
		bookissue_panel.add(issue_duedate_lbl);
		
		issue_dateofissue_tf = new JTextField();
		issue_dateofissue_tf.setBounds(184, 220, 120, 30);
		bookissue_panel.add(issue_dateofissue_tf);
		issue_dateofissue_tf.setColumns(10);
		issue_dateofissue_tf.setText(dateformat1.format(date));
		checkDate(issue_dateofissue_tf);
		
		issue_bookid_tf = new JTextField();
		issue_bookid_tf.setBounds(185, 60, 75, 30);
		bookissue_panel.add(issue_bookid_tf);
		issue_bookid_tf.setColumns(10);
		onlyNumerics(issue_bookid_tf);
		
		issue_userid_tf = new JTextField();
		issue_userid_tf.setBounds(184, 140, 75, 30);
		bookissue_panel.add(issue_userid_tf);
		issue_userid_tf.setColumns(10);
		onlyNumerics(issue_userid_tf);
		
		issue_duedate_tf = new JTextField();
		issue_duedate_tf.setBounds(184, 300, 120, 30);
		bookissue_panel.add(issue_duedate_tf);
		issue_duedate_tf.setColumns(10);
		checkDate(issue_duedate_tf);
		
		JButton issue_bookissue_btn = new JButton("ISSUE BOOK");
		issue_bookissue_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = issue_bookid_tf.getText();
				String s2 = issue_userid_tf.getText();
				String s3 = issue_dateofissue_tf.getText();
				String s4 = issue_duedate_tf.getText();
				issue_bookid_tf.setText("");
				issue_userid_tf.setText("");
				try 
				{
					database.issueBook(new String[] {s1,s2,s3,s4});
				}
				catch (ClassNotFoundException e1) 
				{
					JOptionPane.showMessageDialog(null,"Driver is not working");
				} 
				catch (SQLException e2) 
				{
					JOptionPane.showMessageDialog(null,"Invalid Book ID or UID");
				} 
				catch (NumberFormatException e3) 
				{
					JOptionPane.showMessageDialog(null,"Book ID or UID cannot be blank");
				}
				
				book_issue_model.setRowCount(0);
				new BookIssueDataThread(database, book_issue_model);
			}
		});
		issue_bookissue_btn.setBounds(219, 406, 145, 40);
		bookissue_panel.add(issue_bookissue_btn);
		
		JButton issue_reset_btn = new JButton("RESET");
		issue_reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				issue_bookid_tf.setText("");
				issue_userid_tf.setText("");
			}
		});
		issue_reset_btn.setBounds(400, 406, 145, 40);
		bookissue_panel.add(issue_reset_btn);
		
		JPanel bookreturn_panel = new JPanel();
		bookreturn_panel.setLayout(null);
		bookreturn_panel.setBorder(new TitledBorder(null, "Book Return", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		admin_layeredpane.add(bookreturn_panel);
		
		JLabel return_bookid_lbl = new JLabel("BOOK ID                  : ");
		return_bookid_lbl.setBounds(25, 26, 110, 30);
		bookreturn_panel.add(return_bookid_lbl);
		
		KeyListener return_bookid_key = new KeyListener()
				{
					public void keyTyped(KeyEvent e) 
					{
						char c=e.getKeyChar();
						if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))
						{
							e.consume();
						}
						
						return_bookname_lbl2.setText("");
						return_author_lbl2.setText("");
						return_category_lbl2.setText("");
						return_edition_lbl2.setText("");
						return_publications_lbl2.setText("");
						return_publishedyear_lbl2.setText("");
						return_userid_lbl2.setText("");
						return_name_lbl2.setText("");
						return_dob_lbl2.setText("");
						return_contact_lbl2.setText("");
						return_email_lbl2.setText("");
						return_issuedate_tf.setText("");
						return_duedate_tf.setText("");
						//return_returndate_tf.setText("");
						//return_fine_tf.setText("");
					}

					public void keyPressed(KeyEvent e) 
					{}

					public void keyReleased(KeyEvent e) 
					{
						String str = return_bookid_tf.getText();
						if(str.equals(""))
						{
							str = "0";
						}
						new BookReturnThread(database, str,new JLabel[] {return_bookname_lbl2, return_author_lbl2, return_category_lbl2, return_edition_lbl2, return_publications_lbl2, return_publishedyear_lbl2}, new JLabel[] {return_userid_lbl2, return_name_lbl2, return_dob_lbl2, return_contact_lbl2, return_email_lbl2}, new JTextField[] {return_issuedate_tf, return_duedate_tf, return_returndate_tf, return_fine_tf});
					}
				};
		
		return_bookid_tf = new JTextField();
		return_bookid_tf.setColumns(10);
		return_bookid_tf.setBounds(145, 31, 75, 20);
		bookreturn_panel.add(return_bookid_tf);
		return_bookid_tf.addKeyListener(return_bookid_key);
		
		JButton return_btn = new JButton("RETURN BOOK");
		return_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s1 = return_bookid_tf.getText();
				String s2 = return_userid_lbl2.getText();
				String s3 = return_issuedate_tf.getText();
				String s4 = return_duedate_tf.getText();
				String s5 = return_returndate_tf.getText();
				String s6 = return_fine_tf.getText();
				if(s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals("") || s6.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter valid data");
				}
				else
				{
					try 
					{
						database.returnBook(new String[] {s1,s2,s3,s4,s5,s6});
						database.deleteIssuedBook(s1);
					} 
					catch (ClassNotFoundException e1) 
					{
						JOptionPane.showMessageDialog(null,"Driver is not working");
					} 
					catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null,"Please Enter valid data");
					}
					
					book_return_model.setRowCount(0);
					new BookReturnDataThread(database, book_return_model);
					
					return_bookid_tf.setText("");
					return_bookname_lbl2.setText("");
					return_author_lbl2.setText("");
					return_category_lbl2.setText("");
					return_edition_lbl2.setText("");
					return_publications_lbl2.setText("");
					return_publishedyear_lbl2.setText("");
					return_userid_lbl2.setText("");
					return_name_lbl2.setText("");
					return_dob_lbl2.setText("");
					return_contact_lbl2.setText("");
					return_email_lbl2.setText("");
					return_issuedate_tf.setText("");
					return_duedate_tf.setText(""); 
				}
			}
		});
		return_btn.setBounds(219, 436, 145, 40);
		bookreturn_panel.add(return_btn);
		
		JButton return_reset_btn = new JButton("RESET");
		return_reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return_bookid_tf.setText("");
				return_bookname_lbl2.setText("");
				return_author_lbl2.setText("");
				return_category_lbl2.setText("");
				return_edition_lbl2.setText("");
				return_publications_lbl2.setText("");
				return_publishedyear_lbl2.setText("");
				return_userid_lbl2.setText("");
				return_name_lbl2.setText("");
				return_dob_lbl2.setText("");
				return_contact_lbl2.setText("");
				return_email_lbl2.setText("");
				return_issuedate_tf.setText("");
				return_duedate_tf.setText(""); 
				return_returndate_tf.setText("");
			}
		});
		return_reset_btn.setBounds(400, 436, 145, 40);
		bookreturn_panel.add(return_reset_btn);
		
		return_returndate_tf = new JTextField();
		return_returndate_tf.setColumns(10);
		return_returndate_tf.setBounds(560, 313, 120, 30);
		return_returndate_tf.setText(dateformat1.format(date));
		bookreturn_panel.add(return_returndate_tf);
		checkDate(return_returndate_tf);
		
		return_fine_tf = new JTextField();
		return_fine_tf.setColumns(10);
		return_fine_tf.setBounds(560, 354, 120, 30);
		return_fine_tf.setText("0");
		bookreturn_panel.add(return_fine_tf);
		
		return_issuedate_tf = new JTextField();
		return_issuedate_tf.setEditable(false);
		return_issuedate_tf.setColumns(10);
		return_issuedate_tf.setBounds(145, 313, 120, 30);
		bookreturn_panel.add(return_issuedate_tf);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		separator.setBounds(5, 300, 812, 2);
		bookreturn_panel.add(separator);
		
		JLabel return_bookname_lbl = new JLabel("BOOK NAME           : ");
		return_bookname_lbl.setBounds(25, 66, 110, 30);
		bookreturn_panel.add(return_bookname_lbl);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		separator_9.setBounds(5, 407, 812, 2);
		bookreturn_panel.add(separator_9);
		
		JLabel return_author_lbl = new JLabel("AUTHOR                  : ");
		return_author_lbl.setBounds(25, 106, 110, 30);
		bookreturn_panel.add(return_author_lbl);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(414, 11, 2, 398);
		bookreturn_panel.add(separator_10);
		
		JLabel return_category_lbl = new JLabel("CATEGORY             : ");
		return_category_lbl.setBounds(25, 146, 110, 30);
		bookreturn_panel.add(return_category_lbl);
		
		JLabel return_edition_lbl = new JLabel("EDITION                   : ");
		return_edition_lbl.setBounds(25, 186, 110, 30);
		bookreturn_panel.add(return_edition_lbl);
		
		JLabel return_publications_lbl = new JLabel("PUBLICATIONS      : ");
		return_publications_lbl.setBounds(25, 226, 110, 30);
		bookreturn_panel.add(return_publications_lbl);
		
		JLabel return_publishedyear_lbl = new JLabel("PUBLISHED YEAR  : ");
		return_publishedyear_lbl.setBounds(25, 266, 110, 30);
		bookreturn_panel.add(return_publishedyear_lbl);
		
		return_category_lbl2 = new JLabel("");
		return_category_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_category_lbl2.setBounds(145, 146, 259, 30);
		bookreturn_panel.add(return_category_lbl2);
		
		return_author_lbl2 = new JLabel("");
		return_author_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_author_lbl2.setBounds(145, 106, 259, 30);
		bookreturn_panel.add(return_author_lbl2);
		
		return_bookname_lbl2 = new JLabel("");
		return_bookname_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_bookname_lbl2.setBounds(145, 66, 259, 30);
		bookreturn_panel.add(return_bookname_lbl2);
		
		return_edition_lbl2 = new JLabel("");
		return_edition_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_edition_lbl2.setBounds(145, 186, 259, 30);
		bookreturn_panel.add(return_edition_lbl2);
		
		return_publications_lbl2 = new JLabel("");
		return_publications_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_publications_lbl2.setBounds(145, 226, 259, 30);
		bookreturn_panel.add(return_publications_lbl2);
		
		return_publishedyear_lbl2 = new JLabel("");
		return_publishedyear_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_publishedyear_lbl2.setBounds(145, 266, 259, 30);
		bookreturn_panel.add(return_publishedyear_lbl2);
		
		JLabel return_issuedate_lbl = new JLabel("DATE OF ISSUE : ");
		return_issuedate_lbl.setBounds(25, 313, 110, 30);
		bookreturn_panel.add(return_issuedate_lbl);
		
		JLabel return_duedate_lbl = new JLabel("DUE DATE : ");
		return_duedate_lbl.setBounds(25, 354, 110, 30);
		bookreturn_panel.add(return_duedate_lbl);
		
		JLabel return_returndate_lbl = new JLabel("RETURN DATE : ");
		return_returndate_lbl.setBounds(440, 313, 110, 30);
		bookreturn_panel.add(return_returndate_lbl);
		
		JLabel return_fine_lbl = new JLabel("FINE : ");
		return_fine_lbl.setBounds(440, 354, 110, 30);
		bookreturn_panel.add(return_fine_lbl);
		
		return_duedate_tf = new JTextField();
		return_duedate_tf.setEditable(false);
		return_duedate_tf.setColumns(10);
		return_duedate_tf.setBounds(145, 354, 120, 30);
		bookreturn_panel.add(return_duedate_tf);
		
		JLabel return_userid_lbl = new JLabel("USER ID                  : ");
		return_userid_lbl.setBounds(440, 26, 110, 30);
		bookreturn_panel.add(return_userid_lbl);
		
		JLabel return_name_lbl = new JLabel("NAME                      : ");
		return_name_lbl.setBounds(440, 66, 110, 30);
		bookreturn_panel.add(return_name_lbl);
		
		JLabel return_dob_lbl = new JLabel("DATE OF BIRTH     : ");
		return_dob_lbl.setBounds(440, 106, 110, 30);
		bookreturn_panel.add(return_dob_lbl);
		
		JLabel return_contact_lbl = new JLabel("CONTACT               : ");
		return_contact_lbl.setBounds(440, 146, 110, 30);
		bookreturn_panel.add(return_contact_lbl);
		
		JLabel return_email_lbl = new JLabel("EMAIL ID                 : ");
		return_email_lbl.setBounds(440, 186, 110, 30);
		bookreturn_panel.add(return_email_lbl);
		
		return_name_lbl2 = new JLabel("");
		return_name_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_name_lbl2.setBounds(560, 66, 259, 30);
		bookreturn_panel.add(return_name_lbl2);
		
		return_dob_lbl2 = new JLabel("");
		return_dob_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_dob_lbl2.setBounds(560, 106, 259, 30);
		bookreturn_panel.add(return_dob_lbl2);
		
		return_contact_lbl2 = new JLabel("");
		return_contact_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_contact_lbl2.setBounds(560, 146, 259, 30);
		bookreturn_panel.add(return_contact_lbl2);
		
		return_email_lbl2 = new JLabel("");
		return_email_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_email_lbl2.setBounds(560, 186, 259, 30);
		bookreturn_panel.add(return_email_lbl2);
		
		return_userid_lbl2 = new JLabel("");
		return_userid_lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		return_userid_lbl2.setBounds(560, 26, 145, 30);
		bookreturn_panel.add(return_userid_lbl2);
		
		JPanel newbook_panel = new JPanel();
		newbook_panel.setLayout(null);
		newbook_panel.setBorder(new TitledBorder(null, "New Book", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		admin_layeredpane.add(newbook_panel);
		
		JLabel nob_lbl = new JLabel("NO. OF BOOKS          : ");
		nob_lbl.setBounds(25, 40, 134, 40);
		newbook_panel.add(nob_lbl);
		
		JLabel booksdate_lbl = new JLabel("DATE OF ARRIVAL   : ");
		booksdate_lbl.setBounds(25, 100, 134, 40);
		newbook_panel.add(booksdate_lbl);
		
		JLabel bookname_lbl = new JLabel("BOOK NAME              : ");
		bookname_lbl.setBounds(25, 160, 134, 40);
		newbook_panel.add(bookname_lbl);
		
		JLabel author_lbl = new JLabel("AUTHOR'S NAME     : ");
		author_lbl.setBounds(25, 220, 134, 40);
		newbook_panel.add(author_lbl);
		
		JLabel category_lbl = new JLabel("CATEGORY                 : ");
		category_lbl.setBounds(25, 280, 134, 40);
		newbook_panel.add(category_lbl);
		
		JLabel editon_lbl = new JLabel("EDITION                        : ");
		editon_lbl.setBounds(25, 340, 134, 40);
		newbook_panel.add(editon_lbl);
		
		JLabel isbn_lbl = new JLabel("ISBN                          : ");
		isbn_lbl.setBounds(470, 40, 120, 40);
		newbook_panel.add(isbn_lbl);
		
		JLabel publications_lbl = new JLabel("PUBLICATIONS      : ");
		publications_lbl.setBounds(470, 100, 120, 40);
		newbook_panel.add(publications_lbl);
		
		JLabel publishedyear_lbl = new JLabel("PUBLISHED YEAR  : ");
		publishedyear_lbl.setBounds(470, 160, 120, 40);
		newbook_panel.add(publishedyear_lbl);
		
		nob_tf = new JTextField();
		nob_tf.setBounds(169, 45, 90, 30);
		nob_tf.setColumns(10);
		onlyNumerics(nob_tf);
		newbook_panel.add(nob_tf);
		
		booksdate_tf = new JTextField();
		booksdate_tf.setBounds(169, 105, 120, 30);
		booksdate_tf.setColumns(10);
		booksdate_tf.setText(dateformat1.format(date));
		newbook_panel.add(booksdate_tf);
		checkDate(booksdate_tf);
		
		bookname_tf = new JTextField();
		bookname_tf.setBounds(169, 165, 264, 30);
		bookname_tf.setColumns(10);
		newbook_panel.add(bookname_tf);
		
		author_tf = new JTextField();
		author_tf.setBounds(169, 225, 264, 30);
		author_tf.setColumns(10);
		toCapital(author_tf);
		newbook_panel.add(author_tf);
		
		category_tf = new JTextField();
		category_tf.setBounds(169, 285, 264, 30);
		category_tf.setColumns(10);
		toCapital(category_tf);
		newbook_panel.add(category_tf);
		
		edition_tf = new JTextField();
		edition_tf.setBounds(169, 345, 264, 30);
		edition_tf.setColumns(10);
		toCapital(edition_tf);
		newbook_panel.add(edition_tf);
		
		isbn_tf = new JTextField();
		isbn_tf.setBounds(600, 45, 210, 30);
		newbook_panel.add(isbn_tf);
		isbn_tf.setColumns(10);
		onlyNumerics(isbn_tf);
		
		publications_tf = new JTextField();
		publications_tf.setBounds(600, 105, 210, 30);
		publications_tf.setColumns(10);
		toCapital(publications_tf);
		newbook_panel.add(publications_tf);
		
		publishedyear_tf = new JTextField();
		publishedyear_tf.setBounds(600, 165, 120, 30);
		publishedyear_tf.setColumns(10);
		checkYear(publishedyear_tf);
		newbook_panel.add(publishedyear_tf);
		
		JButton newbook_addbook_btn = new JButton("ADD BOOKS");
		newbook_addbook_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int nob;
				
				if(nob_tf.getText().equals(""))
				{
					nob = 0;
				}
				else
				{
					nob = Integer.parseInt(nob_tf.getText());
				}
				
				if(nob == 0)
				{
					JOptionPane.showMessageDialog(null,"Please Enter valid data");
				}
				else
				{
					String s1 = (Integer.parseInt(bookid) + 1) + "";
					String s2 = booksdate_tf.getText();
					String s3 = bookname_tf.getText();
					String s4 = author_tf.getText();
					String s5 = category_tf.getText();
					String s6 = edition_tf.getText();
					String s7 = isbn_tf.getText();
					String s8 = publications_tf.getText();
					String s9 = publishedyear_tf.getText();
					
					if(s2.equals("") || s3.equals("")  || s4.equals("") || s5.equals("") || s6.equals("") || s7.equals("") || s8.equals("") || s9.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Enter valid data");
					}
					else
					{
						readFile();
						nob_tf.setText("");
						bookname_tf.setText("");
						author_tf.setText("");
						category_tf.setText("");
						edition_tf.setText("");
						isbn_tf.setText("");
						publications_tf.setText("");
						publishedyear_tf.setText("");
						
						new_book_model.setRowCount(0);
						new NewBookThread(new_book_model, nob,s1,s2,s3,s4,s5,s6,s7,s8,s9);
						
						createFile();
						bookid = (Integer.parseInt(bookid) + nob)+ "";
						addRecords();
						closeFile();
					}
				}
			}
		});
		newbook_addbook_btn.setBounds(219, 406, 145, 40);
		newbook_panel.add(newbook_addbook_btn);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nob_tf.setText("");
				bookname_tf.setText("");
				author_tf.setText("");
				category_tf.setText("");
				edition_tf.setText("");
				isbn_tf.setText("");
				publications_tf.setText("");
				publishedyear_tf.setText("");
			}
		});
		btnReset.setBounds(400, 406, 145, 40);
		newbook_panel.add(btnReset);
		
		JPanel newuser_panel = new JPanel();
		admin_layeredpane.add(newuser_panel);
		newuser_panel.setLayout(null);
		newuser_panel.setBorder(new TitledBorder(null, "New User", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel newuser_date_lbl = new JLabel("DATE                        : ");
		newuser_date_lbl.setBounds(25, 100, 134, 40);
		newuser_panel.add(newuser_date_lbl);
		
		JLabel fname_lbl = new JLabel("FIRST NAME           : ");
		fname_lbl.setBounds(25, 160, 134, 40);
		newuser_panel.add(fname_lbl);
		
		JLabel mname_lbl = new JLabel("MIDDLE NAME       : ");
		mname_lbl.setBounds(25, 220, 134, 40);
		newuser_panel.add(mname_lbl);
		
		JLabel lname_lbl = new JLabel("LAST NAME             : ");
		lname_lbl.setBounds(25, 280, 134, 40);
		newuser_panel.add(lname_lbl);
		
		JLabel dob_lbl = new JLabel("DATE OF BIRTH       : ");
		dob_lbl.setBounds(416, 40, 134, 40);
		newuser_panel.add(dob_lbl);
		
		JLabel address_lbl = new JLabel("RESIDENCE              : ");
		address_lbl.setBounds(416, 220, 134, 40);
		newuser_panel.add(address_lbl);
		
		JLabel phone_lbl = new JLabel("CONTACT                  : ");
		phone_lbl.setBounds(416, 100, 134, 40);
		newuser_panel.add(phone_lbl);
		
		JLabel emailid_lbl = new JLabel("EMAIL ID                    : ");
		emailid_lbl.setBounds(416, 160, 134, 40);
		newuser_panel.add(emailid_lbl);
		
		JLabel userid_lbl = new JLabel("USER ID                   : ");
		userid_lbl.setBounds(25, 40, 134, 40);
		newuser_panel.add(userid_lbl);
		
		userid_tf = new JTextField();
		userid_tf.setColumns(10);
		userid_tf.setBounds(169, 50, 90, 30);
		newuser_panel.add(userid_tf);
		userid_tf.setEditable(false);
		
		newuser_date_tf = new JTextField();
		newuser_date_tf.setColumns(10);
		newuser_date_tf.setBounds(169, 105, 120, 30);
		newuser_panel.add(newuser_date_tf);
		newuser_date_tf.setText(dateformat1.format(date));
		checkDate(newuser_date_tf);
		
		fname_tf = new JTextField();
		fname_tf.setColumns(10);
		fname_tf.setBounds(169, 165, 220, 30);
		toCapital(fname_tf);
		newuser_panel.add(fname_tf);
		
		mname_tf = new JTextField();
		mname_tf.setColumns(10);
		mname_tf.setBounds(169, 225, 220, 30);
		toCapital(mname_tf);
		newuser_panel.add(mname_tf);
		
		lname_tf = new JTextField();
		lname_tf.setColumns(10);
		lname_tf.setBounds(169, 285, 220, 30);
		toCapital(lname_tf);
		newuser_panel.add(lname_tf);
		
		dob_tf = new JTextField();
		dob_tf.setColumns(10);
		dob_tf.setBounds(553, 45, 120, 30);
		newuser_panel.add(dob_tf);
		checkDate(dob_tf);
		
		phone_tf = new JTextField();
		phone_tf.setColumns(10);
		phone_tf.setBounds(553, 105, 220, 30);
		onlyNumerics(phone_tf);
		newuser_panel.add(phone_tf);
		
		emailid_tf = new JTextField();
		emailid_tf.setColumns(10);
		emailid_tf.setBounds(553, 165, 220, 30);
		newuser_panel.add(emailid_tf);
		
		JTextArea address_tf = new JTextArea();
		address_tf.setBounds(553, 228, 250, 92);
		newuser_panel.add(address_tf);
		
		JButton newuser_addbtn = new JButton("ADD USER");
		newuser_addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s3;
				String s1 = userid_tf.getText();
				String s2 = newuser_date_tf.getText();
				if(mname_tf.getText().equals(""))
				{
					s3 = fname_tf.getText() + " " + mname_tf.getText() + " " + lname_tf.getText();
				}
				else
				{
					s3 = fname_tf.getText() + " " + lname_tf.getText();
				}
				
				String s4 = dob_tf.getText();
				String s5 = phone_tf.getText();
				String s6 = emailid_tf.getText();
				String s7 = address_tf.getText();
				
				if(s1.equals("") || s2.equals("") || s3.equals("")  || s4.equals("") || s5.equals("") || s6.equals("") || s7.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter valid data");
				}
				else
				{
					readFile();
					fname_tf.setText("");
					mname_tf.setText("");
					lname_tf.setText("");
					dob_tf.setText("");
					phone_tf.setText("");
					emailid_tf.setText("");
					address_tf.setText("");
					
					createFile();
					userid = (Integer.parseInt(userid) + 1)+ "";
					addRecords();
					closeFile();
					userid_tf.setText((Integer.parseInt(userid)+1) + "");
					new_user_model.setRowCount(0);
					new NewUserThread(new_user_model,s1,s2,s3,s4,s5,s6,s7);
				}
			}
		});
		newuser_addbtn.setBounds(219, 406, 145, 40);
		newuser_panel.add(newuser_addbtn);
		
		JButton newuser_reset_btn = new JButton("RESET");
		newuser_reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname_tf.setText("");
				mname_tf.setText("");
				lname_tf.setText("");
				dob_tf.setText("");
				phone_tf.setText("");
				emailid_tf.setText("");
				address_tf.setText("");
			}
		});
		newuser_reset_btn.setBounds(400, 406, 145, 40);
		newuser_panel.add(newuser_reset_btn);
		
		JPanel books_data_panel = new JPanel();
		books_data_panel.setLayout(null);
		main_layeredpane.add(books_data_panel);
		
		JScrollPane books_data_scroll = new JScrollPane();
		books_data_scroll.setBounds(0, 0, 1410, 612);
		books_data_scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		books_data_scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		books_data_panel.add(books_data_scroll);
		
		books_data_table = new JTable(books_data_model);
		
		books_data_table.getColumnModel().getColumn(0).setPreferredWidth(0);
		books_data_table.getColumnModel().getColumn(1).setPreferredWidth(30);
		books_data_table.getColumnModel().getColumn(2).setPreferredWidth(280);
		books_data_table.getColumnModel().getColumn(3).setPreferredWidth(120);
		books_data_table.getColumnModel().getColumn(4).setPreferredWidth(45);
		books_data_table.getColumnModel().getColumn(5).setPreferredWidth(30);
		books_data_table.getColumnModel().getColumn(6).setPreferredWidth(50);
		books_data_table.getColumnModel().getColumn(7).setPreferredWidth(150);
		books_data_table.getColumnModel().getColumn(8).setPreferredWidth(30);
		
		books_data_scroll.setViewportView(books_data_table);
		
		JPanel user_data_panel = new JPanel();
		user_data_panel.setLayout(null);
		main_layeredpane.add(user_data_panel);
		
		JScrollPane user_data_scroll = new JScrollPane();
		user_data_scroll.setBounds(0, 0, 1410, 612);
		user_data_scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		user_data_scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		user_data_panel.add(user_data_scroll);
		
		user_data_table = new JTable(user_data_model);
		user_data_scroll.setViewportView(user_data_table);
		user_data_table.getColumnModel().getColumn(0).setPreferredWidth(0);
		user_data_table.getColumnModel().getColumn(1).setPreferredWidth(160);
		user_data_table.getColumnModel().getColumn(2).setPreferredWidth(40);
		user_data_table.getColumnModel().getColumn(3).setPreferredWidth(30);
		user_data_table.getColumnModel().getColumn(4).setPreferredWidth(150);
		user_data_table.getColumnModel().getColumn(5).setPreferredWidth(500);
		user_data_table.getColumnModel().getColumn(6).setPreferredWidth(60);
		
		JPanel issuedbooks_data_panel = new JPanel();
		issuedbooks_data_panel.setLayout(null);
		main_layeredpane.add(issuedbooks_data_panel, "name_606655142426100");
		
		JScrollPane issuedbooks_data_scroll = new JScrollPane();
		issuedbooks_data_scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		issuedbooks_data_scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		issuedbooks_data_scroll.setBounds(0, 0, 1410, 612);
		issuedbooks_data_panel.add(issuedbooks_data_scroll);
		
		booksissued_data_table = new JTable(books_issued_info_model);
		issuedbooks_data_scroll.setViewportView(booksissued_data_table);
		booksissued_data_table.getColumnModel().getColumn(0).setPreferredWidth(30);
		booksissued_data_table.getColumnModel().getColumn(1).setPreferredWidth(330);
		booksissued_data_table.getColumnModel().getColumn(2).setPreferredWidth(30);
		booksissued_data_table.getColumnModel().getColumn(3).setPreferredWidth(230);
		booksissued_data_table.getColumnModel().getColumn(4).setPreferredWidth(80);
		booksissued_data_table.getColumnModel().getColumn(5).setPreferredWidth(150);
		booksissued_data_table.getColumnModel().getColumn(6).setPreferredWidth(60);
		booksissued_data_table.getColumnModel().getColumn(7).setPreferredWidth(60);
		
		JPanel returnbooks_data_panel = new JPanel();
		returnbooks_data_panel.setLayout(null);
		main_layeredpane.add(returnbooks_data_panel, "name_48112877452400");
		
		JScrollPane returnbooks_data_scroll = new JScrollPane();
		returnbooks_data_scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		returnbooks_data_scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		returnbooks_data_scroll.setBounds(0, 0, 1410, 612);
		returnbooks_data_panel.add(returnbooks_data_scroll);
		
		returnbooks_data_table = new JTable(book_return_info_model);
		returnbooks_data_scroll.setViewportView(returnbooks_data_table);
		returnbooks_data_table.getColumnModel().getColumn(0).setPreferredWidth(30);
		returnbooks_data_table.getColumnModel().getColumn(1).setPreferredWidth(330);
		returnbooks_data_table.getColumnModel().getColumn(2).setPreferredWidth(30);
		returnbooks_data_table.getColumnModel().getColumn(3).setPreferredWidth(230);
		returnbooks_data_table.getColumnModel().getColumn(4).setPreferredWidth(80);
		returnbooks_data_table.getColumnModel().getColumn(5).setPreferredWidth(150);
		returnbooks_data_table.getColumnModel().getColumn(6).setPreferredWidth(60);
		returnbooks_data_table.getColumnModel().getColumn(7).setPreferredWidth(60);
		
		JPanel searchbook_panel = new JPanel();
		searchbook_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		searchbook_panel.setLayout(null);
		main_layeredpane.add(searchbook_panel);
		
		JPanel searchbook_elements = new JPanel();
		searchbook_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		searchbook_elements.setLayout(null);
		searchbook_elements.setBounds(5, 5, 1405, 90);
		searchbook_panel.add(searchbook_elements);
		
		JLabel searchbook_bookid_lbl = new JLabel("Book ID           : ");
		searchbook_bookid_lbl.setBounds(25, 17, 85, 20);
		searchbook_elements.add(searchbook_bookid_lbl);
		
		JLabel searchbook_bookname_lbl = new JLabel("Book Name   : ");
		searchbook_bookname_lbl.setBounds(250, 17, 85, 20);
		searchbook_elements.add(searchbook_bookname_lbl);
		
		JLabel searchbook_isbn_lbl = new JLabel("ISBN                : ");
		searchbook_isbn_lbl.setBounds(25, 56, 85, 20);
		searchbook_elements.add(searchbook_isbn_lbl);
		
		JLabel searchbook_publications_lbl = new JLabel("Publications  : ");
		searchbook_publications_lbl.setBounds(670, 56, 85, 20);
		searchbook_elements.add(searchbook_publications_lbl);
		
		JLabel searchbook_publishedyear_lbl = new JLabel("Published Year     : ");
		searchbook_publishedyear_lbl.setBounds(1010, 17, 110, 20);
		searchbook_elements.add(searchbook_publishedyear_lbl);
		
		JLabel searchbook_category_lbl = new JLabel("Category       : ");
		searchbook_category_lbl.setBounds(670, 17, 85, 20);
		searchbook_elements.add(searchbook_category_lbl);
		
		JLabel searchbook_author_lbl = new JLabel("Author             : ");
		searchbook_author_lbl.setBounds(250, 56, 85, 20);
		searchbook_elements.add(searchbook_author_lbl);
		
		JButton book_search_btn = new JButton("SEARCH");
		book_search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = searchbook_bookid_tf.getText();					//BOOKID
				String s2 = searchbook_isbn_tf.getText();					//ISBN
				String s3 = searchbook_bookname_tf.getText();				//BOOK NAME
				String s4 = searchbook_author_tf.getText();					//AUTHOR
				String s5 = searchbook_category_tf.getText();				//CATEGORY
				String s6 = searchbook_publications_tf.getText();			//PUBLICATIONS
				String s7 = searchbook_publishedyear_tf.getText();			//PUBLISHED YEAR
				
				books_data_model.setRowCount(0);
				new BooksSearchThread(database, books_data_model,s1,s2,s3,s4,s5,s6,s7);
			}
		});
		book_search_btn.setBounds(1010, 55, 247, 23);
		searchbook_elements.add(book_search_btn);
		
		searchbook_bookid_tf = new JTextField();
		searchbook_bookid_tf.setBounds(120, 17, 120, 20);
		searchbook_elements.add(searchbook_bookid_tf);
		searchbook_bookid_tf.setColumns(10);
		onlyNumerics(searchbook_bookid_tf);
		
		searchbook_isbn_tf = new JTextField();
		searchbook_isbn_tf.setBounds(120, 56, 120, 20);
		searchbook_elements.add(searchbook_isbn_tf);
		searchbook_isbn_tf.setColumns(10);
		onlyNumerics(searchbook_isbn_tf);
		
		searchbook_bookname_tf = new JTextField();
		searchbook_bookname_tf.setBounds(345, 17, 315, 20);
		searchbook_elements.add(searchbook_bookname_tf);
		searchbook_bookname_tf.setColumns(10);
		
		searchbook_author_tf = new JTextField();
		searchbook_author_tf.setBounds(345, 56, 315, 20);
		searchbook_elements.add(searchbook_author_tf);
		searchbook_author_tf.setColumns(10);
		
		searchbook_category_tf = new JTextField();
		searchbook_category_tf.setBounds(765, 17, 235, 20);
		searchbook_elements.add(searchbook_category_tf);
		searchbook_category_tf.setColumns(10);
		
		searchbook_publications_tf = new JTextField();
		searchbook_publications_tf.setBounds(765, 56, 235, 20);
		searchbook_elements.add(searchbook_publications_tf);
		searchbook_publications_tf.setColumns(10);
		
		searchbook_publishedyear_tf = new JTextField();
		searchbook_publishedyear_tf.setBounds(1130, 17, 127, 20);
		searchbook_elements.add(searchbook_publishedyear_tf);
		onlyNumerics(searchbook_publishedyear_tf);
		checkYear(searchbook_publishedyear_tf);
		searchbook_publishedyear_tf.setColumns(10);
		
		JPanel searchbook_pane = new JPanel();
		searchbook_pane.setBounds(5, 100, 1405, 522);
		searchbook_pane.setLayout(null);
		searchbook_panel.add(searchbook_pane);
		
		JScrollPane searchbook_scrollpane = new JScrollPane();
		searchbook_scrollpane.setBounds(0, 0, 1405, 511);
		searchbook_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		searchbook_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		searchbook_pane.add(searchbook_scrollpane);
		
		books_search_table = new JTable(books_data_model);
		
		books_search_table.getColumnModel().getColumn(0).setPreferredWidth(0);
		books_search_table.getColumnModel().getColumn(1).setPreferredWidth(30);
		books_search_table.getColumnModel().getColumn(2).setPreferredWidth(280);
		books_search_table.getColumnModel().getColumn(3).setPreferredWidth(120);
		books_search_table.getColumnModel().getColumn(4).setPreferredWidth(45);
		books_search_table.getColumnModel().getColumn(5).setPreferredWidth(30);
		books_search_table.getColumnModel().getColumn(6).setPreferredWidth(50);
		books_search_table.getColumnModel().getColumn(7).setPreferredWidth(150);
		books_search_table.getColumnModel().getColumn(8).setPreferredWidth(30);
		
		searchbook_scrollpane.setViewportView(books_search_table);
		
		JPanel searchuser_panel = new JPanel();
		searchuser_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		searchuser_panel.setLayout(null);
		main_layeredpane.add(searchuser_panel);
		
		JPanel searchuser_elements = new JPanel();
		searchuser_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		searchuser_elements.setLayout(null);
		searchuser_elements.setBounds(5, 5, 1405, 90);
		searchuser_panel.add(searchuser_elements);
		
		JLabel searchuser_userid_lbl = new JLabel("User ID           : ");
		searchuser_userid_lbl.setBounds(25, 17, 85, 20);
		searchuser_elements.add(searchuser_userid_lbl);
		
		JLabel searchuser_name_lbl = new JLabel("Name         : ");
		searchuser_name_lbl.setBounds(250, 17, 85, 20);
		searchuser_elements.add(searchuser_name_lbl);
		
		JLabel searchuser_dob_lbl = new JLabel("Date of Birth  : ");
		searchuser_dob_lbl.setBounds(25, 56, 85, 20);
		searchuser_elements.add(searchuser_dob_lbl);
		
		JLabel searchuser_email_lbl = new JLabel("Email ID       : ");
		searchuser_email_lbl.setBounds(250, 56, 85, 20);
		searchuser_elements.add(searchuser_email_lbl);
		
		JLabel searchuser_registrationdate_lbl = new JLabel("Date of Registration : ");
		searchuser_registrationdate_lbl.setBounds(594, 17, 130, 20);
		searchuser_elements.add(searchuser_registrationdate_lbl);
		
		JLabel searchuser_contact_lbl = new JLabel("Contact       : ");
		searchuser_contact_lbl.setBounds(594, 56, 85, 20);
		searchuser_elements.add(searchuser_contact_lbl);
		
		JLabel searchuser_lastname_lbl = new JLabel("Residence   : ");
		searchuser_lastname_lbl.setBounds(855, 17, 85, 20);
		searchuser_elements.add(searchuser_lastname_lbl);
		
		searchuser_userid_tf = new JTextField();
		searchuser_userid_tf.setBounds(116, 17, 124, 20);
		searchuser_userid_tf.setColumns(10);
		onlyNumerics(searchuser_userid_tf);
		searchuser_elements.add(searchuser_userid_tf);
		
		searchuser_dob_tf = new JTextField();
		searchuser_dob_tf.setColumns(10);
		searchuser_dob_tf.setBounds(116, 56, 124, 20);
		searchuser_elements.add(searchuser_dob_tf);
		checkDate(searchuser_dob_tf);
		
		searchuser_name_tf = new JTextField();
		searchuser_name_tf.setColumns(10);
		searchuser_name_tf.setBounds(341, 17, 243, 20);
		searchuser_elements.add(searchuser_name_tf);
		
		searchuser_contact_tf = new JTextField();
		searchuser_contact_tf.setColumns(10);
		searchuser_contact_tf.setBounds(689, 56, 156, 20);
		onlyNumerics(searchuser_contact_tf);
		searchuser_elements.add(searchuser_contact_tf);
		
		searchuser_email_tf = new JTextField();
		searchuser_email_tf.setColumns(10);
		searchuser_email_tf.setBounds(341, 56, 243, 20);
		searchuser_elements.add(searchuser_email_tf);
		
		JButton user_search_btn = new JButton("SEARCH");
		user_search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = searchuser_userid_tf.getText();					//USER ID
				String s2 = searchuser_dob_tf.getText();					//DOB
				String s3 = searchuser_name_tf.getText();					//NAME
				String s4 = searchuser_residence_tf.getText();				//RESIDENCE
				String s5 = searchuser_contact_tf.getText();				//CONTACT
				String s6 = searchuser_email_tf.getText();					//EMAIL ID
				String s7 = searchuser_registrationdate_tf.getText();		//DATE OF REGISTARTION
				
				user_data_model.setRowCount(0);
				new UserSearchThread(database, user_data_model,s1,s2,s3,s4,s5,s6,s7);
			}
		});
		user_search_btn.setBounds(1274, 38, 117, 23);
		searchuser_elements.add(user_search_btn);
		
		searchuser_registrationdate_tf = new JTextField();
		searchuser_registrationdate_tf.setColumns(10);
		searchuser_registrationdate_tf.setBounds(719, 17, 126, 20);
		searchuser_elements.add(searchuser_registrationdate_tf);
		checkDate(searchuser_registrationdate_tf);
		
		searchuser_residence_tf = new JTextArea();
		searchuser_residence_tf.setBounds(944, 15, 320, 61);
		searchuser_elements.add(searchuser_residence_tf);
		
		JPanel searchuser_pane = new JPanel();
		searchuser_pane.setBounds(5, 100, 1405, 522);
		searchuser_pane.setLayout(null);
		searchuser_panel.add(searchuser_pane);
		
		JScrollPane searchuser_scrollpane = new JScrollPane();
		searchuser_scrollpane.setBounds(0, 0, 1405, 511);
		searchuser_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		searchuser_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		searchuser_pane.add(searchuser_scrollpane);
		
		user_search_table = new JTable(user_data_model);
		
		user_search_table = new JTable(user_data_model);
		user_search_table.getColumnModel().getColumn(0).setPreferredWidth(0);
		user_search_table.getColumnModel().getColumn(1).setPreferredWidth(160);
		user_search_table.getColumnModel().getColumn(2).setPreferredWidth(40);
		user_search_table.getColumnModel().getColumn(3).setPreferredWidth(30);
		user_search_table.getColumnModel().getColumn(4).setPreferredWidth(150);
		user_search_table.getColumnModel().getColumn(5).setPreferredWidth(500);
		user_search_table.getColumnModel().getColumn(6).setPreferredWidth(60);
		
		searchuser_scrollpane.setViewportView(user_search_table);
		
		JPanel searchauthor_panel = new JPanel();
		searchauthor_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		searchauthor_panel.setLayout(null);
		main_layeredpane.add(searchauthor_panel);
		
		JPanel searchauthor_elements = new JPanel();
		searchauthor_elements.setBounds(5, 5, 1405, 55);
		searchauthor_elements.setLayout(null);
		searchauthor_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		searchauthor_panel.add(searchauthor_elements);
		
		JLabel searchauthor_bookid_lbl = new JLabel("Book ID         : ");
		searchauthor_bookid_lbl.setBounds(25, 17, 85, 20);
		searchauthor_elements.add(searchauthor_bookid_lbl);
		
		JLabel searchauthor_bookname_lbl = new JLabel("Book Name   : ");
		searchauthor_bookname_lbl.setBounds(240, 17, 85, 20);
		searchauthor_elements.add(searchauthor_bookname_lbl);
		
		JLabel searchauthor_author_lbl = new JLabel("Author Name      :");
		searchauthor_author_lbl.setBounds(660, 17, 110, 20);
		searchauthor_elements.add(searchauthor_author_lbl);
		
		JButton searchauthor_search_btn = new JButton("SEARCH");
		searchauthor_search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search_author_model.setRowCount(0);
				String s1 = searchauthor_bookid_tf.getText();
				String s2 = searchauthor_bookname_tf.getText();
				String s3 = searchauthor_author_tf.getText();
				new SearchAuthorThread(database, search_author_model, s1, s2, s3);
			}
		});
		searchauthor_search_btn.setBounds(1125, 16, 247, 23);
		searchauthor_elements.add(searchauthor_search_btn);
		
		searchauthor_bookid_tf = new JTextField();
		searchauthor_bookid_tf.setColumns(10);
		searchauthor_bookid_tf.setBounds(120, 17, 110, 20);
		onlyNumerics(searchauthor_bookid_tf);
		searchauthor_elements.add(searchauthor_bookid_tf);
		
		searchauthor_bookname_tf = new JTextField();
		searchauthor_bookname_tf.setColumns(10);
		searchauthor_bookname_tf.setBounds(335, 17, 315, 20);
		searchauthor_elements.add(searchauthor_bookname_tf);
		
		searchauthor_author_tf = new JTextField();
		searchauthor_author_tf.setColumns(10);
		searchauthor_author_tf.setBounds(780, 17, 315, 20);
		searchauthor_elements.add(searchauthor_author_tf);
		
		JPanel searchauthor_pane = new JPanel();
		searchauthor_pane.setLayout(null);
		searchauthor_pane.setBounds(5, 65, 1405, 547);
		searchauthor_panel.add(searchauthor_pane);
		
		JScrollPane search_author_scrollpane = new JScrollPane();
		search_author_scrollpane.setBounds(0, 0, 1405, 547);
		searchauthor_pane.add(search_author_scrollpane);
		search_author_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		search_author_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		author_search_table = new JTable(search_author_model);
		
		author_search_table.getColumnModel().getColumn(0).setPreferredWidth(0);
		author_search_table.getColumnModel().getColumn(1).setPreferredWidth(800);
		author_search_table.getColumnModel().getColumn(2).setPreferredWidth(200);
		
		search_author_scrollpane.setViewportView(author_search_table);
		
		JPanel updatebook_panel = new JPanel();
		updatebook_panel.setLayout(null);
		updatebook_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		main_layeredpane.add(updatebook_panel);
		
		JPanel updatebook_search_elements = new JPanel();
		updatebook_search_elements.setLayout(null);
		updatebook_search_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		updatebook_search_elements.setBounds(5, 5, 1405, 90);
		updatebook_panel.add(updatebook_search_elements);
		
		JLabel updatebook_search_bookid_lbl = new JLabel("Book ID           : ");
		updatebook_search_bookid_lbl.setBounds(25, 17, 85, 20);
		updatebook_search_elements.add(updatebook_search_bookid_lbl);
		
		JLabel updatebook_search_bookname_lbl = new JLabel("Book Name   : ");
		updatebook_search_bookname_lbl.setBounds(250, 17, 85, 20);
		updatebook_search_elements.add(updatebook_search_bookname_lbl);
		
		JLabel updatebook_search_isbn_lbl = new JLabel("ISBN                : ");
		updatebook_search_isbn_lbl.setBounds(25, 56, 85, 20);
		updatebook_search_elements.add(updatebook_search_isbn_lbl);
		
		JLabel updatebook_search_publications_lbl = new JLabel("Publications  : ");
		updatebook_search_publications_lbl.setBounds(670, 56, 85, 20);
		updatebook_search_elements.add(updatebook_search_publications_lbl);
		
		JLabel updatebook_search_publishedyear_lbl = new JLabel("Published Year     : ");
		updatebook_search_publishedyear_lbl.setBounds(1010, 17, 110, 20);
		updatebook_search_elements.add(updatebook_search_publishedyear_lbl);
		
		JLabel updatebook_search_category_lbl = new JLabel("Category       : ");
		updatebook_search_category_lbl.setBounds(670, 17, 85, 20);
		updatebook_search_elements.add(updatebook_search_category_lbl);
		
		JLabel updatebook_search_author_lbl = new JLabel("Author             : ");
		updatebook_search_author_lbl.setBounds(250, 56, 85, 20);
		updatebook_search_elements.add(updatebook_search_author_lbl);
		
		JButton updatebook_search_btn = new JButton("SEARCH");
		updatebook_search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = updatebook_search_bookid_tf.getText();				//BOOKID
				String s2 = updatebook_search_isbn_tf.getText();					//ISBN
				String s3 = updatebook_search_bookname_tf.getText();				//BOOK NAME
				String s4 = updatebook_search_author_tf.getText();				//AUTHOR
				String s5 = updatebook_search_category_tf.getText();				//CATEGORY
				String s6 = updatebook_search_publications_tf.getText();			//PUBLICATIONS
				String s7 = updatebook_search_publishedyear_tf.getText();			//PUBLISHED YEAR
				
				books_data_model.setRowCount(0);
				new BooksSearchThread(database, books_data_model,s1,s2,s3,s4,s5,s6,s7);
			}
		});
		updatebook_search_btn.setBounds(1010, 55, 247, 23);
		updatebook_search_elements.add(updatebook_search_btn);
		
		updatebook_search_bookid_tf = new JTextField();
		updatebook_search_bookid_tf.setColumns(10);
		updatebook_search_bookid_tf.setBounds(120, 17, 120, 20);
		updatebook_search_elements.add(updatebook_search_bookid_tf);
		onlyNumerics(updatebook_search_bookid_tf);
		
		updatebook_search_isbn_tf = new JTextField();
		updatebook_search_isbn_tf.setColumns(10);
		updatebook_search_isbn_tf.setBounds(120, 56, 120, 20);
		updatebook_search_elements.add(updatebook_search_isbn_tf);
		onlyNumerics(updatebook_search_isbn_tf);
		
		updatebook_search_bookname_tf = new JTextField();
		updatebook_search_bookname_tf.setColumns(10);
		updatebook_search_bookname_tf.setBounds(345, 17, 315, 20);
		updatebook_search_elements.add(updatebook_search_bookname_tf);
		
		updatebook_search_author_tf = new JTextField();
		updatebook_search_author_tf.setColumns(10);
		updatebook_search_author_tf.setBounds(345, 56, 315, 20);
		updatebook_search_elements.add(updatebook_search_author_tf);
		
		updatebook_search_category_tf = new JTextField();
		updatebook_search_category_tf.setColumns(10);
		updatebook_search_category_tf.setBounds(765, 17, 235, 20);
		updatebook_search_elements.add(updatebook_search_category_tf);
		
		updatebook_search_publications_tf = new JTextField();
		updatebook_search_publications_tf.setColumns(10);
		updatebook_search_publications_tf.setBounds(765, 56, 235, 20);
		updatebook_search_elements.add(updatebook_search_publications_tf);
		
		updatebook_search_publishedyear_tf = new JTextField();
		updatebook_search_publishedyear_tf.setColumns(10);
		updatebook_search_publishedyear_tf.setBounds(1130, 17, 127, 20);
		updatebook_search_elements.add(updatebook_search_publishedyear_tf);
		checkYear(updatebook_search_publishedyear_tf);
		
		JPanel updatebook_update_elements = new JPanel();
		updatebook_update_elements.setLayout(null);
		updatebook_update_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		updatebook_update_elements.setBounds(5, 96, 1405, 90);
		updatebook_panel.add(updatebook_update_elements);
		
		JLabel updatebook_update_bookid_lbl = new JLabel("Book ID           : ");
		updatebook_update_bookid_lbl.setBounds(25, 17, 85, 20);
		updatebook_update_elements.add(updatebook_update_bookid_lbl);
		
		JLabel editbook_edit_bookname_lbl = new JLabel("Book Name   : ");
		editbook_edit_bookname_lbl.setBounds(230, 17, 85, 20);
		updatebook_update_elements.add(editbook_edit_bookname_lbl);
		
		JLabel editbook_edit_isbn_lbl = new JLabel("ISBN                : ");
		editbook_edit_isbn_lbl.setBounds(25, 56, 85, 20);
		updatebook_update_elements.add(editbook_edit_isbn_lbl);
		
		JLabel editbook_edit_publications_lbl = new JLabel("Publications  : ");
		editbook_edit_publications_lbl.setBounds(595, 56, 85, 20);
		updatebook_update_elements.add(editbook_edit_publications_lbl);
		
		JLabel editbook_edit_publishedyear_lbl = new JLabel("Published Year     : ");
		editbook_edit_publishedyear_lbl.setBounds(900, 56, 109, 20);
		updatebook_update_elements.add(editbook_edit_publishedyear_lbl);
		
		JLabel editbook_edit_category_lbl = new JLabel("Category       : ");
		editbook_edit_category_lbl.setBounds(595, 17, 85, 20);
		updatebook_update_elements.add(editbook_edit_category_lbl);
		
		JLabel editbook_edit_author_lbl = new JLabel("Author             : ");
		editbook_edit_author_lbl.setBounds(230, 56, 85, 20);
		updatebook_update_elements.add(editbook_edit_author_lbl);
		
		JButton editbook_update_btn = new JButton("UPDATE");
		editbook_update_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = updatebook_update_bookid_tf.getText();				//EDIT BOOK ID
				String s2 = updatebook_update_isbn_tf.getText();				//EDIT ISBN
				String s3 = updatebook_update_bookname_tf.getText();			//EDIT BOOK NAME
				String s4 = updatebook_update_author_tf.getText();				//EDIT AUTHOR
				String s5 = updatebook_update_category_tf.getText();			//EDIT CATEGORY
				String s6 = updatebook_update_edition_tf.getText();				//EDIT EDITION
				String s7 = updatebook_update_publications_tf.getText();		//EDIT PUBLICATIONS
				String s8 = updatebook_update_publishedyear_tf.getText();		//EDIT PUBLISHED YEAR
				String s9 = updatebook_update_dateofarrival_tf.getText();		//EDIT DATE OF ARRIVAL
				
				String str1 = updatebook_search_bookid_tf.getText();				//SEARCH BOOKID
				String str2 = updatebook_search_isbn_tf.getText();				//SEARCH ISBN
				String str3 = updatebook_search_bookname_tf.getText();			//SEARCH BOOK NAME
				String str4 = updatebook_search_author_tf.getText();				//SEARCH AUTHOR
				String str5 = updatebook_search_category_tf.getText();			//SEARCH CATEGORY
				String str6 = updatebook_search_publications_tf.getText();		//SEARCH PUBLICATIONS
				String str7 = updatebook_search_publishedyear_tf.getText();		//SEARCH PUBLISHED YEAR
				
				new EditBookThread(1, books_data_model, database, s1, s2, s3, s4, s5, s6, s7, s8, s9, str1, str2, str3, str4, str5, str6, str7);
			}
		});
		editbook_update_btn.setBounds(1142, 55, 109, 23);
		updatebook_update_elements.add(editbook_update_btn);
		
		updatebook_update_bookid_tf = new JTextField();
		updatebook_update_bookid_tf.setColumns(10);
		updatebook_update_bookid_tf.setBounds(120, 17, 100, 20);
		updatebook_update_bookid_tf.setEditable(false);
		updatebook_update_elements.add(updatebook_update_bookid_tf);
		
		updatebook_update_isbn_tf = new JTextField();
		updatebook_update_isbn_tf.setColumns(10);
		updatebook_update_isbn_tf.setBounds(120, 56, 100, 20);
		onlyNumerics(updatebook_update_isbn_tf);
		updatebook_update_elements.add(updatebook_update_isbn_tf);
		
		updatebook_update_bookname_tf = new JTextField();
		updatebook_update_bookname_tf.setColumns(10);
		updatebook_update_bookname_tf.setBounds(325, 17, 260, 20);
		updatebook_update_elements.add(updatebook_update_bookname_tf);
		
		updatebook_update_author_tf = new JTextField();
		updatebook_update_author_tf.setColumns(10);
		updatebook_update_author_tf.setBounds(325, 56, 260, 20);
		updatebook_update_elements.add(updatebook_update_author_tf);
		toCapital(updatebook_update_author_tf);
		
		updatebook_update_category_tf = new JTextField();
		updatebook_update_category_tf.setColumns(10);
		updatebook_update_category_tf.setBounds(690, 17, 200, 20);
		updatebook_update_elements.add(updatebook_update_category_tf);
		toCapital(updatebook_update_category_tf);
		
		updatebook_update_publications_tf = new JTextField();
		updatebook_update_publications_tf.setColumns(10);
		updatebook_update_publications_tf.setBounds(690, 56, 200, 20);
		updatebook_update_elements.add(updatebook_update_publications_tf);
		toCapital(updatebook_update_publications_tf);
		
		updatebook_update_publishedyear_tf = new JTextField();
		updatebook_update_publishedyear_tf.setColumns(10);
		updatebook_update_publishedyear_tf.setBounds(1019, 56, 103, 20);
		updatebook_update_elements.add(updatebook_update_publishedyear_tf);
		checkYear(updatebook_update_publishedyear_tf);
		
		JLabel updatebook_update_edition_lbl = new JLabel("Edition        : ");
		updatebook_update_edition_lbl.setBounds(900, 17, 85, 20);
		updatebook_update_elements.add(updatebook_update_edition_lbl);
		
		updatebook_update_edition_tf = new JTextField();
		updatebook_update_edition_tf.setColumns(10);
		updatebook_update_edition_tf.setBounds(995, 17, 103, 20);
		updatebook_update_elements.add(updatebook_update_edition_tf);
		toCapital(updatebook_update_edition_tf);
		
		JLabel updatebook_update_dateofarrival_lbl = new JLabel("Date of Arrival     : ");
		updatebook_update_dateofarrival_lbl.setBounds(1108, 17, 127, 20);
		updatebook_update_elements.add(updatebook_update_dateofarrival_lbl);
		
		updatebook_update_dateofarrival_tf = new JTextField();
		updatebook_update_dateofarrival_tf.setColumns(10);
		updatebook_update_dateofarrival_tf.setBounds(1245, 17, 132, 20);
		updatebook_update_elements.add(updatebook_update_dateofarrival_tf);
		checkDate(updatebook_update_dateofarrival_tf);
		
		JButton updatebook_delete_btn = new JButton("DELETE");
		updatebook_delete_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = updatebook_update_bookid_tf.getText();				//EDIT BOOK ID
				String s2 = updatebook_update_isbn_tf.getText();				//EDIT ISBN
				String s3 = updatebook_update_bookname_tf.getText();			//EDIT BOOK NAME
				String s4 = updatebook_update_author_tf.getText();				//EDIT AUTHOR
				String s5 = updatebook_update_category_tf.getText();			//EDIT CATEGORY
				String s6 = updatebook_update_edition_tf.getText();				//EDIT EDITION
				String s7 = updatebook_update_publications_tf.getText();		//EDIT PUBLICATIONS
				String s8 = updatebook_update_publishedyear_tf.getText();		//EDIT PUBLISHED YEAR
				String s9 = updatebook_update_dateofarrival_tf.getText();		//EDIT DATE OF ARRIVAL
				
				String str1 = updatebook_search_bookid_tf.getText();				//SEARCH BOOKID
				String str2 = updatebook_search_isbn_tf.getText();				//SEARCH ISBN
				String str3 = updatebook_search_bookname_tf.getText();			//SEARCH BOOK NAME
				String str4 = updatebook_search_author_tf.getText();				//SEARCH AUTHOR
				String str5 = updatebook_search_category_tf.getText();			//SEARCH CATEGORY
				String str6 = updatebook_search_publications_tf.getText();		//SEARCH PUBLICATIONS
				String str7 = updatebook_search_publishedyear_tf.getText();		//SEARCH PUBLISHED YEAR
				
				new EditBookThread(2, books_data_model, database, s1, s2, s3, s4, s5, s6, s7, s8, s9, str1, str2, str3, str4, str5, str6, str7);
			}
		});
		updatebook_delete_btn.setBounds(1268, 55, 109, 23);
		updatebook_update_elements.add(updatebook_delete_btn);
		
		JPanel update_book_pane = new JPanel();
		update_book_pane.setLayout(null);
		update_book_pane.setBounds(5, 194, 1405, 425);
		updatebook_panel.add(update_book_pane);
		
		JScrollPane update_book_scrollpane = new JScrollPane();
		update_book_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		update_book_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		update_book_scrollpane.setBounds(0, 0, 1405, 414);
		update_book_pane.add(update_book_scrollpane);
		
		books_update_table = new JTable(books_data_model);
		
		books_data_table.getColumnModel().getColumn(0).setPreferredWidth(0);
		books_data_table.getColumnModel().getColumn(1).setPreferredWidth(30);
		books_data_table.getColumnModel().getColumn(2).setPreferredWidth(280);
		books_data_table.getColumnModel().getColumn(3).setPreferredWidth(120);
		books_data_table.getColumnModel().getColumn(4).setPreferredWidth(45);
		books_data_table.getColumnModel().getColumn(5).setPreferredWidth(30);
		books_data_table.getColumnModel().getColumn(6).setPreferredWidth(50);
		books_data_table.getColumnModel().getColumn(7).setPreferredWidth(150);
		books_data_table.getColumnModel().getColumn(8).setPreferredWidth(30);
		
		books_update_table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String s1 = books_data_model.getValueAt(books_update_table.getSelectedRow(),0).toString();
				String s2 = books_data_model.getValueAt(books_update_table.getSelectedRow(),1).toString();
				String s3 = books_data_model.getValueAt(books_update_table.getSelectedRow(),2).toString();
				String s4 = books_data_model.getValueAt(books_update_table.getSelectedRow(),3).toString();
				String s5 = books_data_model.getValueAt(books_update_table.getSelectedRow(),4).toString();
				String s6 = books_data_model.getValueAt(books_update_table.getSelectedRow(),5).toString();
				String s7 = books_data_model.getValueAt(books_update_table.getSelectedRow(),6).toString();
				String s8 = books_data_model.getValueAt(books_update_table.getSelectedRow(),7).toString();
				String s9 = books_data_model.getValueAt(books_update_table.getSelectedRow(),8).toString();
				
				updatebook_update_bookid_tf.setText(s1);
				updatebook_update_isbn_tf.setText(s7);
				updatebook_update_bookname_tf.setText(s3);
				updatebook_update_author_tf.setText(s4);
				updatebook_update_category_tf.setText(s5);
				updatebook_update_edition_tf.setText(s6);
				updatebook_update_dateofarrival_tf.setText(s2);
				updatebook_update_publications_tf.setText(s8);
				updatebook_update_publishedyear_tf.setText(s9);
			}
		});
		update_book_scrollpane.setViewportView(books_update_table);
		
		JPanel updateuser_panel = new JPanel();
		updateuser_panel.setLayout(null);
		main_layeredpane.add(updateuser_panel);
		
		JPanel updateuser_search_elements = new JPanel();
		updateuser_search_elements.setLayout(null);
		updateuser_search_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		updateuser_search_elements.setBounds(5, 5, 1405, 90);
		updateuser_panel.add(updateuser_search_elements);
		
		JLabel updateuser_search_userid_lbl = new JLabel("User ID           : ");
		updateuser_search_userid_lbl.setBounds(25, 17, 85, 20);
		updateuser_search_elements.add(updateuser_search_userid_lbl);
		
		JLabel updateuser_search_name_lbl = new JLabel("Name         : ");
		updateuser_search_name_lbl.setBounds(250, 17, 85, 20);
		updateuser_search_elements.add(updateuser_search_name_lbl);
		
		JLabel updateuser_search_dob_lbl = new JLabel("Date of Birth  : ");
		updateuser_search_dob_lbl.setBounds(25, 56, 85, 20);
		updateuser_search_elements.add(updateuser_search_dob_lbl);
		
		JLabel updateuser_search_email_lbl = new JLabel("Email ID       : ");
		updateuser_search_email_lbl.setBounds(250, 56, 85, 20);
		updateuser_search_elements.add(updateuser_search_email_lbl);
		
		JLabel updateuser_search_dateofregistration_lbl = new JLabel("Date of Registration : ");
		updateuser_search_dateofregistration_lbl.setBounds(594, 17, 130, 20);
		updateuser_search_elements.add(updateuser_search_dateofregistration_lbl);
		
		JLabel updateuser_search_contact_lbl = new JLabel("Contact       : ");
		updateuser_search_contact_lbl.setBounds(594, 56, 85, 20);
		updateuser_search_elements.add(updateuser_search_contact_lbl);
		
		updateuser_search_userid_tf = new JTextField();
		updateuser_search_userid_tf.setColumns(10);
		updateuser_search_userid_tf.setBounds(116, 17, 124, 20);
		updateuser_search_elements.add(updateuser_search_userid_tf);
		onlyNumerics(updateuser_search_userid_tf);
		
		updateuser_search_dob_tf = new JTextField();
		updateuser_search_dob_tf.setColumns(10);
		updateuser_search_dob_tf.setBounds(116, 56, 124, 20);
		updateuser_search_elements.add(updateuser_search_dob_tf);
		checkDate(updateuser_search_dob_tf);
		
		updateuser_search_name_tf = new JTextField();
		updateuser_search_name_tf.setColumns(10);
		updateuser_search_name_tf.setBounds(341, 17, 243, 20);
		updateuser_search_elements.add(updateuser_search_name_tf);
		
		updateuser_search_contact_tf = new JTextField();
		updateuser_search_contact_tf.setColumns(10);
		updateuser_search_contact_tf.setBounds(689, 56, 156, 20);
		updateuser_search_elements.add(updateuser_search_contact_tf);
		onlyNumerics(updateuser_search_contact_tf);
		
		updateuser_search_email_tf = new JTextField();
		updateuser_search_email_tf.setColumns(10);
		updateuser_search_email_tf.setBounds(341, 56, 239, 20);
		updateuser_search_elements.add(updateuser_search_email_tf);
		
		JButton updateuser_search_btn = new JButton("SEARCH");
		updateuser_search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = updateuser_search_userid_tf.getText();					//USER ID
				String s2 = updateuser_search_dob_tf.getText();						//DOB
				String s3 = updateuser_search_name_tf.getText();					//NAME
				String s4 = updateuser_search_residence_tf.getText();				//RESIDENCE
				String s5 = updateuser_search_contact_tf.getText();					//CONTACT
				String s6 = updateuser_search_email_tf.getText();					//EMAIL ID
				String s7 = updateuser_search_dateofregistration_tf.getText();		//DATE OF REGISTARTION
				
				user_data_model.setRowCount(0);
				new UserSearchThread(database, user_data_model,s1,s2,s3,s4,s5,s6,s7);
			}
		});
		updateuser_search_btn.setBounds(1274, 38, 117, 23);
		updateuser_search_elements.add(updateuser_search_btn);
		
		updateuser_search_dateofregistration_tf = new JTextField();
		updateuser_search_dateofregistration_tf.setColumns(10);
		updateuser_search_dateofregistration_tf.setBounds(734, 17, 111, 20);
		updateuser_search_elements.add(updateuser_search_dateofregistration_tf);
		checkDate(updateuser_search_dateofregistration_tf);
		
		JLabel updateuser_search_residence_lbl = new JLabel("Residence   : ");
		updateuser_search_residence_lbl.setBounds(855, 17, 79, 20);
		updateuser_search_elements.add(updateuser_search_residence_lbl);
		
		updateuser_search_residence_tf = new JTextArea();
		updateuser_search_residence_tf.setBounds(944, 15, 320, 61);
		updateuser_search_elements.add(updateuser_search_residence_tf);
		
		JPanel updateuser_update_elements = new JPanel();
		updateuser_update_elements.setLayout(null);
		updateuser_update_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		updateuser_update_elements.setBounds(5, 96, 1405, 90);
		updateuser_panel.add(updateuser_update_elements);
		
		JLabel updateuser_update_userid_lbl = new JLabel("User ID           : ");
		updateuser_update_userid_lbl.setBounds(25, 17, 85, 20);
		updateuser_update_elements.add(updateuser_update_userid_lbl);
		
		JLabel updateuser_update_name_lbl = new JLabel("Name         : ");
		updateuser_update_name_lbl.setBounds(250, 17, 85, 20);
		updateuser_update_elements.add(updateuser_update_name_lbl);
		
		JLabel updateuser_update_dob_lbl = new JLabel("Date of Birth  : ");
		updateuser_update_dob_lbl.setBounds(25, 56, 85, 20);
		updateuser_update_elements.add(updateuser_update_dob_lbl);
		
		JLabel updateuser_update_email_lbl = new JLabel("Email ID       : ");
		updateuser_update_email_lbl.setBounds(250, 56, 85, 20);
		updateuser_update_elements.add(updateuser_update_email_lbl);
		
		JLabel updateuser_update_dateofregistration_lbl = new JLabel("Date of Registration : ");
		updateuser_update_dateofregistration_lbl.setBounds(594, 17, 130, 20);
		updateuser_update_elements.add(updateuser_update_dateofregistration_lbl);
		
		JLabel updateuser_update_contact_lbl = new JLabel("Contact       : ");
		updateuser_update_contact_lbl.setBounds(594, 56, 85, 20);
		updateuser_update_elements.add(updateuser_update_contact_lbl);
		
		JLabel updateuser_update_residence_lbl = new JLabel("Residence   : ");
		updateuser_update_residence_lbl.setBounds(855, 17, 79, 20);
		updateuser_update_elements.add(updateuser_update_residence_lbl);
		
		updateuser_update_userid_tf = new JTextField();
		updateuser_update_userid_tf.setColumns(10);
		updateuser_update_userid_tf.setBounds(116, 17, 124, 20);
		updateuser_update_elements.add(updateuser_update_userid_tf);
		updateuser_update_userid_tf.setEditable(false);
		onlyNumerics(updateuser_update_userid_tf);
		
		updateuser_update_dob_tf = new JTextField();
		updateuser_update_dob_tf.setColumns(10);
		updateuser_update_dob_tf.setBounds(116, 56, 124, 20);
		updateuser_update_elements.add(updateuser_update_dob_tf);
		checkDate(updateuser_update_dob_tf);
		
		updateuser_update_name_tf = new JTextField();
		updateuser_update_name_tf.setColumns(10);
		updateuser_update_name_tf.setBounds(341, 17, 243, 20);
		updateuser_update_elements.add(updateuser_update_name_tf);
		toCapital(updateuser_update_name_tf);
		
		updateuser_update_contact_tf = new JTextField();
		updateuser_update_contact_tf.setColumns(10);
		updateuser_update_contact_tf.setBounds(689, 56, 156, 20);
		updateuser_update_elements.add(updateuser_update_contact_tf);
		onlyNumerics(updateuser_update_contact_tf);
		
		updateuser_update_email_tf = new JTextField();
		updateuser_update_email_tf.setColumns(10);
		updateuser_update_email_tf.setBounds(345, 56, 239, 20);
		updateuser_update_elements.add(updateuser_update_email_tf);
		
		updateuser_update_dateofregistration_tf = new JTextField();
		updateuser_update_dateofregistration_tf.setColumns(10);
		updateuser_update_dateofregistration_tf.setBounds(734, 17, 111, 20);
		updateuser_update_elements.add(updateuser_update_dateofregistration_tf);
		checkDate(updateuser_update_dateofregistration_tf);
		
		updateuser_update_residence_tf = new JTextArea();
		updateuser_update_residence_tf.setBounds(944, 15, 320, 61);
		updateuser_update_elements.add(updateuser_update_residence_tf);
		
		JButton updateuser_update_btn = new JButton("UPDATE");
		updateuser_update_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = updateuser_update_userid_tf.getText();					//EDIT USER ID
				String s2 = updateuser_update_dob_tf.getText();						//EDIT DOB
				String s3 = updateuser_update_name_tf.getText();					//EDIT NAME
				String s4 = updateuser_update_residence_tf.getText();				//EDIT RESIDENCE
				String s5 = updateuser_update_contact_tf.getText();					//EDIT CONTACT
				String s6 = updateuser_update_email_tf.getText();					//EDIT EMAIL ID
				String s7 = updateuser_update_dateofregistration_tf.getText();		//EDIT DATE OF REGISTARTION
				
				String str1 = updateuser_search_userid_tf.getText();					//SEARCH USER ID
				String str2 = updateuser_search_dob_tf.getText();						//SEARCH DOB
				String str3 = updateuser_search_name_tf.getText();					//SEARCH NAME
				String str4 = updateuser_search_residence_tf.getText();				//SEARCH RESIDENCE
				String str5 = updateuser_search_contact_tf.getText();					//SEARCH CONTACT
				String str6 = updateuser_search_email_tf.getText();					//SEARCH EMAIL ID
				String str7 = updateuser_search_dateofregistration_tf.getText();		//SEARCH DATE OF REGISTARTION
				
				new EditUserThread(1, user_data_model, database, s1, s2, s3, s4, s5, s6, s7, str1, str2, str3, str4, str5, str6, str7);
			}
		});
		updateuser_update_btn.setBounds(1274, 16, 117, 23);
		updateuser_update_elements.add(updateuser_update_btn);
		
		JButton updateuser_delete_btn = new JButton("DELETE");
		updateuser_delete_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = updateuser_update_userid_tf.getText();					//EDIT USER ID
				String s2 = updateuser_update_dob_tf.getText();						//EDIT DOB
				String s3 = updateuser_update_name_tf.getText();					//EDIT NAME
				String s4 = updateuser_update_residence_tf.getText();				//EDIT RESIDENCE
				String s5 = updateuser_update_contact_tf.getText();					//EDIT CONTACT
				String s6 = updateuser_update_email_tf.getText();					//EDIT EMAIL ID
				String s7 = updateuser_update_dateofregistration_tf.getText();		//EDIT DATE OF REGISTARTION
				
				String str1 = updateuser_search_userid_tf.getText();					//SEARCH USER ID
				String str2 = updateuser_search_dob_tf.getText();						//SEARCH DOB
				String str3 = updateuser_search_name_tf.getText();					//SEARCH NAME
				String str4 = updateuser_search_residence_tf.getText();				//SEARCH RESIDENCE
				String str5 = updateuser_search_contact_tf.getText();					//SEARCH CONTACT
				String str6 = updateuser_search_email_tf.getText();					//SEARCH EMAIL ID
				String str7 = updateuser_search_dateofregistration_tf.getText();		//SEARCH DATE OF REGISTARTION
				
				new EditUserThread(2, user_data_model, database, s1, s2, s3, s4, s5, s6, s7, str1, str2, str3, str4, str5, str6, str7);
				
//				edituser_edit_userid_tf.setText("");					//EDIT USER ID
//				edituser_edit_dob_tf.setText("");						//EDIT DOB
//				edituser_edit_name_tf.setText("");						//EDIT NAME
//				edituser_edit_residence_tf.setText("");					//EDIT RESIDENCE
//				edituser_edit_contact_tf.setText("");					//EDIT CONTACT
//				edituser_edit_email_tf.setText("");						//EDIT EMAIL ID
//				edituser_edit_dateofregistration_tf.setText("");		//EDIT DATE OF REGISTARTION
			}
		});
		updateuser_delete_btn.setBounds(1274, 55, 117, 23);
		updateuser_update_elements.add(updateuser_delete_btn);
		
		JPanel update_user_pane = new JPanel();
		update_user_pane.setLayout(null);
		update_user_pane.setBounds(5, 194, 1405, 425);
		updateuser_panel.add(update_user_pane);
		
		JScrollPane update_user_scrollpane = new JScrollPane();
		update_user_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		update_user_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		update_user_scrollpane.setBounds(0, 0, 1405, 414);
		update_user_pane.add(update_user_scrollpane);
		
		user_update_table = new JTable(user_data_model);
		
		user_update_table.getColumnModel().getColumn(0).setPreferredWidth(0);
		user_update_table.getColumnModel().getColumn(1).setPreferredWidth(160);
		user_update_table.getColumnModel().getColumn(2).setPreferredWidth(40);
		user_update_table.getColumnModel().getColumn(3).setPreferredWidth(30);
		user_update_table.getColumnModel().getColumn(4).setPreferredWidth(150);
		user_update_table.getColumnModel().getColumn(5).setPreferredWidth(500);
		user_update_table.getColumnModel().getColumn(6).setPreferredWidth(60);
		
		user_update_table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String s1 = user_data_model.getValueAt(user_update_table.getSelectedRow(),0).toString();
				String s2 = user_data_model.getValueAt(user_update_table.getSelectedRow(),1).toString();
				String s3 = user_data_model.getValueAt(user_update_table.getSelectedRow(),2).toString();
				String s4 = user_data_model.getValueAt(user_update_table.getSelectedRow(),3).toString();
				String s5 = user_data_model.getValueAt(user_update_table.getSelectedRow(),4).toString();
				String s6 = user_data_model.getValueAt(user_update_table.getSelectedRow(),5).toString();
				String s7 = user_data_model.getValueAt(user_update_table.getSelectedRow(),6).toString();
				
				updateuser_update_userid_tf.setText(s1);
				updateuser_update_dob_tf.setText(s3);
				updateuser_update_name_tf.setText(s2);
				updateuser_update_residence_tf.setText(s6);
				updateuser_update_contact_tf.setText(s4);
				updateuser_update_email_tf.setText(s5);
				updateuser_update_dateofregistration_tf.setText(s7);
			}
		});
		update_user_scrollpane.setViewportView(user_update_table);
		
		JPanel search_books_user_panel = new JPanel();
		search_books_user_panel.setLayout(null);
		main_layeredpane.add(search_books_user_panel);
		
		JPanel books_user_elements_panel = new JPanel();
		books_user_elements_panel.setLayout(null);
		books_user_elements_panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		books_user_elements_panel.setBounds(5, 5, 1405, 90);
		search_books_user_panel.add(books_user_elements_panel);
		
		JLabel books_user_bookid_lbl = new JLabel("Book ID           : ");
		books_user_bookid_lbl.setBounds(25, 17, 85, 20);
		books_user_elements_panel.add(books_user_bookid_lbl);
		
		JLabel books_user_bookname_lbl = new JLabel("Book Name   : ");
		books_user_bookname_lbl.setBounds(230, 17, 85, 20);
		books_user_elements_panel.add(books_user_bookname_lbl);
		
		JLabel books_user_isbn_lbl = new JLabel("ISBN                : ");
		books_user_isbn_lbl.setBounds(25, 56, 85, 20);
		books_user_elements_panel.add(books_user_isbn_lbl);
		
		JLabel books_user_publications_lbl = new JLabel("Publications  : ");
		books_user_publications_lbl.setBounds(595, 56, 85, 20);
		books_user_elements_panel.add(books_user_publications_lbl);
		
		JLabel books_user_publishedyear_lbl = new JLabel("Published Year     : ");
		books_user_publishedyear_lbl.setBounds(900, 56, 109, 20);
		books_user_elements_panel.add(books_user_publishedyear_lbl);
		
		JLabel books_user_category_lbl = new JLabel("Category       : ");
		books_user_category_lbl.setBounds(595, 17, 85, 20);
		books_user_elements_panel.add(books_user_category_lbl);
		
		JLabel books_user_author_lbl = new JLabel("Author             : ");
		books_user_author_lbl.setBounds(230, 56, 85, 20);
		books_user_elements_panel.add(books_user_author_lbl);
		
		JButton books_user_search_btn = new JButton("SEARCH");
		books_user_search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					books_user_info_model.setRowCount(0);
					database.searchBook(new JTextField[] {books_user_bookid_tf, books_user_isbn_tf, books_user_bookname_tf, books_user_author_tf, books_user_category_tf, books_user_publications_tf, books_user_publishedyear_tf, books_user_edition_tf, books_user_dateofarrival_tf});
					database.showBookIssuedAllData(books_user_bookid_tf.getText(), books_user_info_model, 1);
				} 
				catch (ClassNotFoundException e1) 
				{
					JOptionPane.showMessageDialog(null,"Driver is not working");
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		books_user_search_btn.setBounds(1142, 55, 235, 23);
		books_user_elements_panel.add(books_user_search_btn);
		
		books_user_bookid_tf = new JTextField();
		books_user_bookid_tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				books_user_isbn_tf.setText("");
				books_user_bookname_tf.setText("");
				books_user_author_tf.setText("");
				books_user_category_tf.setText("");
				books_user_publications_tf.setText("");
				books_user_publishedyear_tf.setText("");
				books_user_edition_tf.setText("");
				books_user_dateofarrival_tf.setText("");
				books_user_info_model.setRowCount(0);
			}
		});
		books_user_bookid_tf.setColumns(10);
		books_user_bookid_tf.setBounds(120, 17, 100, 20);
		books_user_elements_panel.add(books_user_bookid_tf);
		onlyNumerics(books_user_bookid_tf);
		
		books_user_isbn_tf = new JTextField();
		books_user_isbn_tf.setEditable(false);
		books_user_isbn_tf.setColumns(10);
		books_user_isbn_tf.setBounds(120, 56, 100, 20);
		books_user_elements_panel.add(books_user_isbn_tf);
		
		books_user_bookname_tf = new JTextField();
		books_user_bookname_tf.setEditable(false);
		books_user_bookname_tf.setColumns(10);
		books_user_bookname_tf.setBounds(325, 17, 260, 20);
		books_user_elements_panel.add(books_user_bookname_tf);
		
		books_user_author_tf = new JTextField();
		books_user_author_tf.setEditable(false);
		books_user_author_tf.setColumns(10);
		books_user_author_tf.setBounds(325, 56, 260, 20);
		books_user_elements_panel.add(books_user_author_tf);
		
		books_user_category_tf = new JTextField();
		books_user_category_tf.setEditable(false);
		books_user_category_tf.setColumns(10);
		books_user_category_tf.setBounds(690, 17, 200, 20);
		books_user_elements_panel.add(books_user_category_tf);
		
		books_user_publications_tf = new JTextField();
		books_user_publications_tf.setEditable(false);
		books_user_publications_tf.setColumns(10);
		books_user_publications_tf.setBounds(690, 56, 200, 20);
		books_user_elements_panel.add(books_user_publications_tf);
		
		books_user_publishedyear_tf = new JTextField();
		books_user_publishedyear_tf.setEditable(false);
		books_user_publishedyear_tf.setColumns(10);
		books_user_publishedyear_tf.setBounds(1019, 56, 103, 20);
		books_user_elements_panel.add(books_user_publishedyear_tf);
		
		JLabel books_user_edition_lbl = new JLabel("Edition        : ");
		books_user_edition_lbl.setBounds(900, 17, 85, 20);
		books_user_elements_panel.add(books_user_edition_lbl);
		
		books_user_edition_tf = new JTextField();
		books_user_edition_tf.setEditable(false);
		books_user_edition_tf.setColumns(10);
		books_user_edition_tf.setBounds(995, 17, 103, 20);
		books_user_elements_panel.add(books_user_edition_tf);
		
		JLabel books_user_dateofarrival_lbl = new JLabel("Date of Arrival     : ");
		books_user_dateofarrival_lbl.setBounds(1108, 17, 127, 20);
		books_user_elements_panel.add(books_user_dateofarrival_lbl);
		
		books_user_dateofarrival_tf = new JTextField();
		books_user_dateofarrival_tf.setEditable(false);
		books_user_dateofarrival_tf.setColumns(10);
		books_user_dateofarrival_tf.setBounds(1245, 17, 132, 20);
		books_user_elements_panel.add(books_user_dateofarrival_tf);
		
		JPanel books_user_info_panel = new JPanel();
		books_user_info_panel.setLayout(null);
		books_user_info_panel.setBounds(5, 100, 1405, 522);
		search_books_user_panel.add(books_user_info_panel);
		
		JScrollPane books_user_info_scrollpane = new JScrollPane();
		books_user_info_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		books_user_info_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		books_user_info_scrollpane.setBounds(0, 0, 1405, 511);
		books_user_info_panel.add(books_user_info_scrollpane);
		
		JTable books_user_info_table = new JTable(books_user_info_model);
		
		books_user_info_table.getColumnModel().getColumn(0).setPreferredWidth(60);		//USER ID
		books_user_info_table.getColumnModel().getColumn(1).setPreferredWidth(300);		//USER NAME
		books_user_info_table.getColumnModel().getColumn(2).setPreferredWidth(120);		//CONTACT
		books_user_info_table.getColumnModel().getColumn(3).setPreferredWidth(210);		//EMAIL ID
		books_user_info_table.getColumnModel().getColumn(4).setPreferredWidth(90);		//DATE OF ISSUE
		books_user_info_table.getColumnModel().getColumn(5).setPreferredWidth(90);		//DUE DATE
		books_user_info_table.getColumnModel().getColumn(6).setPreferredWidth(90);		//RETURN DATE
		books_user_info_table.getColumnModel().getColumn(7).setPreferredWidth(40);		//FINE
		
		books_user_info_scrollpane.setViewportView(books_user_info_table);
		
		JPanel search_user_books_panel = new JPanel();
		search_user_books_panel.setLayout(null);
		main_layeredpane.add(search_user_books_panel, "name_25121615207800");
		
		JPanel search_user_books_elements = new JPanel();
		search_user_books_elements.setLayout(null);
		search_user_books_elements.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		search_user_books_elements.setBounds(5, 11, 1405, 90);
		search_user_books_panel.add(search_user_books_elements);
		
		JLabel user_books_userid_lbl = new JLabel("User ID           : ");
		user_books_userid_lbl.setBounds(25, 17, 85, 20);
		search_user_books_elements.add(user_books_userid_lbl);
		
		JLabel user_books_name_lbl = new JLabel("Name         : ");
		user_books_name_lbl.setBounds(250, 17, 85, 20);
		search_user_books_elements.add(user_books_name_lbl);
		
		JLabel user_books_dob_lbl = new JLabel("Date of Birth  : ");
		user_books_dob_lbl.setBounds(25, 56, 85, 20);
		search_user_books_elements.add(user_books_dob_lbl);
		
		JLabel user_books_email_lbl = new JLabel("Email ID       : ");
		user_books_email_lbl.setBounds(250, 56, 85, 20);
		search_user_books_elements.add(user_books_email_lbl);
		
		JLabel user_books_registrationdate_lbl = new JLabel("Date of Registration : ");
		user_books_registrationdate_lbl.setBounds(594, 17, 130, 20);
		search_user_books_elements.add(user_books_registrationdate_lbl);
		
		JLabel user_books_contact_lbl = new JLabel("Contact       : ");
		user_books_contact_lbl.setBounds(594, 56, 85, 20);
		search_user_books_elements.add(user_books_contact_lbl);
		
		JLabel user_books_residence_lbl = new JLabel("Residence   : ");
		user_books_residence_lbl.setBounds(855, 17, 79, 20);
		search_user_books_elements.add(user_books_residence_lbl);
		
		user_books_userid_tf = new JTextField();
		user_books_userid_tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				user_books_name_tf.setText("");
				user_books_dob_tf.setText("");
				user_books_contact_tf.setText("");
				user_books_email_tf.setText("");
				user_books_residence_tf.setText("");
				user_books_registrationdate_tf.setText("");
				user_books_info_model.setRowCount(0);
			}
		});
		user_books_userid_tf.setColumns(10);
		user_books_userid_tf.setBounds(116, 17, 124, 20);
		search_user_books_elements.add(user_books_userid_tf);
		onlyNumerics(user_books_userid_tf);
		
		user_books_dob_tf = new JTextField();
		user_books_dob_tf.setEditable(false);
		user_books_dob_tf.setColumns(10);
		user_books_dob_tf.setBounds(116, 56, 124, 20);
		search_user_books_elements.add(user_books_dob_tf);
		
		user_books_name_tf = new JTextField();
		user_books_name_tf.setEditable(false);
		user_books_name_tf.setColumns(10);
		user_books_name_tf.setBounds(341, 17, 243, 20);
		search_user_books_elements.add(user_books_name_tf);
		
		user_books_contact_tf = new JTextField();
		user_books_contact_tf.setEditable(false);
		user_books_contact_tf.setColumns(10);
		user_books_contact_tf.setBounds(689, 56, 156, 20);
		search_user_books_elements.add(user_books_contact_tf);
		
		user_books_email_tf = new JTextField();
		user_books_email_tf.setEditable(false);
		user_books_email_tf.setColumns(10);
		user_books_email_tf.setBounds(341, 56, 243, 20);
		search_user_books_elements.add(user_books_email_tf);
		
		user_books_registrationdate_tf = new JTextField();
		user_books_registrationdate_tf.setEditable(false);
		user_books_registrationdate_tf.setColumns(10);
		user_books_registrationdate_tf.setBounds(734, 17, 111, 20);
		search_user_books_elements.add(user_books_registrationdate_tf);
		
		user_books_residence_tf = new JTextArea();
		user_books_residence_tf.setEditable(false);
		user_books_residence_tf.setBounds(944, 15, 320, 61);
		search_user_books_elements.add(user_books_residence_tf);
		
		JButton user_books_search_btn = new JButton("SEARCH");
		user_books_search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					database.searchUser(new JTextField[] {user_books_userid_tf, user_books_name_tf, user_books_dob_tf, user_books_contact_tf, user_books_email_tf, user_books_registrationdate_tf}, user_books_residence_tf);
					database.showBookIssuedAllData(user_books_userid_tf.getText(), user_books_info_model, 2);
				}
				catch (ClassNotFoundException e1) 
				{
					javax.swing.JOptionPane.showMessageDialog(null,"Driver is not working");
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		user_books_search_btn.setBounds(1274, 34, 117, 23);
		search_user_books_elements.add(user_books_search_btn);
		
		JPanel user_books_info_panel = new JPanel();
		user_books_info_panel.setLayout(null);
		user_books_info_panel.setBounds(5, 100, 1405, 522);
		search_user_books_panel.add(user_books_info_panel);
		
		JScrollPane user_books_info_scrollpane = new JScrollPane();
		user_books_info_scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		user_books_info_scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		user_books_info_scrollpane.setBounds(0, 0, 1405, 511);
		user_books_info_panel.add(user_books_info_scrollpane);
		
		JTable user_books_info_table = new JTable(user_books_info_model);
		
		user_books_info_table.getColumnModel().getColumn(0).setPreferredWidth(60);		//BOOK ID
		user_books_info_table.getColumnModel().getColumn(1).setPreferredWidth(300);		//BOOK NAME
		user_books_info_table.getColumnModel().getColumn(2).setPreferredWidth(220);		//AUTHOR
		user_books_info_table.getColumnModel().getColumn(3).setPreferredWidth(110);		//ISBN
		user_books_info_table.getColumnModel().getColumn(4).setPreferredWidth(90);		//DATE OF ISSUE
		user_books_info_table.getColumnModel().getColumn(5).setPreferredWidth(90);		//DUE DATE
		user_books_info_table.getColumnModel().getColumn(6).setPreferredWidth(90);		//RETURN DATE
		user_books_info_table.getColumnModel().getColumn(7).setPreferredWidth(40);		//FINE
		
		user_books_info_scrollpane.setViewportView(user_books_info_table);
		
		JPanel btn_panel = new JPanel();
		frame.getContentPane().add(btn_panel);
		btn_panel.setLayout(null);
		btn_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btn_panel.setBounds(4, 663, 1416, 32);
		
		new BookIssueDataThread(database, book_issue_model);
		
		JButton bookissue_btn = new JButton("BOOK ISSUE");
		bookissue_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				book_issue_model.setRowCount(0);
				new BookIssueDataThread(database, book_issue_model);
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, bookissue_panel);
				switchPanels(data_layeredpane, bookissue_data_panel);
			}
		});
		bookissue_btn.setBounds(10, 5, 140, 22);
		btn_panel.add(bookissue_btn);
		
		JButton bookreturn_btn = new JButton("BOOK RETURN");
		bookreturn_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				book_return_model.setRowCount(0);
				new BookReturnDataThread(database, book_return_model);
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, bookreturn_panel);
				switchPanels(data_layeredpane, bookreturn_data_panel);
			}
		});
		bookreturn_btn.setBounds(160, 5, 140, 22);
		btn_panel.add(bookreturn_btn);
		
		JButton newbook_btn = new JButton("NEW BOOK");
		newbook_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, newbook_panel);
				switchPanels(data_layeredpane, newbook_data_panel);
				new_book_model.setRowCount(0);
				new NewBookDataThread(database, new_book_model);
				readFile();
			}
		});
		newbook_btn.setBounds(310, 5, 140, 22);
		btn_panel.add(newbook_btn);
		
		JButton newuser_btn = new JButton("NEW USER");
		newuser_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readFile();
				userid_tf.setText((Integer.parseInt(userid)+1) + "");
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, newuser_panel);
				switchPanels(data_layeredpane, newuser_data_panel);
				new_user_model.setRowCount(0);
				new NewUserDataThread(database, new_user_model);
			}
		});
		newuser_btn.setBounds(460, 5, 140, 22);
		btn_panel.add(newuser_btn);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMain = new JMenu("Main");
		menuBar.add(mnMain);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Book");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, newbook_panel);
				switchPanels(data_layeredpane, newbook_data_panel);
				new_book_model.setRowCount(0);
				new NewBookDataThread(database, new_book_model);
				readFile();
			}
		});
		mnMain.add(mntmNewMenuItem);
		
		JMenuItem mntmViewBooks = new JMenuItem("View Books");
		mntmViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, books_data_panel);
				try {
					books_data_model.setRowCount(0);
					database.viewBook(books_data_model, 1);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		mnMain.add(mntmViewBooks);
		
		JSeparator separator_1 = new JSeparator();
		mnMain.add(separator_1);
		
		JMenuItem mntmNewUser = new JMenuItem("New User");
		mntmNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userid_tf.setText(userid);
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, newuser_panel);
				switchPanels(data_layeredpane, newuser_data_panel);
				new_user_model.setRowCount(0);
				new NewUserDataThread(database, new_user_model);
				readFile();
			}
		});
		mnMain.add(mntmNewUser);
		
		JMenuItem mntmViewUsers = new JMenuItem("View Users");
		mntmViewUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, user_data_panel);
				try {
					user_data_model.setRowCount(0);
					database.viewUser(user_data_model, 1);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		mnMain.add(mntmViewUsers);
		
		JSeparator separator_2 = new JSeparator();
		mnMain.add(separator_2);
		
		JMenuItem mntmBookIssue = new JMenuItem("Book Issue");
		mntmBookIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, bookissue_panel);
				switchPanels(data_layeredpane, bookissue_data_panel);
			}
		});
		mnMain.add(mntmBookIssue);
		
		JMenuItem mntmBookReturn = new JMenuItem("Book Return");
		mntmBookReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, main_panel);
				switchPanels(admin_layeredpane, bookreturn_panel);
				switchPanels(data_layeredpane, bookreturn_data_panel);
			}
		});
		
		JMenuItem mntmViewIssuedBooks = new JMenuItem("View Issued Books");
		mntmViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				books_issued_info_model.setRowCount(0);
				switchPanels(main_layeredpane, issuedbooks_data_panel);
				try 
				{
					database.viewIssuedBook(books_issued_info_model, 2);
				} 
				catch (ClassNotFoundException e1) 
				{
					JOptionPane.showMessageDialog(null,"Driver is not working");
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		mnMain.add(mntmViewIssuedBooks);
		
		JSeparator separator_16 = new JSeparator();
		mnMain.add(separator_16);
		mnMain.add(mntmBookReturn);
		
		JMenuItem mntmViewReturnedBooks = new JMenuItem("View Returned Books");
		mntmViewReturnedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				book_return_info_model.setRowCount(0);
				switchPanels(main_layeredpane, returnbooks_data_panel);
				try 
				{
					database.viewReturnedBook(book_return_info_model, 2);
				} 
				catch (ClassNotFoundException e1) 
				{
					JOptionPane.showMessageDialog(null,"Driver is not working");
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		mnMain.add(mntmViewReturnedBooks);
		
		JSeparator separator_3 = new JSeparator();
		mnMain.add(separator_3);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		ButtonGroup bg = new ButtonGroup();
		
		JMenuItem mntmChangeUsername = new JMenuItem("Change Username");
		mntmChangeUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernamePassword ob = new UsernamePassword();
				ob.changeUsername();
			}
		});
		mnMain.add(mntmChangeUsername);
		
		JMenuItem mntmChangePassword = new JMenuItem("Change Password");
		mntmChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernamePassword ob = new UsernamePassword();
				ob.changePassword();
			}
		});
		mnMain.add(mntmChangePassword);
		
		JSeparator separator_5 = new JSeparator();
		mnMain.add(separator_5);
		
		JMenuItem mntmRestart = new JMenuItem("Restart");
		mntmRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				initialize();
			}
		});
		mnMain.add(mntmRestart);
		mnMain.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmUpdateBook = new JMenuItem("Update Book");
		mntmUpdateBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, updatebook_panel);
			}
		});
		mnEdit.add(mntmUpdateBook);
		
		JMenuItem mntmDeleteBook = new JMenuItem("Delete All Books");
		mntmDeleteBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteBooksThread(database);
			}
		});
		mnEdit.add(mntmDeleteBook);
		
		JSeparator separator_8 = new JSeparator();
		mnEdit.add(separator_8);
		
		JMenuItem mntmUpdateUser = new JMenuItem("Update User");
		mntmUpdateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, updateuser_panel);
			}
		});
		mnEdit.add(mntmUpdateUser);
		
		JMenuItem mntmDeleteUser = new JMenuItem("Delete All Users");
		mnEdit.add(mntmDeleteUser);
		
		JMenu mnSearch = new JMenu("Search");
		menuBar.add(mnSearch);
		
		JMenuItem mntmAuthor = new JMenuItem("Author");
		mntmAuthor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, searchauthor_panel);
				search_author_model.setRowCount(0);
				String s1 = searchauthor_bookid_tf.getText();
				String s2 = searchauthor_bookname_tf.getText();
				String s3 = searchauthor_author_tf.getText();
				new SearchAuthorThread(database, search_author_model, s1, s2, s3);
			}
		});
		
		mnSearch.add(mntmAuthor);
		
		JMenu mnBooks = new JMenu("Books");
		mnSearch.add(mnBooks);
		
		JMenuItem mntmSearchBook = new JMenuItem("by Book ID");
		mnBooks.add(mntmSearchBook);
		mntmSearchBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				books_user_info_model.setRowCount(0);
				switchPanels(main_layeredpane, search_books_user_panel);
			}
		});
		JMenuItem mntmSearchBooks = new JMenuItem("by Other Data");
		mnBooks.add(mntmSearchBooks);
		mntmSearchBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, searchbook_panel);
				books_data_model.setRowCount(0);
			}
		});
		
		JMenu mnUsers = new JMenu("Users");
		mnSearch.add(mnUsers);
		
		JMenuItem mntmByUserId = new JMenuItem("by User ID");
		mntmByUserId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_books_info_model.setRowCount(0);
				switchPanels(main_layeredpane, search_user_books_panel);
			}
		});
		mnUsers.add(mntmByUserId);
		
		JMenuItem mntmSearchUsers = new JMenuItem("by Other Data");
		mnUsers.add(mntmSearchUsers);
		mntmSearchUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(main_layeredpane, searchuser_panel);
				user_data_model.setRowCount(0);
			}
		});
		
		JMenu mnDatabase_1 = new JMenu("Database");
		menuBar.add(mnDatabase_1);
		
		JMenu mnSelectDatabase = new JMenu("Select Database");
		mnDatabase_1.add(mnSelectDatabase);
		
		JRadioButtonMenuItem mntmMysql = new JRadioButtonMenuItem("MySQL");
		mntmMysql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				driver = "1";
				createFile();
				addRecords();
				closeFile();
				readFile();
				frame.dispose();
				initialize();
			}
		});
		mnSelectDatabase.add(mntmMysql);
		
		JRadioButtonMenuItem mntmOracleDatabase = new JRadioButtonMenuItem("Oracle Database");
		mntmOracleDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				driver = "2";
				createFile();
				addRecords();
				closeFile();
				readFile();
				frame.dispose();
				initialize();
				
			}
		});
		mnSelectDatabase.add(mntmOracleDatabase);
		
		JRadioButtonMenuItem mntmSqlite = new JRadioButtonMenuItem("SQLite");
		mntmSqlite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				driver = "3";
				createFile();
				addRecords();
				closeFile();
				readFile();
				frame.dispose();
				initialize();
			}
		});
		mnSelectDatabase.add(mntmSqlite);
		bg.add(mntmMysql);
		bg.add(mntmOracleDatabase);
		bg.add(mntmSqlite);
		
		JSeparator separator_4 = new JSeparator();
		mnDatabase_1.add(separator_4);
		
		JMenuItem mntmChangeSqlUsername = new JMenuItem("Change Database Username");
		mntmChangeSqlUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernamePassword ob = new UsernamePassword();
				ob.changeDatabaseUsername();
			}
		});
		mnDatabase_1.add(mntmChangeSqlUsername);
		
		JMenuItem mntmChangeSqlPassword = new JMenuItem("Change Database Password");
		mntmChangeSqlPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernamePassword ob = new UsernamePassword();
				ob.changeDatabasePassword();
			}
		});
		mnDatabase_1.add(mntmChangeSqlPassword);
		
		JSeparator separator_14 = new JSeparator();
		mnDatabase_1.add(separator_14);
		
		JMenuItem mntmClearDatabase = new JMenuItem("Clear Database");
		mntmClearDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ClearDatabaseThread(database);
				
				readFile();
				userid = "100000";
				bookid = "1000000";
				createFile();
				addRecords();
				closeFile();
			}
		});
		
		JMenuItem mntmCreateDatabase = new JMenuItem("Create Database");
		mntmCreateDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddDatabaseThread(database);
				readFile();
				userid = "100000";
				bookid = "1000000";
				createFile();
				addRecords();
				closeFile();
			}
		});
		
		JMenuItem mntmSetIpAddress = new JMenuItem("Set IP Address");
		mntmSetIpAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseInformation ob = new DatabaseInformation();
				ob.setIPAddress(frame);
			}
		});
		mnDatabase_1.add(mntmSetIpAddress);
		
		JMenuItem mntmSetPortNo =new JMenuItem("Set Port No.");
		mntmSetPortNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseInformation ob = new DatabaseInformation();
				ob.setPort(frame);
			}
		});
		mnDatabase_1.add(mntmSetPortNo);
		
		JSeparator separator_15 = new JSeparator();
		mnDatabase_1.add(separator_15);
		mnDatabase_1.add(mntmCreateDatabase);
		mnDatabase_1.add(mntmClearDatabase);
		
		JMenuItem mntmDeleteDatabase = new JMenuItem("Delete Database");
		mntmDeleteDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteDatabaseThread(database);
			}
		});
		mnDatabase_1.add(mntmDeleteDatabase);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpContents = new JMenuItem("Help Contents");
		mnHelp.add(mntmHelpContents);
		
		JMenuItem mntmAboutLibraryManagement = new JMenuItem("About Library Management System");
		mntmAboutLibraryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AboutLibraryManagementSystem();
			}
		});
		mnHelp.add(mntmAboutLibraryManagement);
		
		if(Integer.parseInt(driver)==1)
		{
			mntmMysql.setSelected(true);
		}
		else if(Integer.parseInt(driver)==2)
		{
			mntmOracleDatabase.setSelected(true);
		}
		else if(Integer.parseInt(driver)==3)
		{
			mntmSqlite.setSelected(true);
		}
	}
	
	public void switchPanels(JLayeredPane layeredpane,JPanel panel)
	{
		layeredpane.removeAll();
		layeredpane.add(panel);
		layeredpane.repaint();
		layeredpane.revalidate();	
	}
	
	public void readFile()
	{
		Scanner scan = null;
		try
		{
			scan = new Scanner(new File("C:\\Users\\jobal\\Desktop\\Data\\data.lib"));
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			userid = "100000";
			bookid = "1000000";
			createFile();
			addRecords();
			closeFile();
		}
		bookid = scan.next();
		userid = scan.next();
		driver = scan.next();
	}
	
	public void createFile()
	{
		try 
		{
			x = new Formatter("C:\\Users\\jobal\\Desktop\\Data\\data.lib");
		} 
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null,"Error");
		}
	}
	
	public void addRecords()
	{
		x.format("%s %s %s", bookid, userid, driver);
	}
	
	public void closeFile()
	{
		x.close();
	}
	
	public void readFile1()
	{
		Scanner scan;
		try
		{
			scan = new Scanner(new File("C:\\Users\\jobal\\Desktop\\Data\\data2.txt"));
			username = scan.next();
			password = scan.next();
		}
		catch (FileNotFoundException e)
		{
			
		}
	}
	
	public void onlyNumerics(JTextField tf)
	{
		KeyListener only_numerics = new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))
				{
					e.consume();
				}
			}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){}
		};
		tf.addKeyListener(only_numerics);
	}
	
	public void toCapital(JTextField tf)
	{
		KeyListener capital_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_SPACE)))
				{
					e.consume();
				}
			}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e) 
			{
				String str = tf.getText();
				tf.setText(str.toUpperCase());	
			}
		};
		tf.addKeyListener(capital_key);
	}
	
	public void checkYear(JTextField tf)
	{
		KeyListener year = new KeyListener()
		{
			public void keyTyped(KeyEvent e) 
			{
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))
				{
					e.consume();
				}
				String str = tf.getText();
				if(str.length()>3)
				{
					e.consume();
				}
			}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent evt) {
				String str = tf.getText();
				try
				{
				if(Integer.parseInt(str) > date_year)
				{
					tf.setText("");
				}
				}catch (Exception e) {}
			}		
		};
		tf.addKeyListener(year);
	}
	
	public void checkDate(JTextField tf)
	{
		KeyListener date_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_SLASH)))
				{
					e.consume();
				}
			}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){}
		};
		tf.addKeyListener(date_key);
	}
}