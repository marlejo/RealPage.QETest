package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class SearchPage extends Base{

	By searchField = By.cssSelector("[title^='Search']");
	By searchOnGoogleBtn = By.name("btnK");
	By firstSuggestion = By.xpath("/html/body/div/div[5]/form/div[2]/div[1]/div[2]/div[2]/ul/li[1]");
		
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public void searhText(String text) {
		waitToBeVisible(searchField);
		type(text, searchField);
		waitToBeClickable(firstSuggestion);
		clic(firstSuggestion);
		/*waitToBeClickable(searchOnGoogleBtn);
		clic(searchOnGoogleBtn);*/
	}
}
