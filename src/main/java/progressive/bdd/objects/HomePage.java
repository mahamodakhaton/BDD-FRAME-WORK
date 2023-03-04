package progressive.bdd.objects;

import progressive.bdd.common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	CommonActions actions;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	public void homePageTitle(String expectedTitle) {
		homePageTitle(expectedTitle);
	}

	@FindBy(tagName = "h1")
	WebElement homepageText;

	public void validatehomePageText(String string) {
		homepageText.getText();
	}

	//@FindBy(xpath = "(//span[@class='img'])[1]")
	@FindBy(xpath = "(//span[text()='Auto'])[1] | //p[@class='txt' and normalize-space(text())='Auto']")
	WebElement auto;
	

	public void clickauto() {
		actions.click(auto);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	WebElement insertzipCodeField;

	public void insertZipCodeField(String Zip) {
		actions.insert(insertzipCodeField, Zip);
	}

	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	WebElement getAQuote;

	public void getAQuote() {
		actions.click(getAQuote);

	}

	@FindBy(xpath = "(//span[@class='last-word'])[2]")
	WebElement propertyElement;

	public void clickPropertyElement() {
		actions.click(propertyElement);
	}

	

}
