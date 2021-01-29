package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageSearchResult extends pageHome{
	
	public pageSearchResult(WebDriver driver) {
		super(driver);
	}
	
	By searchResult = By.className("heading-counter");
	}
