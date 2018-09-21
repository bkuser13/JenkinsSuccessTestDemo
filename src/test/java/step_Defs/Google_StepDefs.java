package step_Defs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.*;
import pages.GoogleHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Google_StepDefs {
	GoogleHomePage gPage = new GoogleHomePage();

	@Given("the user is on Google home Page")
	public void the_user_is_on_Google_home_Page() {
		System.out.println("The user is navigates to Home Page");
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Title of the Page: "+Driver.getDriver().getTitle());
	}

	@When("the user enters {string} and hits search button")
	public void the_user_enters_and_hits_search_button(String string) {
		
		System.out.println("The user is Searching for Iphone X");
		gPage.searchBox.sendKeys("Iphone Xs"+Keys.ENTER);
//		gPage.searchButton.click();

	}

	@Then("the user should able to see the result of the search")
	public void the_user_should_able_to_see_the_result_of_the_search() {
		System.out.println("The title of the Result Page: "+Driver.getDriver().getTitle());
		System.out.println("Total result: "+gPage.resultCount.getText());
		System.out.println("The price for the phone is: "+gPage.price.getText());
		
	}

}
