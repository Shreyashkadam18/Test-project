package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.PlayerSearch;
import POM.Ranking;
import POM.T20Leauges;

public class TestClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome 2022\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

       Ranking ranking =new Ranking(driver);
       ranking.ranking();
       ranking.odi();
       ranking.bowling();
       
    String url=   driver.getCurrentUrl();
   String title=    driver.getTitle();
		Assert.assertEquals(url,"https://www.cricbuzz.com/cricket-stats/icc-rankings/men/bowling"  );
		Assert.assertEquals(title,"ICC Player Ranking | Men's Ranking | Top 100 Bowler | Cricbuzz.com");
	//	if(url.equals("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/bowling")  && title.equals("ICC Player Ranking | Men's Ranking | Top 100 Bowler | Cricbuzz.com")) {
	//		System.out.println("pass");
	//	}
	//	else {
	//		System.out.println("fail");
	//	}
		
		PlayerSearch playersearch=new PlayerSearch(driver);
		playersearch.search();
		playersearch.searchPlayer();
		playersearch.searchButton();
		playersearch.virat();
		
		
	 url=	driver.getCurrentUrl();
	 title=	driver.getTitle();  
	 System.out.println(url); 
	 System.out.println(title);
	 
	 if(url.equals("https://www.cricbuzz.com/profiles/1413/virat-kohli") && title.equals("Virat Kohli Profile - ICC Ranking, Age, Career Info & Stats | Cricbuzz.com")) {
	 System.out.println("pass");
	 }
	 else {
		 System.out.println("fail");
	 }
	 
	 T20Leauges t20leauges=new  T20Leauges(driver);
	 t20leauges.shedule();
	 t20leauges.t20leauges();
	 t20leauges.ipl();
	
	 
	 url=	driver.getCurrentUrl();
	 title=	driver.getTitle();  
	// System.out.println(url); 
	// System.out.println(title);
	 
	 SoftAssert soft=new SoftAssert();
	 boolean result=url.equals("https://www.cricbuzz.com/cricket-series/4021/t20-blast-2022");
	 soft.assertTrue(result);
	 boolean result1=title.equals("T20 Blast 2022 matches, scorecards, preview, points table, news, videos and statistics | Cricbuzz.com");
	 soft.assertTrue(result1);
	 soft.assertAll();
	 
	 
	}

}
