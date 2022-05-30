package TestPackage;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chrome 2022\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(4500);
		
		//how to change dimension of
		
		Dimension d=new Dimension(300,600);
		driver.manage().window().setSize(d);
		//how to change position
		
		Thread.sleep(3500);
		
		Point p=new Point(350, 650);
		driver.manage().window().setPosition(p);
		
		driver.get("https://www.facebook.com/login.php");
		
		Thread.sleep(3500);
	
		String url=driver.getCurrentUrl();  //get url of current website
		System.out.println(url);
		
		Thread.sleep(3500);
		
		String title=driver.getTitle(); //get title of website
		System.out.println(title);
		
		Thread.sleep(3500);
		driver.close();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
