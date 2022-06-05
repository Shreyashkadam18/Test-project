package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayerSearch {

	@FindBy (xpath="//span[@class='cb-ico cb-search-input-icon cb-search-input-icon-nav']") 
	private WebElement search;
	
	@FindBy (xpath="//input[@name='search']") 
	private WebElement searchPlayer;
	
	
	@FindBy (xpath="//a[text()='SEARCH']") 
	private WebElement searchButton;
	
	
	@FindBy (xpath="//span[text()='Virat Kohli']") 
	private WebElement virat;
	
	public PlayerSearch(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void search() {
		search.click();
	}
	
   public void searchPlayer() {
	   searchPlayer.sendKeys("Virat Kohli");
	}
	
   public void searchButton() {
	   searchButton.click();
	}
	
    public void virat() {
    	virat.click();
    }

}
