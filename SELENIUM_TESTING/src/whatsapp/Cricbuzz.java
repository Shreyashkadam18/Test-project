package whatsapp;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Cricbuzz {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.cricbuzz.com");
	    
//	    Thread.sleep(2000);
	//    WebElement rankings=driver.findElement(By.xpath("//a[text()='Rankings']"));
	  //rankings.click();
	  
	 // Thread.sleep(2000);
	 // WebElement odi=driver.findElement(By.xpath("//a[text()='ODI']"));
	  //odi.click();	    
	  
	 // Thread.sleep(2000);
	 // WebElement bowling=driver.findElement(By.xpath("//a[text()='Bowling']"));
	 // bowling.click();
	    
//	  Thread.sleep(2000);

	//  WebElement search=driver.findElement(By.xpath("//span[@class='cb-ico cb-search-input-icon cb-search-input-icon-nav']"));
	//  search.click();
	  
	//  Thread.sleep(2000);
	 // WebElement search1=driver.findElement(By.xpath("//input[@name='search']"));
	 // search1.sendKeys("Virat Kohli");
	  
	 // Thread.sleep(2000);
	 // WebElement search2=driver.findElement(By.xpath("//a[text()='SEARCH']"));
	 // search2.click();
	
	//  Thread.sleep(2000);
	//  WebElement virat=driver.findElement(By.xpath("//span[text()='Virat Kohli']"));
	//  virat.click();
	
	    
	//  Thread.sleep(2000);
	//  WebElement shedule=driver.findElement(By.xpath("//a[text()='Schedule']"));
	//  shedule.click();
	
	  
	//  Thread.sleep(2000);
	//  WebElement t20leauges=driver.findElement(By.xpath("//a[text()='T20 Leagues']"));
	//  t20leauges.click();
	    
	  
	//  Thread.sleep(2000);
	//  WebElement ipl=driver.findElement(By.xpath("(//a[text()='Indian Premier League 2022'])[2]"));
	//  ipl.click();
	    
	
	//    System.out.println("end");
	    
	    Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(2))
	            .ignoring(Exception.class);
	    
	    WebElement ele1= fwait.until(new Function<WebDriver,WebElement>(){
	    	public WebElement apply(WebDriver driver)
	    	{
	    		return driver.findElement(By.xpath("//a[text()='Ranking']"));
	    	}
	    });
	    
	}

}
