package tools;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;


public class QuickResponseCode
{
	static String location;
	
	public static void setLocation(String loc)
	{
		location = loc;
	}
	
	@SuppressWarnings("resource")
	public void generateQR(String qr_name, String location, String detail, String ... str) throws Exception
	{
		String details = detail;
		
		for(String string : str)
		{
			details = details + "\n" + string;
		}
		
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();
		
		File f = new File("C:\\QR_Codes" + qr_name + ".jpg");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
	}
}
