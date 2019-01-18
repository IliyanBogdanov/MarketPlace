package Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;

public class FeaturedApplications {
	
	@FindBy(css="p.js-logo-container")
	private WebElement inkspaceAppButton;
	
	@FindBy(css=".adb-button.adb-toolbar--item.adb-button__primary.adb-button__large")
	private WebElement takeTheTourButton;
	
	@FindBy(css="a.adb-tertiary_nav--link[href='#!features']")
	private WebElement inkspaceFeaturesButton;
	
	@FindBy(xpath=".//*[@id='main']/div/div[3]/section[1]/div/div[2]/menu/button[2]")
	private WebElement nextButton;
	
	@FindBy(xpath=".//*[@id='main']/div/div[3]/section[1]/div/div[1]/div/nav/li[2]/a")
	private WebElement doMoreWithYourNotesButton;
	
	@FindBy(xpath=".//*[@id='main']/div/div[3]/section[1]/div/div[1]/div/nav/li[3]/a")
	private WebElement workTogetherButton;
	
	@FindBy(xpath=".//*[@id='main']/div/div[3]/section[1]/div/div[1]/div/nav/li[4]/a")
	private WebElement refineYourPaperSketchesDigitallyButton;
	
	@FindBy(xpath=".//*[@id='main']/div/div[3]/section[1]/div/div[1]/div/nav/li[5]/a")
	private WebElement systemRequirementsButton;
	
	@FindBy(xpath=".//*[@id='main']/div/section/div/div[2]/nav/ul/li[3]/a")
	private WebElement policiesSupportButton;
	
	@FindBy(xpath=".//*[@id='main']/div/div[3]/section[1]/div/div[2]/div/div[3]/div[4]/div/div[1]/dd/span[1]/a")
	private WebElement inkspaceBasicPricingButton;
	
	@FindBy(xpath=".//*[@id='main']/div/section/div/div[2]/nav/ul/li[4]/a")
	private WebElement editionsAndPricingsButton;
	
	@FindBy(xpath=".//*[@id='main']/div/div[3]/section[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div[4]/div/a")
	private WebElement showMoreInfoButton;
	
	
	public void createAscreenshotofTheInkspaceAppOverview() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(inkspaceAppButton));
		inkspaceAppButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(takeTheTourButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("inkspaceOverviewScreenshot");
		Helpers.javaScriptMaximize();
		
	}
	
	public void createAscreenshotofTheInkspaceAppFeaturesAccessShare() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(inkspaceFeaturesButton));
		inkspaceFeaturesButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("inkspaceFeaturesAccessShareScreenshot");
		Helpers.javaScriptMaximize();
		
	}
	
	public void createAscreenshotofTheInkspaceAppFeaturesDoMoreWithYourNotes() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(doMoreWithYourNotesButton));
		doMoreWithYourNotesButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("inkspaceFeaturesDoMoreWithYourNotesScreenshot");
		Helpers.javaScriptMaximize();
		
	}
	
	public void createAscreenshotofTheInkspaceAppFeaturesWorkTogether() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(workTogetherButton));
		workTogetherButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("inkspaceFeaturesWorkTogetherScreenshot");
		Helpers.javaScriptMaximize();
		
	}
	
	public void createAscreenshotofTheInkspaceAppFeaturesRefineYourPaperSketchesDigitally() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(refineYourPaperSketchesDigitallyButton));
		refineYourPaperSketchesDigitallyButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("inkspaceFeaturesRefineYourPaperSketchesDigitallyScreenshot");
		Helpers.javaScriptMaximize();
		
	}
	
	public void createAscreenshotofTheInkspaceAppFeaturesSystemRequirements() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(systemRequirementsButton));
		systemRequirementsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.createScreenshot("inkspaceFeaturesSystemRequirementsScreenshot");
		
	}
	
	public void createAscreenshotofTheInkspaceAppPoliciesAndSupport() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(policiesSupportButton));
		policiesSupportButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(inkspaceBasicPricingButton));
		Helpers.createScreenshot("inkspacePoliciesAndSupportScreenshot");
		
	}
	
	public void createAscreenshotofTheInkspaceAppEditionsAndPricings() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(editionsAndPricingsButton));
		editionsAndPricingsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(showMoreInfoButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("inkspaceEditionsAndPricingsScreenshot");
		Helpers.javaScriptMaximize();
		
	}
}
