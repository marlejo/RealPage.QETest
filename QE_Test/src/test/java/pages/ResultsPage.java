package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class ResultsPage extends Base{

	By firstResult = By.xpath("/html/body/div[9]/div[3]/div[8]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/a/h3");

	public ResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getFirstResultText() {
		return getText(firstResult);
	}
}
