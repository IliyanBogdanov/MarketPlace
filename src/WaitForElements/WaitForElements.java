package WaitForElements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseTestFixture.BaseTestFixture;

public class WaitForElements extends BaseTestFixture {

	public  WebDriverWait WaitForElement;
	
	public WaitForElements() 
	{
		 WaitForElement=new WebDriverWait(driver, 30);
	}
	
	public void WaitForElementToBeClickableById(String locator)
	{
		WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
	}
	
	public void WaitForElementToBeClickableByCssSelector(String locator)
	{
		WaitForElement.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
	}
	
	public void WaitForElementToBeClickableByName(String locator)
	{
		WaitForElement.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
	}
	
	public void WaitForElementToBeClickableByXpath(String locator)
	{
		WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
	
	public void WaitForElementToBeVisibleByCssSelector(String locator)
	{
		WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
	}
	
	public void WaitForElementToBeVisibleByName(String locator)
	{
		WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
	}
	
	public void WaitForElementToBeVisibleById(String locator)
	{
		WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}
	
	public void WaitForElementToBeVisibleByXpath(String locator)
	{
		WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	public void WaitForElementPresenceById(String locator)
	{
		WaitForElement.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
	}
	
	public void WaitForElementByCssSelectorAndText(String locator,String text)
	{
		WaitForElement.until(ExpectedConditions.textToBePresentInElementValue(By.cssSelector(locator), text));
	}
	
}
