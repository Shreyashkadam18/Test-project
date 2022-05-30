package TestPackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouce_action_practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		//Thread.sleep(2500);
		//WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		//Actions act=new Actions(driver);
		//act.click(close).perform();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement image=driver.findElement(By.xpath("(//img[@id='drag1'])[1]"));
		WebElement drop=driver.findElement(By.xpath("(//div[@id='div2'])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(image, drop).perform();
		
		//Actions act=new Actions(driver);
		//act.click();
		//act.doubleClick();
		//act.contextClick();
		//act.moveToElement(null);
		//act.dragAndDrop(null, null);
		//act.build();
		//act.perform();
	
	}

}
