package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class StoreInformation {

	private WebDriver driver;
	pageHome home;
	SoftAssert sa = new SoftAssert();
	
	@BeforeClass
	public void BeforeClass() {
		home = new pageHome(driver);
		driver = home.DriverConnection();
		home.max();
		home.visit("http://automationpractice.com/index.php");
		
	}

	@Test
	public void f() {
		home.scrollFooter(driver, home.storeInformation(1));
		sa.assertEquals("Selenium Framework, Research Triangle Park, North Carolina, USA", home.Text(home.storeInformation(1)));
		sa.assertEquals("Call us now: (347) 466-7432", home.Text(home.storeInformation(2)));
		sa.assertEquals("Email: support@seleniumframework.com", home.Text(home.storeInformation(3)));
		sa.assertAll();
	}

	@AfterClass
	public void AfterClass() {
		home.close();
	}

}
