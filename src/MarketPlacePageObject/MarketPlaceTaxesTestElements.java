package MarketPlacePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseTestFixture.BaseTestFixture;

public class MarketPlaceTaxesTestElements extends BaseTestFixture{
	
	public WebElement LoginLink()
	{
		WaitForElement.WaitForElementToBeClickableByCssSelector("a[href='/login']");
		log.info("Element 'LoginLink' is found!!!");
		return driver.findElement(By.cssSelector("a[href='/login']"));
	}
	
	public WebElement LoginSubmitButton()
	{
		WaitForElement.WaitForElementToBeVisibleByCssSelector("input[id^='_gigya_uib_attrHolder_']");
		WaitForElement.WaitForElementToBeClickableByCssSelector("input[id^='_gigya_uib_attrHolder_']");
		log.info("Element 'LoginSubmitButton' is found!!!");
		return driver.findElement(By.cssSelector("input[id^='_gigya_uib_attrHolder_']"));
	}
	
	public WebElement TestSubscriptionProduct()
	{
		WaitForElement.WaitForElementToBeClickableByCssSelector("a[href='https://testwacomus.appdirect.com/apps/145304']");
		log.info("Element 'TestSubscriptionProduct' is found!!!");
		return driver.findElement(By.cssSelector("a[href='https://testwacomus.appdirect.com/apps/145304']"));
	}
	
	public WebElement TestSubscriptionProductAmount()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='$3,001.00']");
		log.info("Element 'TestSubscriptionProductAmount' is found!!!");
		return driver.findElement(By.xpath("//a[text()='$3,001.00']"));
	}
	
	public WebElement TestSubscriptionProductAmountByNowButton() throws InterruptedException
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//span[text()='Buy Now ']");
		log.info("Element 'TestSubscriptionProductAmountByNowButton' is found!!!");
		return driver.findElement(By.xpath("//span[text()='Buy Now ']"));
	}
	
	public WebElement TestSubscriptionInkspacePremiumOption() throws InterruptedException
	{
		WaitForElement.WaitForElementToBeVisibleByXpath("//label[text()='Inkspace Premium']");
		log.info("Element 'TestSubscriptionInkspacePremiumOption' is found!!!");
		return driver.findElement(By.xpath("//label[text()='Inkspace Premium']"));
	}
	
	public WebElement CreateOrderContinueButton() throws InterruptedException
	{
		Thread.sleep(3000);
		String GetContinueButtonID=driver.findElement(By.cssSelector("div.adb-styled.buttons > button[id^='id']")).getAttribute("id");
		WaitForElement.WaitForElementToBeVisibleById(GetContinueButtonID);
		log.info("Element 'CreateOrderContinueButton' is found!!!");
		return driver.findElement(By.id(GetContinueButtonID));
	}
	
	public WebElement BillingDetailsEditButton() throws InterruptedException
	{
		WaitForElement.WaitForElementToBeVisibleByCssSelector("button[id^='id']");
		WaitForElement.WaitForElementToBeClickableByCssSelector("button[id^='id']");
		log.info("Element 'BillingDetailsEditButton' is found!!!");
		return driver.findElement(By.cssSelector("button[id^='id']"));
	}
	
	public WebElement BillingDetailsAddressTextArea() throws InterruptedException
	{
		WaitForElement.WaitForElementToBeVisibleByCssSelector("div.form-row.billing-street-address > div.form-field > textarea[id^='id']");
		log.info("Element 'BillingDetailsAddressTextArea' is found!!!");
		return driver.findElement(By.cssSelector("div.form-row.billing-street-address > div.form-field > textarea[id^='id']"));
	}
	
	public WebElement BillingDetailsCityTextField() throws InterruptedException
	{
		WaitForElement.WaitForElementToBeVisibleById("city");
		log.info("Element 'BillingDetailsCityTextField' is found!!!");
		return driver.findElement(By.id("city"));
	}
	
	public WebElement BillingDetailsZipCodeTextField() throws InterruptedException
	{
		WaitForElement.WaitForElementToBeVisibleById("postal-code");
		log.info("Element 'BillingDetailsZipCodeTextField' is found!!!");
		return driver.findElement(By.id("postal-code"));
	}
	
	public WebElement BillingDetailsPhoneNumberTextField() throws InterruptedException
	{
		WaitForElement.WaitForElementToBeVisibleById("phone-number");
		log.info("Element 'BillingDetailsPhoneNumberTextField' is found!!!");
		return driver.findElement(By.id("phone-number"));
	}
	
	public WebElement BllingDetailsContinueButton()
	{
		WaitForElement.WaitForElementToBeClickableById("continue");
		log.info("Element 'BllingDetailsContinueButton' is found!!!");
		return driver.findElement(By.id("continue"));
	}
	
	public WebElement BllingDetailsCreditCardNoTextField()
	{
		WaitForElement.WaitForElementToBeClickableById("credit-card-no");
		log.info("Element 'BllingDetailsCreditCardNoTextField' is found!!!");
		return driver.findElement(By.id("credit-card-no"));
	}
	
	public WebElement BllingDetailsSecurityCodeTextField()
	{
		WaitForElement.WaitForElementToBeClickableById("securityCode");
		log.info("Element 'BllingDetailsSecurityCodeTextField' is found!!!");
		return driver.findElement(By.id("securityCode"));
	}
	
	public WebElement BllingDetailsNameTextField()
	{
		WaitForElement.WaitForElementToBeClickableById("name");
		log.info("Element 'BllingDetailsNameTextField' is found!!!");
		return driver.findElement(By.id("name"));
	}
	
	public Select BllingDetailsStateSelect()
	{
		WaitForElement.WaitForElementToBeClickableById("state");
		log.info("Element 'BllingDetailsStateSelect' is found!!!");
		return new Select(driver.findElement(By.id("state")));
	}
	
	public WebElement BllingDetailsPaymentDetailsConfirmation()
	{
		WaitForElement.WaitForElementToBeClickableById("posLabel");
		log.info("Element 'BllingDetailsPaymentDetailsConfirmation' is found!!!");
		return driver.findElement(By.id("posLabel"));
	}
	
	public WebElement ConfirmOptionPlaceOrderButton() throws InterruptedException
	{
		//WaitForElement.WaitForElementPresenceById("placeOrder");
		WaitForElement.WaitForElementPresenceById("placeOrder");
		log.info("Element 'ConfirmOptionPlaceOrderButton' is found!!!");
		return driver.findElement(By.id("placeOrder"));
	}
	
	public WebElement OrderReceiptGoToApplications()
	{
		WaitForElement.WaitForElementToBeClickableById("return");
		log.info("Element 'OrderReceiptGoToApplications' is found!!!");
		return driver.findElement(By.id("return"));
	}
	
	public WebElement MarketPlaceMenuManageItem()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='Manage']");
		log.info("Element 'MarketPlaceMenuManageItem' is found!!!");
		return driver.findElement(By.xpath("//a[text()='Manage']"));
	}
	
	public WebElement MarketPlaceMenuManageItemSubmenuAccount()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='Account']");
		log.info("Element 'MarketPlaceMenuManageItemSubmenuAccount' is found!!!");
		return driver.findElement(By.xpath("//a[text()='Account']"));
	}
	
	public WebElement MarketPlaceSubmenuAccountApplicationsOption()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='Applications']");
		log.info("Element 'MarketPlaceSubmenuAccountApplicationsOption' is found!!!");
		return driver.findElement(By.xpath("//a[text()='Applications']"));
	}
	
	public WebElement MarketPlaceSubmenuAccountApplicationsOptionProductButton()
	{
		WaitForElement.WaitForElementToBeClickableByCssSelector("button[data-auto='options']");
		log.info("Element 'MarketPlaceSubmenuAccountApplicationsOptionProductButton' is found!!!");
		return driver.findElement(By.cssSelector("button[data-auto='options']"));
	}
	
	public WebElement MarketPlaceProductButtonCancellSubscription()
	{
		WaitForElement.WaitForElementToBeClickableByCssSelector("a[data-auto='menu_cancelSubscription']");
		log.info("Element 'MarketPlaceProductButtonCancellSubscription' is found!!!");
		return driver.findElement(By.cssSelector("a[data-auto='menu_cancelSubscription']"));
	}
	
	public WebElement MarketPlaceProductButtonCancellSubscriptionConfirmation()
	{
		WaitForElement.WaitForElementToBeClickableById("posLabel");
		log.info("Element 'MarketPlaceProductButtonCancellSubscriptionConfirmation' is found!!!");
		return driver.findElement(By.id("posLabel"));
	}
	
	public WebElement MarketPlaceBrowseMarketplaceButton()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='Browse the marketplace']");
		log.info("Element 'MarketPlaceBrowseMarketplaceButton' is found!!!");
		return driver.findElement(By.xpath("//a[text()='Browse the marketplace']"));
	}
	
	public WebElement MarketPlaceMenuMarketplaceItem()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='Marketplace']");
		log.info("Element 'MarketPlaceMenuMarketplaceItem' is found!!!");
		return driver.findElement(By.xpath("//a[text()='Marketplace']"));
	}
	
	public WebElement MarketPlaceUsernameItem()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='Nenko Nenkov']");
		log.info("Element 'MarketPlaceUsernameItem' is found!!!");
		return driver.findElement(By.xpath("//a[text()='Nenko Nenkov']"));
	}
	
	public WebElement MarketPlaceUsernameItemLogOutOption()
	{
		WaitForElement.WaitForElementToBeClickableByXpath("//a[text()='Logout']");
		log.info("Element 'MarketPlaceUsernameItemLogOutOption' is found!!!");
		return driver.findElement(By.xpath("//a[text()='Logout']"));
	}
	
	public String MarketPlaceProductTaxValue()
	{
		String GetTax=driver.findElement(By.cssSelector("div[data-auto='salesTax'] > div.fright > span.invoice-value")).getText();
		log.info("Taxes for this subscription are: "+GetTax);
		return GetTax;
	}
	
	public WebElement MarketPlaceMoreSubscriptionRightArrow()
	{
		WaitForElement.WaitForElementToBeClickableByCssSelector("i.adb-icon__arrow_right");
		log.info("Element 'MarketPlaceMoreSubscriptionRightArrow' is found!!!");
		return driver.findElement(By.cssSelector("i.adb-icon__arrow_right"));
	}

}
