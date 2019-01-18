package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;

public class WacomInkspaceApp {
	
	@FindBy(css=".adb-id--img[src='https://d2uars7xkdmztq.cloudfront.net/app_resources/795/thumbs_64/img3403698368330915231.png']")
	private WebElement wacomInkspaceAppButton;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement taketTheTourButton;
	
	@FindBy(css=".adb-tertiary_nav--link[href='#!features']")
	private WebElement featuresButton;
	
	@FindBy(css=".adb-button.adb-pager--item.adb-toolbar--item:nth-child(2)")
	private WebElement nextButton;
	
	@FindBy(css=".adb-stack--item > a[href='#!features/Make_your_smartpad_even_more_powerul']")
	private WebElement MakeYourSmartpadButton;
	
	@FindBy(css=".adb-link__nav.adb-stack--item_content[href='#!features/Manage_your_notes']")
	private WebElement ManageYourNotesButton;
	
	@FindBy(css=".adb-link__nav.adb-stack--item_content[href='#!features/Ink_to_text")
	private WebElement InkToTextButton;
	
	@FindBy(css=".adb-tertiary_nav--item > .adb-tertiary_nav--link[href='#!editions']")
	private WebElement EditionsAndPricingButton;
	
	public void createAscreenshotOfWacomInkspaceAppOverview() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(wacomInkspaceAppButton));
		wacomInkspaceAppButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(taketTheTourButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("wacomInkspaceAppOverviewScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfWacomInkspaceAppFeaturesFromPaperToDigitalInk() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(featuresButton));
		featuresButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("wacomInkspaceAppFeaturesFromPaperToDigitalInkScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfWacomInkspaceAppFeaturesMakeYourSmartpadEvenMorePowerful() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(MakeYourSmartpadButton));
		MakeYourSmartpadButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("wacomInkspaceAppFeaturesMakeYourSmartpadEvenMorePowerfulScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfWacomInkspaceAppFeaturesManageYourNotes() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(ManageYourNotesButton));
		ManageYourNotesButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("wacomInkspaceAppFeaturesManageYourNotesScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfWacomInkspaceAppFeaturesInkToText() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(InkToTextButton));
		InkToTextButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("wacomInkspaceAppFeaturesInkToTextScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfWacomInkspaceAppEditionsAndPricing() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(EditionsAndPricingButton));
		EditionsAndPricingButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(featuresButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(featuresButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("wacomInkspaceAppEditionsAndPricingScreenshot");
		Helpers.javaScriptMaximize();
	}
}
