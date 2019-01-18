package Pages;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Helpers.Helpers;

public class MarketPlaceHomePageBeforeLogin {
	
	@FindBy(css=".adb-primary_nav--link[href='/home']")
	private WebElement homeButton;
	
	@FindAll({@FindBy(css="div#navbar-main > ul > li > a")})
	private List<WebElement> getMenuItems;
	
	@FindBy(id="live-chat-link")
	private WebElement liveChatLinkButton;
	
	@FindBy(xpath="html/body/div[1]/header/div/div[1]/header/div/div[2]/ul/li[3]/div/div/div/div[3]/div/figure/figcaption/h4/a/span")
	private WebElement willLinkButton;
	
	@FindBy(css="div.adb-dropdown > select")
	private WebElement changeLanguageDropdown;
	
	public void createScreenshotOnHomePage() throws IOException, InterruptedException{
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(homeButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("homePageScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void	createScreenshotOnDiscoverTab() throws IOException, InterruptedException{
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(getMenuItems.get(0)));
		getMenuItems.get(0).click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(liveChatLinkButton));
		Helpers.createScreenshot("discoverTabScreenshot");
	}
		
	public void	createScreenshotOnProductsTab() throws IOException, InterruptedException{
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(getMenuItems.get(1)));
		getMenuItems.get(1).click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(liveChatLinkButton));
		Helpers.createScreenshot("productsTabScreenshot");
	}
	
	public void	createScreenshotOnEnterpriseTab() throws IOException, InterruptedException{
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(getMenuItems.get(2)));
		getMenuItems.get(2).click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(willLinkButton));
		Helpers.createScreenshot("enterpriseTabScreenshot");
	}
	
	//public void changeLanguage() throws InterruptedException
	//{
	//		new Select(changeLanguageDropdown).selectByValue(Helpers.returnCurrentLanguageValue());
	//		Thread.sleep(2000);
	//}
	
	
} 
	
	
	

	
	
	
	
	
	

