package stepdefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundFeatureStepDefn {
	
	
	/**
	 * We can define the hooks in the step defination 
	 */
	
	/*
	 * @Before public void setup() { System.out.println("Setting up the browser");
	 * System.out.println("Setting up the connection with the DB"); }
	 * 
	 * 
	 * @After public void tearDown() { System.out.println("Closing the browser");
	 * System.out.println("Closing the connection with the DB"); }
	 */
	
	@Given("^User launch the website using the browser$")
	public void user_launch_the_website_using_the_browser() {

	}

	@When("^User enter the username$")
	public void user_enter_the_username() {

	}

	@When("^User enter the password$")
	public void user_enter_the_password() {

	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() {

	}

	@Then("^Profile icon is displayed$")
	public void profile_icon_is_displayed() {

	}

	@Then("^Menu options are displayed$")
	public void menu_options_are_displayed() {

	}

}
