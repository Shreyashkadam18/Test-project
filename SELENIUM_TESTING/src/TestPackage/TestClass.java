package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome 2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3500);     //to delay process by 3.5 sec
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3500);
		driver.navigate().to("https://www.facebook.com/login.php");
		Thread.sleep(3500);
		driver.navigate().back(); //return to flipcart
		Thread.sleep(3500);
		driver.navigate().forward(); // again to facebook
		Thread.sleep(3500);
		driver.navigate().refresh();
		Thread.sleep(3500);
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
		Thread.sleep(3500);
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.get("https://www.cricbuzz.com/live-cricket-scores/46031/30th-match-indian-premier-league-2022");
		driver.manage().window().minimize();//not available in older java version
		Thread.sleep(2500);
		driver.manage().window().maximize();
		
		
	}

}
