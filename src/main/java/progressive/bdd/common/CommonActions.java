package progressive.bdd.common;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import progressive.bdd.reporting.Logs;
import static progressive.bdd.utils.IConstant.*;
import progressive.bdd.utils.ReadProperties;
import org.openqa.selenium.TimeoutException;

public class CommonActions {

	ReadProperties envProperties = new ReadProperties();
	public WebDriverWait wait;

	public CommonActions(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(envProperties.getNumberProperty(EXPLICIT_WAIT)));

	}

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Logs.log(element + "---has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---Element not Found");
			Assert.fail();
		}
	}

	public void validateText(WebElement element, String expected) {
		String actual = "";
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			actual = element.getText();
			Logs.log("Validiting---> Actual:***" + actual + "***.Expected:***" + expected + "***");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + "---Element not Found");
			Assert.fail();
		}
		Assert.assertEquals(actual, expected);
	}

	public void insert(WebElement element, String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
			Logs.log(value + " <--- This value has been passed into ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + " ---> Element Not Found");
			Assert.fail();

		}

	}

	

	 
}
