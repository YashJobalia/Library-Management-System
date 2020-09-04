package library;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class UsernamePassword extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField newusername_username_tf;
	private JTextField newusername_password_tf;
	private JTextField newpassword_oldpassword_tf;
	private JTextField newpassword_newpassword_tf;
	private JTextField new_database_username_username_tf;
	private JTextField new_database_username_password_tf;
	private JTextField new_database_password_oldpassword_tf;
	private JTextField new_database_password_newpassword_tf;
	private JLayeredPane layeredPane;
	private String username, password;
	private Formatter x;
	private String database_uname;
	private String database_pass;
	private Formatter x1;
	private JButton login_btn;

	public UsernamePassword() 
	{
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(466, 224);
		setVisible(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBounds(0,0,540,300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 460, 195);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
	}
	
	public void changeUsername()
	{
		setTitle("Change Username");
		
		KeyListener cancel_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ESCAPE || c==KeyEvent.VK_ENTER)
				{
					dispose();
				}
			}
		};
		
		JPanel newusername_panel = new JPanel();
		newusername_panel.setLayout(null);
		layeredPane.add(newusername_panel);
		
		JLabel newusername_username_lbl = new JLabel("New Username         : ");
		newusername_username_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		newusername_username_lbl.setBounds(45, 25, 146, 50);
		newusername_panel.add(newusername_username_lbl);
		
		JLabel newusername_password_lbl = new JLabel("Confirm Password    : ");
		newusername_password_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		newusername_password_lbl.setBounds(45, 70, 146, 50);
		newusername_panel.add(newusername_password_lbl);
		
		newusername_username_tf = new JTextField();
		newusername_username_tf.setBounds(212, 35, 180, 22);
		newusername_panel.add(newusername_username_tf);
		newusername_username_tf.setColumns(10);
		newusername_username_tf.addKeyListener(cancel_key);
		
		newusername_password_tf = new JTextField();
		newusername_password_tf.setBounds(212, 80, 180, 22);
		newusername_panel.add(newusername_password_tf);
		newusername_password_tf.setColumns(10);
		newusername_password_tf.addKeyListener(cancel_key);
		
		JButton newusername_btn = new JButton("Change Username");
		newusername_btn.setBounds(88, 131, 140, 23);
		newusername_panel.add(newusername_btn);
		newusername_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readFile();
				if(newusername_password_tf.getText().equals(password))
				 {
					 
					 username = newusername_username_tf.getText();
					 createFile();
					 addRecords();
					 closeFile();
					 dispose();
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null,"Incorrect Password");
				 }
			}
		});
		newusername_btn.addKeyListener(cancel_key);
		
		JButton newusername_cancel_btn = new JButton("Cancel");
		newusername_cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		newusername_cancel_btn.setBounds(262, 131, 130, 23);
		newusername_panel.add(newusername_cancel_btn);
		newusername_cancel_btn.addKeyListener(cancel_key);
	}
	
	public void changePassword()
	{
		setTitle("Change Password");
		
		KeyListener cancel_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ESCAPE || c==KeyEvent.VK_ENTER)
				{
					dispose();
				}
			}
		};
		
		JPanel newpassword_panel = new JPanel();
		newpassword_panel.setLayout(null);
		layeredPane.add(newpassword_panel);
		
		JLabel newpassword_oldpassword_lbl = new JLabel("Old Password         :");
		newpassword_oldpassword_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		newpassword_oldpassword_lbl.setBounds(45, 25, 146, 50);
		newpassword_panel.add(newpassword_oldpassword_lbl);
		
		JLabel newpassword_newpassword_lbl = new JLabel("New Password        :");
		newpassword_newpassword_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		newpassword_newpassword_lbl.setBounds(45, 69, 146, 50);
		newpassword_panel.add(newpassword_newpassword_lbl);
		
		newpassword_oldpassword_tf = new JTextField();
		newpassword_oldpassword_tf.setColumns(10);
		newpassword_oldpassword_tf.setBounds(212, 35, 180, 22);
		newpassword_panel.add(newpassword_oldpassword_tf);
		newpassword_oldpassword_tf.addKeyListener(cancel_key);
		
		newpassword_newpassword_tf = new JTextField();
		newpassword_newpassword_tf.setColumns(10);
		newpassword_newpassword_tf.setBounds(212, 80, 180, 22);
		newpassword_panel.add(newpassword_newpassword_tf);
		newpassword_newpassword_tf.addKeyListener(cancel_key);
		
		JButton newpassword_btn = new JButton("Change Password");
		newpassword_btn.setBounds(88, 131, 140, 23);
		newpassword_panel.add(newpassword_btn);
		newpassword_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readFile();
				if(newpassword_oldpassword_tf.getText().equals(password))
				 {
					 password = newpassword_newpassword_tf.getText();
					 createFile();
					 addRecords();
					 closeFile();
					 dispose();
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null,"Incorrect Password");
				 }
			}
		});
		newpassword_btn.addKeyListener(cancel_key);
		
		JButton newpassword_cancel_btn = new JButton("Cancel");
		newpassword_cancel_btn.setBounds(262, 131, 130, 23);
		newpassword_panel.add(newpassword_cancel_btn);
		newpassword_cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		newpassword_cancel_btn.addKeyListener(cancel_key);
	}
	
	public void changeDatabaseUsername()
	{
		setTitle("Change Database Username");
		
		KeyListener btn_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ENTER)
				{
					readFile();
					if(new_database_username_password_tf.getText().equals(password))
					 {
						 database_uname = new_database_username_username_tf.getText();
						 createDatabaseFile();
						 addDatabaseRecords();
						 closeDatabaseFile();
						 dispose();
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"Incorrect Password");
					 }
				}
				else if(c==KeyEvent.VK_ESCAPE)
				{
					dispose();
				}
			}
		};
		
		KeyListener cancel_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ESCAPE || c==KeyEvent.VK_ENTER)
				{
					dispose();
				}
			}
		};
		
		JPanel new_database_username_panel = new JPanel();
		new_database_username_panel.setLayout(null);
		layeredPane.add(new_database_username_panel);
		
		JLabel new_database_username_username_lbl = new JLabel("New Username         : ");
		new_database_username_username_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		new_database_username_username_lbl.setBounds(45, 25, 146, 50);
		new_database_username_panel.add(new_database_username_username_lbl);
		
		JLabel newusername_password_lbl = new JLabel("Confirm Password    : ");
		newusername_password_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		newusername_password_lbl.setBounds(45, 70, 146, 50);
		new_database_username_panel.add(newusername_password_lbl);
		
		new_database_username_username_tf = new JTextField();
		new_database_username_username_tf.setBounds(212, 35, 180, 22);
		new_database_username_panel.add(new_database_username_username_tf);
		new_database_username_username_tf.setColumns(10);
		new_database_username_username_tf.addKeyListener(cancel_key);
		
		new_database_username_password_tf = new JTextField();
		new_database_username_password_tf.setBounds(212, 80, 180, 22);
		new_database_username_panel.add(new_database_username_password_tf);
		new_database_username_password_tf.setColumns(10);
		new_database_username_password_tf.addKeyListener(cancel_key);
		
		JButton new_database_username_btn = new JButton("Change Username");
		new_database_username_btn.setBounds(88, 131, 140, 23);
		new_database_username_panel.add(new_database_username_btn);
		new_database_username_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readFile();
				if(new_database_username_password_tf.getText().equals(password))
				 {
					 database_uname = new_database_username_username_tf.getText();
					 createDatabaseFile();
					 addDatabaseRecords();
					 closeDatabaseFile();
					 dispose();
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null,"Incorrect Password");
				 }
			}
		});
		new_database_username_btn.addKeyListener(btn_key);
		
		JButton new_database_username_cancel_btn = new JButton("Cancel");
		new_database_username_cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		new_database_username_cancel_btn.setBounds(262, 131, 130, 23);
		new_database_username_panel.add(new_database_username_cancel_btn);
		new_database_username_cancel_btn.addKeyListener(cancel_key);
	}
	
	public void changeDatabasePassword()
	{
		setTitle("Change Database Password");
		
		KeyListener btn_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ENTER)
				{
					readFile();
					if(new_database_password_newpassword_tf.getText().equals(password))
					 {
						 database_pass = new_database_password_oldpassword_tf.getText();
						 createDatabaseFile();
						 addDatabaseRecords();
						 closeDatabaseFile();
						 dispose();
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(null,"Incorrect Password");
					 }
				}
				else if(c==KeyEvent.VK_ESCAPE)
				{
					dispose();
				}
			}
		};
		
		KeyListener cancel_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ESCAPE || c==KeyEvent.VK_ENTER)
				{
					dispose();
				}
			}
		};
		
		JPanel new_database_password_panel = new JPanel();
		new_database_password_panel.setLayout(null);
		layeredPane.add(new_database_password_panel);
		
		JLabel new_database_password_oldpassword_lbl = new JLabel("Database Password    :");
		new_database_password_oldpassword_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		new_database_password_oldpassword_lbl.setBounds(45, 25, 146, 50);
		new_database_password_panel.add(new_database_password_oldpassword_lbl);
		
		JLabel new_database_password_newpassword_lbl = new JLabel("Confirm Password     :");
		new_database_password_newpassword_lbl.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		new_database_password_newpassword_lbl.setBounds(45, 69, 146, 50);
		new_database_password_panel.add(new_database_password_newpassword_lbl);
		
		new_database_password_oldpassword_tf = new JTextField();
		new_database_password_oldpassword_tf.setColumns(10);
		new_database_password_oldpassword_tf.setBounds(212, 35, 180, 22);
		new_database_password_panel.add(new_database_password_oldpassword_tf);
		new_database_password_oldpassword_tf.addKeyListener(cancel_key);
		
		new_database_password_newpassword_tf = new JTextField();
		new_database_password_newpassword_tf.setColumns(10);
		new_database_password_newpassword_tf.setBounds(212, 80, 180, 22);
		new_database_password_panel.add(new_database_password_newpassword_tf);
		new_database_password_newpassword_tf.addKeyListener(cancel_key);
		
		JButton new_database_password_btn = new JButton("Change Password");
		new_database_password_btn.setBounds(88, 131, 140, 23);
		new_database_password_panel.add(new_database_password_btn);
		new_database_password_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readFile();
				if(new_database_password_newpassword_tf.getText().equals(password))
				 {
					 database_pass = new_database_password_oldpassword_tf.getText();
					 createDatabaseFile();
					 addDatabaseRecords();
					 closeDatabaseFile();
					 dispose();
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null,"Incorrect Password");
				 }
			}
		});
		new_database_password_btn.addKeyListener(btn_key);
		
		JButton new_database_password_cancel_btn = new JButton("Cancel");
		new_database_password_cancel_btn.setBounds(262, 131, 130, 23);
		new_database_password_panel.add(new_database_password_cancel_btn);
		new_database_password_cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		new_database_password_cancel_btn.addKeyListener(cancel_key);
	}
	
	public JButton getLoginButton() {
		return login_btn;
	}
	
	public void readFile()
	{
		Scanner scan;
		try
		{
			scan = new Scanner(new File("C:\\Users\\jobal\\Desktop\\Data\\data2.lib"));
			username = scan.next();
			password = scan.next();
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null,"File that track record does not exist");
		}
	}
	
	public void createFile()
	{
		try 
		{
			x = new Formatter("C:\\Users\\jobal\\Desktop\\Data\\data2.lib");
		} 
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null,"Error");
		}
	}
	
	public void addRecords()
	{
		x.format("%s %s", username, password);
	}
	
	public void closeFile()
	{
		x.close();
	}
	
	public void createDatabaseFile()
	{
		try 
		{
			x1 = new Formatter("C:\\Users\\jobal\\Desktop\\Data\\data3.lib");
		} 
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null,"Error");
		}
	}
	
	public void addDatabaseRecords()
	{
		x1.format("%s %s", database_uname, database_pass);
	}
	
	public void closeDatabaseFile()
	{
		x1.close();
	}
}