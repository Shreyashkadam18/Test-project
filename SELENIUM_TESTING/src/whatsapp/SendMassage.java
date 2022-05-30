package whatsapp;



	import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Date;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;



	   
	  

	public class SendMassage {
		public static void date(WebDriver driver) throws IOException {
			
			Date date=new Date();
			
			SimpleDateFormat f=new SimpleDateFormat("YYYY-MM-DD-hh-mm-ss");
			
			String time=f.format(date);
			
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dest=new File("D:\\SeleniumSS"+time+".jpg");
			
		    org.openqa.selenium.io.FileHandler.copy(source, dest);
		}
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "D:\\\\chrome 2022\\\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://web.whatsapp.com/");
		    
		    date(driver);
		    
		    Thread.sleep(50000);
		    System.out.println("process done");
		    WebElement search=driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		    search.click();
		    Thread.sleep(2000);
		   
		     date(driver);
		    
		     search.sendKeys("Omkar Veer");
		    search.click();
		   
		    Thread.sleep(2000);
		    date(driver);
		   
		    WebElement onkar=driver.findElement(By.xpath("//span[text()='Omkar Veer']"));
		    onkar.click();
		    Thread.sleep(2000);
		    WebElement sendmassage=driver.findElement(By.xpath("//div[@title='Type a message']"));
		    sendmassage.click();
		    Thread.sleep(2000);
		    sendmassage.sendKeys("this is automated massage");
		    Thread.sleep(2000);
		    WebElement send=driver.findElement(By.xpath("//button[@class='tvf2evcx oq44ahr5 lb5m6g5c svlsagor p2rjqpw5 epia9gcq']"));
		    send.click();
		   
		    date(driver);
		   
		
		    
		
		
		
		
		}

	}
