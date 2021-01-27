package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public void f() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		WebElement addCartHome = home.element(home.firstProductHome);
		action.moveToElement(addCartHome).build().perform();
		home.click(home.addCart);
		wait.until(ExpectedConditions.visibilityOfElementLocated(home.checkIcon));
		Assert.assertTrue(home.element(home.checkIcon).isDisplayed());
	}

	@AfterTest
	public void afterTest() {
		home.close();
	}

}
