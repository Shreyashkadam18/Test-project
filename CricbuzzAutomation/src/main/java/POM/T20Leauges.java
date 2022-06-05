package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T20Leauges {

	@FindBy (xpath="//a[text()='Schedule']") 
	private WebElement shedule;
	
	@FindBy (xpath="//a[text()='T20 Leagues']") 
	private WebElement t20leauges;
	
	@FindBy (xpath="(//a[text()='T20 Blast 2022'])[2]") 
	private WebElement ipl;
	
	public T20Leauges(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void shedule() {
		shedule.click();
	}
	
	public void t20leauges() {
		t20leauges.click();
	}
	
	public void ipl() {
		ipl.click();
	}
	
	
}
