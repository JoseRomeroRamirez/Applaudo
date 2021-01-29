package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AddItem {
	private WebDriver driver;
	pageHome home;

	@BeforeTest
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

	@AfterTest
	public void afterTest() {
		home.close();
	}

}
