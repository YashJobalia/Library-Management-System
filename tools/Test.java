package tools;


public class Test
{
	public static void main(String[] args) throws Exception
	{
		QuickResponseCode qr = new QuickResponseCode();
		qr.generateQR("Sonal", "User ID", "First Name : Sonal", "Middle Name : Hitesh", "Last Name : Jobalia", "DOB : 22/09/1972", "Age : 47");
	}
}
