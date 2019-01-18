package Pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Helpers.Helpers;


public class AllApplications {
	
	@FindBy(css="div#secondaryNav > nav > ul > li > a[href*='/listing']")
	private WebElement allApplicationsButton;
	
	@FindBy(css=".adb-button.adb-button__medium.adb-button__primary.adb-button__full_width.adb-button__long_i18n_text")
	private WebElement viewProfileButton;
	
	@FindBy(css=".adb-button.adb-button__medium.adb-button__primary.adb-button__full_width.adb-button__long_i18n_text")
	private WebElement compareCheckboxes;
	
	@FindBy(css=".adb-button.adb-toolbar--item.adb-button__small")
	private WebElement compareButton;
	
//	@FindBy(css="*[class='adb-button adb-button__emphasis adb-button__full_width']")
	@FindBy(css="a[data-dismiss='modal']")
	private WebElement viewProfileButtons;
	
	@FindAll({@FindBy(css="label[data-original-title=''] > span > input")})
	private List<WebElement> getCompareCheckboxes;

	public void checkTheCompareCheckboxes(){
		for (int i = 0; i < getCompareCheckboxes.size(); i++) {
			getCompareCheckboxes.get(i).click();
		}
	}
	public void createAscreenshotOfAllApplications() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(allApplicationsButton));
		allApplicationsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(viewProfileButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("inkspaceAllAplicationsScreenshot");
		Helpers.javaScriptMaximize();
		
		
	}
	
	public void createAscreenshotOfAllComparedApplications() throws IOException, InterruptedException{
			
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(compareButton));
		compareButton.click();
		Thread.sleep(2000);
		Helpers.createScreenshot("allComparedAplicationsScreenshot");
		
	}

	}
	
	
	
	

