package baseUtil;

import static progressive.bdd.utils.IConstant.*;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import progressive.bdd.common.CommonActions;
import progressive.bdd.objects.AddressPage;
import progressive.bdd.objects.GetAQuotePage;
import progressive.bdd.objects.HomePage;
import progressive.bdd.utils.ReadProperties;

public class BaseClass {

	public static WebDriver driver;
	ReadProperties envVar = new ReadProperties();
	public static HomePage homePage;
	public static AddressPage addressPage;
	public static GetAQuotePage getAQuotePage;

	public void setUpDriver(String browserName) {

		// String browserName = envVar.getProperty (getString(BROWSER));

		// String browserName = envVar.getPropertie(BROWSER);
		initDriver(browserName);
		initclass(driver);
		String url = envVar.getProperties(URL);
		driver.get(url);
		long pageloadWait = envVar.getNumberProperty(PAGELOAD_WAIT);
		long implicitWait = envVar.getNumberProperty(IMPLICIT_WAIT);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageloadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		
	}

	public void initclass(WebDriver driver) {
		homePage = new HomePage(driver);
		addressPage = new AddressPage(driver);
		getAQuotePage = new GetAQuotePage(driver);
	}

	public void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			break;

		}
	}

	public void teareUp() {
		driver.quit();
	}

	

}
