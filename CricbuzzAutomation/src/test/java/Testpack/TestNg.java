package Testpack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.Base;
import POM.PlayerSearch;
import POM.Ranking;
import POM.T20Leauges;
import Utilities.Utility;

public class TestNg {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName) {
		System.out.println(browserName);
		if(browserName.equals("Chrome")) {
			driver=Base.openChromeBrowser();
		}
		if(browserName.equals("MicrosoftEdge")) {
			driver=Base.openMicrosoftEdge();
		}
		if(browserName.equals("Opera")) {
			driver=Base.openOperaBrowser();
		}
	}
	
	@BeforeClass
	public void beforeClass() {
		//System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.cricbuzz.com");
	}
	
	@Test
	public void Ranking() throws IOException {
		int TestID=123;
		 Ranking ranking =new Ranking(driver);
	       ranking.ranking();
	       ranking.odi();
	       ranking.bowling();
	   //    Utility.CaptureScreenShot(TestID);
	    String url=   driver.getCurrentUrl();
	   String title=    driver.getTitle();
			
	}
	
	@Test
	public void playerSearch() throws IOException {
		int TestID=124;
		PlayerSearch playersearch=new PlayerSearch(driver);
		playersearch.search();
		playersearch.searchPlayer();
		playersearch.searchButton();
		playersearch.virat();
		// Utility.CaptureScreenShot(TestID);
		
	String url=	driver.getCurrentUrl();
  String	 title=	driver.getTitle();  
	 System.out.println(url); 
	 System.out.println(title);
	}
	
	@Test
	public void t20Leauges() throws IOException {
		int TestID=125;
		 T20Leauges t20leauges=new  T20Leauges(driver);
		 t20leauges.shedule();
		 t20leauges.t20leauges();
		 t20leauges.ipl();
		// Utility.CaptureScreenShot(TestID);
		 
		String url=	driver.getCurrentUrl();
	String	 title=	driver.getTitle();  
		// System.out.println(url); 
		// System.out.println(title);
		 
		 SoftAssert soft=new SoftAssert();
		 boolean result=url.equals("https://www.cricbuzz.com/cricket-series/4021/t20-blast-2022");
		 soft.assertTrue(result);
		 boolean result1=title.equals("T20 Blast 2022 matches, scorecards, preview, points table, news, videos and statistics | Cricbuzz.com");
		 soft.assertTrue(result1);
		 soft.assertAll();
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}

}

