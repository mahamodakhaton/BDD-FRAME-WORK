package progressive.bdd.objects;

import progressive.bdd.common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	CommonActions actions;

	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);

	}

	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_FirstName")
	WebElement inputFirstNamElement;

	public void insertFirstName(String name) throws Exception {
		actions.insert(inputFirstNamElement, name);

	}

	@FindBy(name = "NameAndAddressEdit_embedded_questions_list_LastName")
	WebElement inputLastNamElement;

	public void insertLastName(String name) {
		actions.insert(inputLastNamElement, name);
	}

	@FindBy(name = "NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	WebElement inputDOBElement;

	public void insertDOB(String DOB) {
		actions.insert(inputDOBElement, DOB);

	}

	@FindBy(name = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
	WebElement insertStreenNumberandName;

	public void insertStreetNumberandName(String Number) {
		actions.insert(insertStreenNumberandName, Number);

	}

	@FindBy(xpath = "(//div[@class='placeholder'])[6]")
	WebElement apartmentNumber;

	public void insertapartmentNumber(String number) {
		actions.insert(apartmentNumber, number);

	}

	@FindBy(xpath = "//input[@name='SingleLineAddressSearch']")
	WebElement insertAddressElement;

	public void insertAddressElement(String Number) {
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		// wait.until(ExpectedConditions.elementToBeClickable(insertAddressElement));
		actions.insert(insertAddressElement, Number);

	}

	@FindBy(xpath = "(//input[@name='paButton'])[1]")
	WebElement letsGo;

	public void clickLetsGo() {
		actions.click(letsGo);
	}

	@FindBy(xpath = "(//input[@name='AddressLine1'])[2]")
	WebElement insertPropertyAddress;

	public void insertPropertyAddress(String number) {
		actions.insert(insertPropertyAddress, number);
	}

	@FindBy(xpath = "//input[@id='addressLine2Modal']")
	WebElement insertApartmentNumber;

	public void insertApartmentNumber(String number) {
		actions.insert(insertApartmentNumber, number);
	}

	@FindBy(xpath = "//input[@id='cityModal']")
	WebElement insertCity;

	public void insertCity(String name) {
		actions.insert(insertCity, name);

	}

	@FindBy(id = "paModalButton")
	WebElement ContinueBtn;

	public void clickContinueBtn() {
		actions.click(ContinueBtn);
	}

	public void insertFirstName() {
		
	}

	public void insertLastName() {
		
	}

}
