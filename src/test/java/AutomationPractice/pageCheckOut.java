package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageCheckOut extends pageHome {
	public pageCheckOut(WebDriver driver) {
		super(driver);
	}

	By removeCart = By.className("icon-trash");
	By emptyCart = By.xpath("//p[@class='alert alert-warning']");

}
