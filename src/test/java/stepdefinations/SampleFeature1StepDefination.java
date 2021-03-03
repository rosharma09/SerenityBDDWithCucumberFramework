package stepdefinations;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleFeature1StepDefination {

	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() {
		System.out.println("User is on the login page");
	}

	@When("^User enter the username and password$")
	public void user_enter_the_username_and_password(List<String> credentials) {

		System.out.println(credentials);

	}

	@When("^Click on the login button$")
	public void click_on_the_login_button() {
		System.out.println("Click on the login button");
	}

	@Then("^User can see the following options on the home page$")
	public void user_can_see_the_following_options_on_the_home_page(List<String> optionsDisplayed) {
		System.out.println(optionsDisplayed);
	}

}
