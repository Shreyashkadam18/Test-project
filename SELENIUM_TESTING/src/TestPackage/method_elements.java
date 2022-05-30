package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method_elements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/login.php");
	    Thread.sleep(3500);
	    WebElement user= driver.findElement(By.xpath("//input[@type='text']"));
	  user.sendKeys("shreyash.kadam.35");
	  Thread.sleep(3500);
	 
	 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	 password.sendKeys("kadam18333007");
	 Thread.sleep(3500);
	WebElement login=driver.findElement(By.xpath("//button[@value='1']"));
	login.click();
	Thread.sleep(3500);
	WebElement yourProfile=driver.findElement(By.xpath("(//Span[@class='tojvnm2t a6sixzi8 abs2jz4q a8s20v7p t1p8iaqh k5wvi7nf q3lfd5jv pk4s997a bipmatt0 cebpdrjk qowsmv63 owwhemhu dp1hu0rb dhp61c6y iyyx5f41'])[7]"));
	yourProfile.click();
	Thread.sleep(3000);
	WebElement logout=driver.findElement(By.xpath("(//span[@dir='auto'])[9]"));
	logout.click();
	WebElement profile=driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	profile.click();
	driver.close();
	}

}
