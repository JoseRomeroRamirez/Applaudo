package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class SearchItem {
	private WebDriver driver;
	pageSearchResult search;

	@BeforeTest
	public void beforeTest() {
		search = new pageSearchResult(driver);
		driver = search.DriverConnection();
		search.max();
		search.visit("http://automationpractice.com/index.php");
	}

	@Test
	public void f() {
		search.seekItem(search, "blouse");
		String[] result = search.Text(search.searchResult).split(" ");
		if (Integer.parseInt(result[0]) > 0) {
			assertEquals(true, true);
		} else {
			assertEquals(true, false);
		}
	}

	@AfterTest
	public void afterTest() {
		search.close();
	}

}
