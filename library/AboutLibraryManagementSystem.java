package library;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AboutLibraryManagementSystem extends JDialog 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	public AboutLibraryManagementSystem() 
	{
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		setSize(490, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(8, 62, 456, 2);
			contentPanel.add(separator);
		}
		{
			JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
			lblLibraryManagementSystem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblLibraryManagementSystem.setBounds(8, 11, 456, 40);
			lblLibraryManagementSystem.setHorizontalAlignment(JLabel.CENTER);
			contentPanel.add(lblLibraryManagementSystem);
		}
		{
			JLabel lblNewLabel = new JLabel("A Library Management System is a software, designed to manage the working and the");
			lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 11));
			lblNewLabel.setBounds(8, 75, 456, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("functions of a library. It helps in managing the entire asset that are kept in the library.");
			lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 11));
			lblNewLabel_1.setBounds(8, 95, 456, 14);
			contentPanel.add(lblNewLabel_1);
		}
		
		JLabel lblItAlsoManages = new JLabel("It also manages details regarding its members. It keeps a track record of all the books");
		lblItAlsoManages.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		lblItAlsoManages.setBounds(10, 115, 454, 14);
		contentPanel.add(lblItAlsoManages);
		
		JLabel lblThatAreAvailable = new JLabel("that are available in the library. The Library Management System can be used at any");
		lblThatAreAvailable.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		lblThatAreAvailable.setBounds(8, 135, 456, 14);
		contentPanel.add(lblThatAreAvailable);
		
		JLabel lblAsSchoolsColleges = new JLabel("place such as schools, colleges, etc for easily managing the library and keeping track of");
		lblAsSchoolsColleges.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		lblAsSchoolsColleges.setBounds(8, 155, 456, 14);
		contentPanel.add(lblAsSchoolsColleges);
		{
			JLabel lblEachAndEvery = new JLabel("each and every related activities.");
			lblEachAndEvery.setFont(new Font("Sitka Text", Font.PLAIN, 11));
			lblEachAndEvery.setBounds(8, 175, 456, 14);
			contentPanel.add(lblEachAndEvery);
		}
		JLabel lbl_libms_author = new JLabel("Author : Yash Jobalia");
		lbl_libms_author.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		lbl_libms_author.setBounds(336, 195, 120, 14);
		contentPanel.add(lbl_libms_author);
		
		KeyListener key_btn = new KeyListener()
		
		{
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(c==KeyEvent.VK_ENTER || c==KeyEvent.VK_ESCAPE)
				{
					dispose();
				}
			}
			public void keyPressed(KeyEvent e){}
			public void keyReleased(KeyEvent e){}
		};
		
		ActionListener btn = new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					dispose();
				}
			};
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				buttonPane.add(okButton);
				okButton.addKeyListener(key_btn);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(btn);
				okButton.addKeyListener(key_btn);
				
			}
			
		}
	}
}
