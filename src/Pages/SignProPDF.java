package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;

public class SignProPDF {
	
	@FindBy(css=".adb-id.adb-id__logo.adb-id__sq.adb-id__sq_large.adb-id__linked[href='https://marketplace.wacom.com/apps/803']")
	private WebElement SignProPDFButton;
	
	@FindBy(xpath="html/body/div[1]/main/div/div[3]/section[1]/div/div[1]/div/div/menu/button")
	private WebElement takeTheTourButton;
	
	@FindBy(css=".adb-tertiary_nav--link[href='#!features']")
	private WebElement featuresButton;
	
	@FindBy(css=".adb-button.adb-pager--item.adb-toolbar--item:nth-child(2)")
	private WebElement nextButton;
	
	@FindBy(css=".adb-link__nav.adb-stack--item_content[href='#!features/PDF_Creation']")
	private WebElement pdfCreationButton;
	
	@FindBy(css=".adb-tertiary_nav--item > .adb-tertiary_nav--link[href='#!editions']")
	private WebElement EditionsAndPricingButton;
	
	public void createAscreenshotOfSignProPDFOverview() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(SignProPDFButton));
		SignProPDFButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(takeTheTourButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(takeTheTourButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("SignProPDFOverviewScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfSignProPDFFeaturesHandwritteneSignature() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(featuresButton));
		featuresButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("SignProPDFFeaturesHandwritteneSignatureScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfSignProPDFFeaturesPDFCreation() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(pdfCreationButton));
		pdfCreationButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("SignProPDFFeaturesPDFCreationScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	
	public void createAscreenshotOfSignProPDFEditionsAndPricing() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(EditionsAndPricingButton));
		EditionsAndPricingButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(featuresButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(featuresButton));
		Helpers.createScreenshot("SignProPDFEditionsAndPricingScreenshot");
	}
}
