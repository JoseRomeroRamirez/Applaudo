package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RemoveItem {
	private WebDriver driver;
	pageCheckOut checkOut;
	
	@BeforeClass
	public void setup() {
		checkOut = new pageCheckOut(driver);
		driver = checkOut.DriverConnection();
		checkOut.max();
		checkOut.visit("http://automationpractice.com/index.php");
	}

	@Test
	public void f() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		checkOut.add(driver, checkOut);
		checkOut.click(checkOut.checkOutLocator);
		checkOut.click(checkOut.removeCart);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut.emptyCart));
		Assert.assertTrue(checkOut.element(checkOut.emptyCart).isDisplayed());
	}

	@AfterClass
	public void AfterClass() {
		checkOut.close();
	}

}
