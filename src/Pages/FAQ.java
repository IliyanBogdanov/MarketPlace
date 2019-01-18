package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;

public class FAQ {
	
	@FindBy(css=".js-read-more[href='/help']")
	private WebElement readMoreButton;
	
	@FindBy(xpath="html/body/footer/footer/div/div[1]/ul[1]/li[3]/a")
	private WebElement communityButton;
	
	public void	createScreenshotOnFAQ() throws IOException, InterruptedException{
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(readMoreButton));
		readMoreButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(communityButton));
		Helpers.createScreenshot("FAQScreenshot");
	}
	
}
