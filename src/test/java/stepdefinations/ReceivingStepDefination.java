package stepdefinations;

import org.junit.Assert;

import businessLayer.Receiving;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import rfclientModule.RFClient;

public class ReceivingStepDefination {

	RFClient rfClient = new RFClient();
	Receiving receivingASN = new Receiving();

	@Given("^User is on the RF screen$")
	public void user_is_on_the_RF_screen() {

		rfClient.register();

	}

	@When("^User enter the (.*) in the ASN field$")
	public void user_enter_the_in_the_ASN_field(String ASN) {
		receivingASN.setASN(ASN);
		System.out.println("ASN receive intiated for : " + receivingASN.getASN());
	}

	@Then("^User needs to enter the item details$")
	public void user_needs_to_enter_the_item_details() {
		receivingASN.enterItemDetails();
	}

	@When("^User enter the \"([^\"]*)\"$")
	public void user_enter_the(String item_bar_code) {

		System.out.println("Entering the item barcode as : " + item_bar_code);
		receivingASN.setItem_bar_code(item_bar_code);

		System.out.println("Item barcode for the item to be received: " + receivingASN.getItem_bar_code());

	}

	@When("^User move to the next screen$")
	public void user_move_to_the_next_screen() {
		System.out.println("User is on the item qty screen now !");

	}

	@Then("^User is requested to enter the item quantity$")
	public void user_is_requested_to_enter_the_item_quantity() {
		System.out.println("User is requested to enter the item qty");

	}

	@When("^User enter the quanity as \"([^\"]*)\"$")
	public void user_enter_the_quanity_as(String quantity) {

		System.out.println("User is entering the qty as:" + quantity);
		receivingASN.setQty(Integer.parseInt(quantity));

	}

	@Then("^the received quanity is incremented with the \"([^\"]*)\"$")
	public void the_received_quanity_is_incremented_with_the(String received_quantity) {

		System.out.println("The received qty is expected to be :" + Integer.parseInt(received_quantity));
		System.out.println("The actual recived qty is: " + receivingASN.getReceived_qty());

		Assert.assertTrue("The expected and recevied qty for the ASN: " + receivingASN.getASN() + " is not equal",
				receivingASN.getReceived_qty() == Integer.parseInt(received_quantity));

	}

}
