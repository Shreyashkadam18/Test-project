package TestPackage;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waiting_types {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
		//implicite waite 0+10
	
	System.out.println("start");
	//	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
//	WebElement close=	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4']"));
	
	//close.click();
//	WebElement el2=	  driver.findElement(By.xpath("(//a[text()='Customer Servic'])[1]"));
		  
//	WebElement el3=	  driver.findElement(By.xpath("//table//tr//td"));
		
		
		
		//Explicite waite=waiting time+condition
	//    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//	WebElement close=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
		
	//	close.click();
		
	//	fluent wait=  waiting time + conditions + Frequency 
	
	 Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(2))
	            .ignoring(Exception.class);
	    
	    WebElement ele1= fwait.until(new Function<WebDriver,WebElement>(){
	    	public WebElement apply(WebDriver driver)
	    	{
	    		return driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    	}
	    });
	
	}

}
