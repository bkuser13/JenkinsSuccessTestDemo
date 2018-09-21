package step_Defs;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Example_StepDefs extends TestBase{

	WebDriver driver = Driver.getDriver();
	
	@When("the user launches on {string}")
	public void the_user_launches_on(String str) {

		
		System.out.println("the user is navigating to home page");
		
		driver.get(ConfigReader.getProperty("url"));
	}

	@Then("the user should see the title of the page")
	public void the_user_should_see_the_title_of_the_page() {
		
		System.out.println("the user can see the title of the page: "+ driver.getTitle());
		
	}
}
