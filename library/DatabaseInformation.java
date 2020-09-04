package library;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.CardLayout;

public class DatabaseInformation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EnterIpAddress_tf, EnterPort_tf;
	private JLayeredPane layeredPane;
	private Formatter x;
	private String ip, port;

	public DatabaseInformation() 
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(343, 144);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 327, 105);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
	}
	
	public void setIPAddress(javax.swing.JFrame frame)
	{
		readFile();
		
		JPanel ipaddress_panel = new JPanel();
		ipaddress_panel.setLayout(null);
		layeredPane.add(ipaddress_panel);
		
		JLabel EnterIpAddress_lbl = new JLabel("Enter IP Address   : ");
		EnterIpAddress_lbl.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		EnterIpAddress_lbl.setBounds(29, 35, 108, 35);
		ipaddress_panel.add(EnterIpAddress_lbl);
		
		EnterIpAddress_tf = new JTextField();
		EnterIpAddress_tf.setBounds(147, 38, 150, 27);
		ipaddress_panel.add(EnterIpAddress_tf);
		EnterIpAddress_tf.setColumns(10);
		EnterIpAddress_tf.setText(ip);
		
		KeyListener ip_key = new KeyListener()
		{
			public void keyTyped(KeyEvent e){}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ENTER)
				{
					ip = EnterIpAddress_tf.getText();
					
					createFile();
					addRecords();
					closeFile();
					
					dispose();
					frame.dispose();
					new LibraryManagementSystem();
				}
				if(c==KeyEvent.VK_ESCAPE)
				{
					dispose();
				}
			}
		};
		EnterIpAddress_tf.addKeyListener(ip_key);
	}
	
	public void setPort(javax.swing.JFrame frame) 
	{
		readFile();
		
		JPanel port_panel = new JPanel();
		port_panel.setLayout(null);
		layeredPane.add(port_panel);
		
		JLabel EnterPort_lbl = new JLabel("Enter Port No.     : ");
		EnterPort_lbl.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		EnterPort_lbl.setBounds(29, 35, 108, 35);
		port_panel.add(EnterPort_lbl);
		
		EnterPort_tf = new JTextField();
		EnterPort_tf.setBounds(147, 38, 150, 27);
		port_panel.add(EnterPort_tf);
		EnterPort_tf.setColumns(10);
		EnterPort_tf.setText(port);
		
		KeyListener port_key = new KeyListener()
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
			public void keyReleased(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ENTER)
				{
					port = EnterPort_tf.getText();
					
					createFile();
					addRecords();
					closeFile();
					
					dispose();
					frame.dispose();
					new LibraryManagementSystem();
				}
				else if(c==KeyEvent.VK_ESCAPE)
				{
					dispose();
				}
			}
		};
		EnterPort_tf.addKeyListener(port_key);
	}
	
	public void readFile()
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
	
	public void createFile()
	{
		try 
		{
			x = new Formatter("C:\\Users\\jobal\\Desktop\\Data\\data4.lib");
		} 
		catch (FileNotFoundException e) 
		{
			JOptionPane.showMessageDialog(null,"Error");
		}
	}
	
	public void addRecords()
	{
		x.format("%s %s", ip, port);
	}
	
	public void closeFile()
	{
		x.close();
	}
}
