package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	static WebDriver driver;
	public static void CaptureScreenShot(int TestID) throws IOException {
  
		Date date=new Date();
   SimpleDateFormat d=new SimpleDateFormat("DD-MM-YYYY-hh-mm-ss");
		String time=d.format(date);
		File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File dest=new File("E:\\Selenium screenshot"+time+TestID+".jpg");
	     
	     
	     FileHandler.copy(sourse, dest);
	}
	
	public static void GetDataFromExelSheet() {
		
	}


}
