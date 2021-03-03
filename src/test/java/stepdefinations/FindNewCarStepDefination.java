package stepdefinations;

import java.util.Iterator;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindNewCarStepDefination {

	@Given("^User launches the website using the browser$")
	public void user_launches_the_website_using_the_browser() {

		System.out.println("Step: User is launching the browser");
		System.out.println("Step: User is opening the application URL in the browser");

	}

	@When("^User selects the \"([^\"]*)\" option in the \"([^\"]*)\" menu$")
	public void user_selects_the_option_in_the_menu(String option, String menuOption) {

		System.out.println("User selects the menu option as : " + menuOption);
		System.out.println("User selects the option as " + option + " under the menu option " + menuOption);

	}

	@Then("^All the brands are displayed to the user$")
	public void all_the_brands_are_displayed_to_the_user() {

		System.out.println("All the car brands are displayed to the user");

	}

	@When("^User selects the brand of the car as (.*)$")
	public void user_selects_the_brand_of_the_car_as(String carBrand) {

		System.out.println("User selects the car brand as :" + carBrand);
	}

	@Then("^User is displayed all the related cars of the brand selected$")
	public void user_is_displayed_all_the_related_cars_of_the_brand_selected() {
		System.out.println("All the cars related to the selected brands are displayed");

	}

	@Then("^All the menu options are displayed to the user$")
	public void all_the_menu_options_are_displayed_to_the_user(List<String> menuOptions) {
		
		Iterator<String> it = menuOptions.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
	
	@When("^User selects the budget as \"([^\"]*)\"$")
	public void user_selects_the_budget_as(String budget) {
	 
		System.out.println("User selected the budget as : "+budget);
	}

}
