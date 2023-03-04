package stepdef;

import baseUtil.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoQuoteSteps extends BaseClass {

	@When("clickAuto")
	public void click_auto() {
		homePage.clickauto();
	}

	@When("insert first Name")
	public void insert_first_name() throws Exception {
		addressPage.insertFirstName();
	}

	@When("insert first Name {string}")
	public void insert_first_name(String firstname) throws Exception {
		addressPage.insertFirstName(firstname);
	}

	@Then("insert Last Name {string}")
	public void insert_last_name(String lastName) {
		addressPage.insertLastName(lastName);
	}

	@Then("insert Last Name")
	public void insert_last_name() {
		addressPage.insertLastName();

	}

	/*
	 * @Then("insert DOB {string}") public void insert_dob(String dob) {
	 * addressPage.insertCity(dob); }
	 */
	/*
	 * @Given("this is a quote test") public void this_is_a_quote_test() {
	 * Logs.log("***This is a background step***");
	 * 
	 * 
	 * }
	 */
}
