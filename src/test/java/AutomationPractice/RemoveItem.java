package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class RemoveItem {
	private WebDriver driver;
	pageCheckOut checkOut;

	@BeforeTest
	public void setup() {
		checkOut = new pageCheckOut(driver);
		driver = checkOut.DriverConnection();
		checkOut.max();
		checkOut.visit("http://automationpractice.com/index.php");
	}

	@Test
	public void f() {
		checkOut.add(driver, checkOut);
		checkOut.click(checkOut.checkOutLocator);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checkOut.click(checkOut.removeCart);
	}

	@AfterTest
	public void afterTest() {
		//home.close();
	}

}
