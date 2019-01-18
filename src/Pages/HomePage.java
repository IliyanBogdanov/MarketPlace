package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;

public class HomePage {

	@FindBy(css=".adb-primary_nav--link[href='/home']")
	private WebElement marketplaceButton;
	
	public void	openHomePage() throws IOException{
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(marketplaceButton));
		marketplaceButton.click();
	
	}
}
