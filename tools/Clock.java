package tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clock extends Thread
{
	private JPanel panel;
	private JLabel date, time;
	
	public void clock(JPanel panel, JLabel date, JLabel time)
	{
		this.panel = panel;
		this.date = date;
		this.time = time;
		start();
	}
	
	public void run()
	{
		while(true) 
		{
			Date d = new Date();
			SimpleDateFormat dateformat1 = new SimpleDateFormat("dd/MM/YYYY");
			
			date.setText(dateformat1.format(d));
			time.setText(DateFormat.getTimeInstance().format(d));
			panel.add(date);
			panel.add(time);
			
			try 
			{
				sleep(1000);
			}
			catch (InterruptedException e) {}
		}
	}
}
