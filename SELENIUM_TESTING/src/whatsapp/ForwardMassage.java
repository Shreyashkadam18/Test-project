package whatsapp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForwardMassage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://web.whatsapp.com/");
		    
	        Thread.sleep(55000);
		    System.out.println("process done");
		    WebElement search=driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		    search.click();
		    Thread.sleep(2000);
		    search.sendKeys("Nikhil Karape");
		    search.click();
		    Thread.sleep(2000);
		   
		   
		    WebElement nikhil=driver.findElement(By.xpath("(//span[text()='Nikhil Karape'])[2]"));
		    nikhil.click();
		    Thread.sleep(2000);
		    
		  
		    
		    WebElement moveToMassage=driver.findElement(By.xpath("//div[@class='_1Gy50']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(moveToMassage);
		   
		    
		    System.out.println("moved to massage good night");
		    moveToMassage.click();
		    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement select=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-icon='down-context']")));
		    
		 //   WebElement select=driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		      act.moveToElement(select);
		      System.out.println("move to select arrow");
		    
		       boolean result= select.isDisplayed();
		       
		       if(result==true) {
		    	   select.click();
		    	   System.out.println("massage is selected");
		    	  
		    	  
		       }
		       else {
		    	   System.out.println("massage is not selected");
		       }
		       
		       WebElement forwardMassagd=driver.findElement(By.xpath("//div[text()='Forward message']"));
		       forwardMassagd.click();
				   System.out.println("forward massage selected");
				   
				   
				   WebElement forwardButton=driver.findElement(By.xpath("//span[@data-testid='forward']"));
				   forwardButton.click();
					   System.out.println("Forward massage button selected");
					   
					   WebElement serch=driver.findElement(By.xpath("(//div[@title='Search input textbox'])[1]"));
					   serch.click();
					   serch.sendKeys("omkar veer");
					   
					   WebElement ForeardMassageTo=driver.findElement(By.xpath("//span[text()='Omkar Veer']"));
					   ForeardMassageTo.click();
					   
					   WebDriverWait wait1=new  WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement forward1= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='button'])[1]")));
					  
					        forward1.click();
		    
		   
	
	
	}

}
