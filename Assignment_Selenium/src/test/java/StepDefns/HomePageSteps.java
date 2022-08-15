package StepDefns;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	HomePage hpage = new HomePage(DriverFactory.getDriver());


	@Given("the user launches the application")
	public void the_user_launches_the_application() {
		hpage.launchURL(ApplnHooks.prop.getProperty("url"));

	}


	@Given("the user verifies the header")
	public void the_user_verifies_the_header() {
		Assert.assertTrue(hpage.getheaderMessage().contains("To Do App"));

	}

	@When("the user enters {string} task")
	public void the_user_enters_task(String string) {
		hpage.entertoDoInput(string);
	}

	@When("the user clicks on add button")
	public void the_user_clicks_on_add_button() {
		hpage.addButtonClick();
	}

	@Then("the user verifies the list count as {int}")
	public void the_user_verifies_the_list_count_as(int count)  {
		
		System.out.print(hpage.lengthofList());
		Assert.assertTrue(hpage.lengthofList()==count);
	}

	@When("the user clicks on clear all button")
	public void the_user_clicks_on_clear_all_button() {
		hpage.clearButtonClick();
	}

	@Then("the user verifies the empty list")
	public void the_user_verifies_the_empty_list() {
		Assert.assertTrue(hpage.lengthofList()==0);
		
	}

}
