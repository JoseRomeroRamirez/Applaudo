package AutomationPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class SearchItemFalse {
	private WebDriver driver;
	pageSearchResult search;

	@BeforeClass
	public void BeforeClass() {
		search = new pageSearchResult(driver);
		driver = search.DriverConnection();
		search.max();
		search.visit("http://automationpractice.com/index.php");
	}

	@Test
	public void f() {
		search.seekItem(search, "camaron");
		String[] result = search.Text(search.searchResult).split(" ");
		if (Integer.parseInt(result[0]) == 0) {
			assertEquals(true, true);
		} else {
			assertEquals(true, false);
		}
	}

	@AfterClass
	public void AfterClass() {
		search.close();
	}
}
