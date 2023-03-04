package progressive.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import progressive.bdd.common.CommonActions;

public class GetAQuotePage {
	CommonActions actions;
	public GetAQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);

	}

	@FindBy(id = "//input[@id='H']")
	WebElement homeOwnersElement;

	public void clickHomeOwnersElement(WebElement string) {
		actions.click(homeOwnersElement);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement ZipCodField;
	

	public void insertZipCodeField(String zip) {
		actions.insert(ZipCodField,zip);
	}

	@FindBy(xpath = "//input[@id='qsButton_overlay_subproducts']")
	WebElement GetAQuotElement;

	public void clickgetAQuote() {
		actions.click(GetAQuotElement);
	}

}
