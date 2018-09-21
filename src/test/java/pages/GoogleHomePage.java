package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class GoogleHomePage {

	private WebDriver driver;
	
	public GoogleHomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@name='q']")
	public WebElement searchBox;
	
	@FindBy(xpath="(//input[@value='Google Search'])[1]")
	public WebElement searchButton;
	
	@FindBy(xpath="//div[@id='resultStats']")
	public WebElement resultCount;
	
	@FindBy(xpath="(//div[@class='gkMlQe'])[2]")
	public WebElement price;
	
}
