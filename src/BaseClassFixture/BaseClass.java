package BaseClassFixture;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Helpers.Helpers;
import Pages.Page;

public class BaseClass {

	//open browser , login
	//@Parameters({ "Language" })
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		//Helpers.currentLanguage=Language;
		//System.out.println(Helpers.currentLanguage);
		Helpers.openWebBrowser();
		Helpers.goToMarketplace();
		
		//Page.MarketPlaceHomePageBeforeLogin().changeLanguage();
		
	}
	
	
	
	//CloseBorwser
	@AfterMethod
	public void closeBrowser()
	{
		Helpers.driver.quit();
	}

}
