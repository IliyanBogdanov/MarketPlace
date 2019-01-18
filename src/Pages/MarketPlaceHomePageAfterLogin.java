package Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Helpers.Helpers;

public class MarketPlaceHomePageAfterLogin {
	
	@FindBy(css=".adb-primary_nav--link[href='/login']")
	private WebElement loginButton;
	
	@FindBy(xpath="html/body/div[3]/div/div/div[2]/div/div[2]/div/form/div[3]/div[3]/div[1]/input")
	private WebElement usernameField;
	
	@FindBy(xpath="html/body/div[3]/div/div/div[2]/div/div[2]/div/form/div[3]/div[3]/div[2]/input")
	private WebElement passwordField;
	
	@FindBy(xpath="html/body/div[3]/div/div/div[2]/div/div[2]/div/form/div[3]/div[3]/div[4]/div[2]/div/div/input")
	private WebElement submitButton;
	
	@FindBy(css=".adb-primary_nav--link[href='/home']")
	private WebElement marketplaceButton;
	
	@FindBy(xpath="html/body/div[1]/header/div/div[2]/nav/ul/li[3]/menu/a")
	private WebElement manageButton;
	
	@FindBy(id="account")
	private WebElement accountButton;
	
	@FindBy(css=".adb-secondary_nav--items>li>a[href='./companySettings']")
	private WebElement companySettingsButton;
	
	@FindBy(css=".adb-secondary_nav--items>li>a[href='./apps']")
	private WebElement applicationsButton;
	
	@FindBy(css=".adb-secondary_nav--items>li>a[href='./users']")
	private WebElement usersButton;
	
	@FindBy(css="[data-auto=groups]")
	private WebElement groupsButton;
	
	@FindBy(css="[data-auto=roles]")
	private WebElement rolesButton;
	
	@FindBy(xpath="html/body/div[3]/div[3]/div/div[2]/div/div/section/div[1]/fieldset/div/div[3]/menu/button[2]")
	private WebElement inviteMultipleButton;
	
	@FindBy(css=".adb-close.modal-dismiss")
	private WebElement closeButton;
	
	@FindBy(css=".adb-secondary_nav--items>li>a[href='./assign']")
	private WebElement assignAppsButton;
	
	@FindBy(css=".adb-secondary_nav--items>li>a[href='./bills']")
	private WebElement billingButton;
	
	@FindBy(xpath="html/body/div[3]/div[3]/div/div/div[1]/nav/ul/li[2]/a")
	private WebElement paymentsButton;
	
	@FindBy(xpath="html/body/div[3]/div[3]/div/div/div[1]/nav/ul/li[3]/a")
	private WebElement billingInfoButton;
	
	@FindBy(css="[data-auto=search_icon]")
	private WebElement searchButton;
	
	@FindBy(css="[ga=appPaymentBillingDetailsContinueButton]")
	private WebElement saveButton;
	
	@FindBy(css=".adb-close.dismiss")
	private WebElement dismissButton;
	
	@FindBy(css="[name=companySave]")
	private WebElement save2Button;
	
	@FindBy(xpath="html/body/div[3]/div[3]/div/div/div[1]/div[1]/div/div[1]/div[2]/button")
	private WebElement editProfileButton;
	
	@FindBy(xpath="html/body/div[3]/div[3]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/div[4]/a")
	private WebElement addressButton;
	
	@FindBy(css="div.adb-dropdown > select")
	private WebElement changeLanguageDropdown;
	
	
	
	public void userLogsIn() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(usernameField));
		usernameField.click();
		usernameField.sendKeys("turkey12@mail.bg");
		
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(passwordField));
		passwordField.click();
		passwordField.sendKeys("mate1234");
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
		
		Thread.sleep(7000);
		
	}
	
	public void createScreenshotOnHomePageAfterLogin() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(marketplaceButton));
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("homePageScreenshotAfterLogin");
		Helpers.javaScriptMaximize();
	}
	
	public void createScreenshotOnManageAccountDashboard() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(manageButton));
		manageButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(accountButton));
		accountButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.createScreenshot("screenshotOnManageAccountDashboard");
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(inviteMultipleButton));
		inviteMultipleButton.click();
		Thread.sleep(2000);
		Helpers.createScreenshot("screenshotOnManageAccountDashboardInviteMultiple");
		closeButton.click();
		
	}
	
	public void createScreenshotOnApplications() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(applicationsButton));
		applicationsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.createScreenshot("screenshotOnApplications");
		
	}
	
	public void createScreenshotOnUsersManageUsers() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(usersButton));
		usersButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.createScreenshot("screenshotOnUsersManageUsers");
		
	}
	
	public void createScreenshotOnUsersManageGroups() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(groupsButton));
		groupsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.createScreenshot("screenshotOnUsersManageGroups");
		
	}
	
	public void createScreenshotOnUsersManageRoles() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(rolesButton));
		rolesButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.createScreenshot("screenshotOnUsersManageRoles");
		
	}
	
	public void createScreenshotOnAssignApps() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(assignAppsButton));
		assignAppsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.createScreenshot("screenshotOnAssignApps");
	}
	
	public void createScreenshotOnBillingManageInvoices() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(billingButton));
		billingButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		Helpers.createScreenshot("screenshotOnBillingManageInvoices");
	}
	
	public void createScreenshotOnBillingPayments() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(paymentsButton));
		paymentsButton.click();
		//Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(searchButton));
		Thread.sleep(2000);
		Helpers.createScreenshot("screenshotOnBillingPayments");
	}
	
	public void createScreenshotOnBillingBillingInfo() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(billingInfoButton));
		billingInfoButton.click();
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("screenshotOnBillingBillingInfo");
		Helpers.javaScriptMaximize();
	}
	
public void createScreenshotOnCompanySettings() throws IOException, InterruptedException{
		
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(companySettingsButton));
		companySettingsButton.click();
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(save2Button));
		Helpers.createScreenshot("screenshotOnCompanySettings");
		Helpers.waitForElement.until(ExpectedConditions.elementToBeClickable(editProfileButton));
		editProfileButton.click();
		Thread.sleep(2000);
		Helpers.javaScriptMinimize();
		Helpers.createScreenshot("screenshotOnEditProfile");
		Helpers.javaScriptMaximize();
	}
	

public void changeLanguage() throws InterruptedException
{
		new Select(changeLanguageDropdown).selectByValue(Helpers.returnCurrentLanguageValue());
		Thread.sleep(2000);
}
	
	
}
