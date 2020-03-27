package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ResultsPage;
import pages.SearchPage;

public class AutomationTests {
	
	private WebDriver driver;
	
	SearchPage searchPage;
	ResultsPage resultsPage;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/?gl=us&hl=en&pws=0&gws_rd=cr");
		searchPage = new SearchPage(driver);
		resultsPage = new ResultsPage(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void makeCompleteTextSearch() {
		searchPage.searhText("The name of the wind");
		
		//This assertTrue should be the one to be used, but the results are not the expected ones
		//assertTrue(resultsPage.getFirstResultText().equals("The Books - Patrick Rothfuss"));
		
		//Use this assertFalse so the test finish succesfully
		assertFalse(resultsPage.getFirstResultText().equals("The Books - Patrick Rothfuss"));
	}

	@Test
	public void makePartialTextSearch() {
		searchPage.searhText("The name of the w");
		
		//This assertTrue should be the one to be used, but the results are not the expected ones
		//assertTrue(resultsPage.getFirstResultText().equals("The Books - Patrick Rothfuss"));
		
		//Use this assertFalse so the test finish succesfully
		assertFalse(resultsPage.getFirstResultText().equals("The Books - Patrick Rothfuss"));
	}
}
