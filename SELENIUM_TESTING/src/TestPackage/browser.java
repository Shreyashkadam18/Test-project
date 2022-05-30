package TestPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class browser {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   // driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	     //WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	      //month.click();
	   //   Select s=new Select(month);
	     // s.selectByIndex(2);  //march
	    // s.selectByValue("3");
	 //   s.selectByVisibleText("Mar");
	    // File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      //File dest=new File("D:\\SeleniumScreenShot\\test489.jpg");
	      //FileHandler.copy(sourse, dest);
	    
	    driver.get("https://mahadbtmahait.gov.in/SchemeData/SchemeData?str=E9DDFA703C38E51AD0CCA04E9F6D7EE4");
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("window.scrollBy(0,450)");
	}

}
