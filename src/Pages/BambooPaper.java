package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;

public class BambooPaper {
	
	@FindBy(css=".adb-id.adb-id__logo.adb-id__sq.adb-id__sq_large.adb-id__linked[href='https://marketplace.wacom.com/apps/799']")
	private WebElement BambooPaperButton;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement taketTheTourButton;
	
	@FindBy(css=".adb-tertiary_nav--link[href='#!features']")
	private WebElement featuresButton;
	
	@FindBy(css=".adb-button.adb-pager--item.adb-toolbar--item:nth-child(2)")
	private WebElement nextButton;
	
	@FindBy(css=".adb-link__nav.adb-stack--item_content[href='#!features/Annotate_and_add_detail']")
	private WebElement AnnotateAndAddDetailButton;
	
	@FindBy(css=".adb-link__nav.adb-stack--item_content[href='#!features/Inkspace__Never_lose_a_good_idea']")
	private WebElement InkspaceNeverLoseAGoodIdeaButton;
	
	@FindBy(css=".adb-link__nav.adb-stack--item_content[href='#!features/Capture_your_ideas_with_a_Wacom_stylus']")
	private WebElement CaptureYourIdeasWithAWacomStylusButton;
	
	@FindBy(css=".adb-tertiary_nav--link[href='#!support']")
	private WebElement policiesSupportButton;
	
	@FindBy(css=".adb-description_list>dd>a[href='http://www.wacom.com/privacy']")
	private WebElement privacyPolicyButton;
	
	@FindBy(css=".adb-tertiary_nav--link[href='#!resources']")
	private WebElement resourcesButton;
	
	@FindBy(css=".adb-link__nav.adb-stack--item_content.js-count.adb-is-selected[href='javascript:;']")
	private WebElement bpButton;
	
	@FindBy(css=".adb-tertiary_nav--link[href='#!editions']")
	private WebElement editionsAndPricingsButton;
	
	public void createAscreenshotOfBambooPaperOverview() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(BambooPaperButton));
		BambooPaperButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(taketTheTourButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("bambooPaperOverviewScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfBambooPaperFeaturesToolsAndPreciseInking() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(featuresButton));
		featuresButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("BambooPaperFeaturesToolsAndPreciseInkingScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfBambooPaperFeaturesAnnotateAndAddDetail() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(AnnotateAndAddDetailButton));
		AnnotateAndAddDetailButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("BambooPaperFeaturesAnnotateAndAddDetailScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfBambooPaperFeaturesInkspaceNeverLoseAGoodIdea() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(InkspaceNeverLoseAGoodIdeaButton));
		InkspaceNeverLoseAGoodIdeaButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("BambooPaperFeaturesInkspaceNeverLoseAGoodIdeaScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfBambooPaperFeaturesCaptureYourIdeasWithAWacomStylus() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(CaptureYourIdeasWithAWacomStylusButton));
		CaptureYourIdeasWithAWacomStylusButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(nextButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("BambooPaperFeaturesCaptureYourIdeasWithAWacomStylusScreenshot");
		Helpers.javaScriptMaximize();
	}
	
	public void createAscreenshotOfBambooPaperPoliciesAndSupport() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(policiesSupportButton));
		policiesSupportButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(privacyPolicyButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(privacyPolicyButton));
		Helpers.createScreenshot("BambooPaperPoliciesAndSupportScreenshot");
	}
	
	public void createAscreenshotOfBambooPaperResources() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(resourcesButton));
		resourcesButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(bpButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(bpButton));
		Helpers.createScreenshot("BambooPaperResourcesScreenshot");
	}
	
	public void createAscreenshotOfBambooPaperEditionsAndPricing() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(editionsAndPricingsButton));
		editionsAndPricingsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(resourcesButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(resourcesButton));
		Helpers.createScreenshot("BambooPaperEditionsAndPricingScreenshot");
	}
	
}
