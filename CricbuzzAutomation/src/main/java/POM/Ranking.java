package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ranking {

	@FindBy (xpath="//a[text()='Rankings']") 
	private WebElement ranking;
	
	@FindBy (xpath="//a[text()='ODI']") 
	private WebElement odi;
	
	@FindBy (xpath="//a[text()='Bowling']") 
	private WebElement bowling;
	
	public	Ranking(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public void ranking(){
		ranking.click();
	}
	
    public void odi(){
		odi.click();
	}


    public void bowling(){
	bowling.click();
}
	
}
