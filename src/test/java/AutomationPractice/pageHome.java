package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageHome extends Base {
	public pageHome (WebDriver driver) {
		super(driver);
	}
	By addCart = By.xpath("//li[1]//span[contains(text(),'Add to cart')]");
	By firstProductHome = By.xpath("//ul[@id='homefeatured']//li[1]//div[@class='product-container']");
	By checkIcon = By.xpath("//i[@class='icon-ok']");
}
