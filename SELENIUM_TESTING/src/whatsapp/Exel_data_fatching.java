package whatsapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exel_data_fatching {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
		
	//	WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.flipkart.com/");
		
	//	WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	//	close.click();
		
    	String path="C:\\Users\\Dell\\OneDrive\\Desktop\\velocitycls.xlsx";
		FileInputStream file=new FileInputStream (path);
		   String text= String.valueOf(  WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue());
	        
		  
		   System.out.println(text);
	
	//	WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		//search.sendKeys(text);
		
	//	WebElement searchbutton=driver.findElement(By.xpath("//button[@type='submit'"));
	//	searchbutton.click();
	
	}

}
