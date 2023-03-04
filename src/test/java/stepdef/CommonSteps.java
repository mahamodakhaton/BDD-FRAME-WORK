package stepdef;
import progressive.bdd.reporting.Logs;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends BaseClass {
	@Given("this is a quote test")
	public void this_is_a_quote_test() {
		Logs.log("***This is a background step***");
		
	    
	}
	@Given("validate homePage Text {string}")
	public void validate_home_page_text(String string) {
		homePage.validatehomePageText("Welcome to Progressive");

}
	
	@When("insert ZipcodeField {string}")
	public void insert_zipcode_field(String zipcode) {
		homePage.insertZipCodeField(zipcode);
	   
	}

	@When("Get a Quote")
	public void get_a_quote() {
	   homePage.getAQuote();
	}
}