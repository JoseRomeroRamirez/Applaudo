package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private WebDriver driver;

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver DriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	// Wrappers
	public WebElement finElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> finElements(By locator) {
		return driver.findElements(locator);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void visit(String url) {
		driver.get(url);
	}

	public void print(String Text) {
		System.out.println(Text);
	}

	public void max() {
		driver.manage().window().maximize();
	}
}