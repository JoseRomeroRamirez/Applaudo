package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AddItem {
	private WebDriver driver;
	pageHome home;

	@BeforeClass
	public void setup() {
		home = new pageHome(driver);
		driver = home.DriverConnection();
		home.max();
		home.visit("http://automationpractice.com/index.php");
	}

	@Test
	public void AddToCart() {
		home.add(driver, home);
		Assert.assertTrue(home.element(home.checkIcon).isDisplayed());
	}

	@AfterClass
	public void AfterClass() {
		home.close();
	}

}
