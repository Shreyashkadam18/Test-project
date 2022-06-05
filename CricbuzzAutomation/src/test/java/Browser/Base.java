package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public static WebDriver openChromeBrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\chrome 2022\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		return driver;
	}
	
	
	public static WebDriver openMicrosoftEdge() {
		System.setProperty("webdriver.edge.driver","D:\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
	}
	
	public static WebDriver openOperaBrowser() {
		System.setProperty("webdriver.opera.driver","D:\\operadriver_win32\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
	}
	

}
