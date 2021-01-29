package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageHome extends Base {
	public pageHome(WebDriver driver) {
		super(driver);
	}

	By addCart = By.xpath("//li[1]//span[contains(text(),'Add to cart')]");
	By firstProductHome = By.xpath("//ul[@id='homefeatured']//li[1]//div[@class='product-container']");
	By checkIcon = By.xpath("//i[@class='icon-ok']");
	By checkOutLocator = By.linkText("Proceed to checkout");
	By searchBar = By.id("search_query_top");
	By searchButton = By.name("submit_search");

	public void add(WebDriver driver, pageHome home) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		WebElement addCartHome = home.element(firstProductHome);
		action.moveToElement(addCartHome).build().perform();
		home.click(addCart);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkIcon));
	}

	public void seekItem(pageHome home, String value) {
		home.type(value, searchBar);
		home.click(searchButton);
	}

	public By storeInformation(int value) {
		By SInformation = By.xpath("//section[@id=\'block_contact_infos\']/div/ul/li["+value+"]");
		return SInformation;
	}
	
	public void scrollFooter(WebDriver driver, By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(locator) );
	}
}
