package MarketPlaceTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import MarketPlacePageObject.MarketPlaceTaxesTestElements;
import mx4j.log.Log;

public class MarketPlaceTaxesTests extends MarketPlaceTaxesTestElements{
	
		public int GetCurrentState=0;
 
  @Test(priority=1)
  public void Login() throws InterruptedException, IOException {
	  	try{
	  		LoginLink().click();
	  		log.info("Element 'LoginLink' was clicked.");
			LoginSubmitButton();
			log.info("Element 'LoginSubmitButton' was clicked.");
	 		Thread.sleep(3000);
	 		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick kp:tab").getInputStream();
	    	Thread.sleep(1000);
	    	Actions action = new Actions(driver); 
	    	action.sendKeys("nenko.nenkov@wacom.eu").perform();
	   		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick kp:tab").getInputStream();
	    	Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick kp:tab").getInputStream();
	    	Thread.sleep(1000);
			action.sendKeys("start123").perform();
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick kp:tab").getInputStream();
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick kp:tab").getInputStream();
			Thread.sleep(2000);
			action.sendKeys(Keys.ENTER).perform();
	  	}catch(Exception e){
			log.fatal("LogIn Error: "+e.getMessage());
			log.fatal(e.getStackTrace());
	  	}
	  	}
  
  
  @Test(priority=2)
  public void MarketPlaceSubscriptionOrder() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
  {	 
		log.info("LogIn was successful.");
		System.out.println(ExcellReader.CountAllCells());
		int GetAll=51;
	  for (int i = 1; i < ExcellReader.CountAllCells()-1; i++) {
			System.out.println(i);
	System.out.println(ExcellReader.GetAbbreviation(i));
	System.out.println(ExcellReader.GetState(i));
	System.out.println(ExcellReader.GetCity(i));
	System.out.println(ExcellReader.GetAddress(i));
	System.out.println(ExcellReader.GetZipCode(i));
	
		  
		  
		  try{ 
				
			  log.info(i+". Excell Reader data: Abbreviation: "+ExcellReader.GetAbbreviation(i)+" , State: "+ExcellReader.GetState(i)+" , City: "+ExcellReader.GetCity(i)+" , Address: "+ExcellReader.GetAddress(i)+" , GetZipCode: "+ExcellReader.GetZipCode(i));

		  
		  GetCurrentState=i;
		  MarketPlaceMenuMarketplaceItem().click();
		  log.info("Element 'MarketPlaceMenuMarketplaceItem' was clicked.");
		  
		  try
		  {
			  TestSubscriptionProduct();
		  }
		  catch(Exception e)
		  {
			  MarketPlaceMoreSubscriptionRightArrow().click();
			  log.info("Element 'MarketPlaceMoreSubscriptionRightArrow' was clicked.");  
		  }
		  
		  TestSubscriptionProduct().click();
		  log.info("Element 'TestSubscriptionProduct' was clicked.");
		  TestSubscriptionProductAmount().click();
		  log.info("Element 'TestSubscriptionProductAmount' was clicked.");
		  TestSubscriptionProductAmountByNowButton().click();
		  log.info("Element 'TestSubscriptionProductAmountByNowButton' was clicked.");
		  TestSubscriptionInkspacePremiumOption().click();
		  log.info("Element 'TestSubscriptionInkspacePremiumOption' was clicked.");
		  CreateOrderContinueButton().click();
		  log.info("Element 'CreateOrderContinueButton' was clicked.");
		  BillingDetailsEditButton().click();
		  log.info("Element 'BillingDetailsEditButton' was clicked.");
		  
		  BillingDetailsAddressTextArea().clear();
		  log.info("Input field 'BillingDetailsAddressTextArea' was clear.");
		  BillingDetailsAddressTextArea().sendKeys(ExcellReader.GetAddress(i));
		  log.info("Type value: "+ExcellReader.GetAddress(i)+", in Element 'BillingDetailsAddressTextArea'.");
		  
		  BillingDetailsCityTextField().clear();
		  log.info("Input field 'BillingDetailsCityTextField' was clear.");
		  BillingDetailsCityTextField().sendKeys(ExcellReader.GetCity(i));
		  log.info("Type value: "+ExcellReader.GetCity(i)+", in Element 'BillingDetailsCityTextField'.");
		  
		  BillingDetailsZipCodeTextField().clear();
		  log.info("Input field 'BillingDetailsZipCodeTextField' was clear.");
		  BillingDetailsZipCodeTextField().sendKeys(ExcellReader.GetZipCode(i).replace(" ", ""));
		  log.info("Type value: "+ExcellReader.GetZipCode(i).replace(" ", "")+", in Element 'BillingDetailsZipCodeTextField'.");
		  
		  BillingDetailsPhoneNumberTextField().clear();
		  log.info("Input field 'BillingDetailsPhoneNumberTextField' was clear.");
		  BillingDetailsPhoneNumberTextField().sendKeys("1-866-234-5382");
		  log.info("Type value: 1-866-234-5382, in Element 'BillingDetailsPhoneNumberTextField'.");
		  
		  BllingDetailsCreditCardNoTextField().clear();
		  log.info("Input field 'BllingDetailsCreditCardNoTextField' was clear.");
		  BllingDetailsCreditCardNoTextField().sendKeys("4111111111111111");
		  log.info("Type value: 4111111111111111, in Element 'BllingDetailsCreditCardNoTextField'.");
		  
		  BllingDetailsSecurityCodeTextField().clear();
		  log.info("Input field 'BllingDetailsSecurityCodeTextField' was clear.");
		  BllingDetailsSecurityCodeTextField().sendKeys("123");
		  log.info("Type value: 123, in Element 'BllingDetailsSecurityCodeTextField'.");
		  
		  BllingDetailsNameTextField().clear();
		  log.info("Input field 'BllingDetailsNameTextField' was clear.");
		  BllingDetailsNameTextField().sendKeys("Nenko Nenkov");	
		  log.info("Type value: Nenko Nenkov, in Element 'BllingDetailsNameTextField'.");
		  
		  BllingDetailsStateSelect().selectByValue(ExcellReader.GetAbbreviation(i));
		  log.info("State Abbreviation was selected: "+ExcellReader.GetAbbreviation(i));
		  
		  BllingDetailsContinueButton().click();
		  log.info("Element 'BllingDetailsContinueButton' was clicked.");
		  BllingDetailsPaymentDetailsConfirmation().click();
		  log.info("Element 'BllingDetailsPaymentDetailsConfirmation' was clicked.");
		  ConfirmOptionPlaceOrderButton();
		  log.info("Element 'ConfirmOptionPlaceOrderButton' was clicked.");
		  helpers.getScreenshot(driver, "/Users/nenko/Documents/WacomProjectScreenshots/MarketPlaceScreenshots/MarketPlace_"+ExcellReader.GetAbbreviation(i)+"_ConfirmOrder.png");
		  ExcellReader.ExcellWriter(i, "Pass",MarketPlaceProductTaxValue());
		  log.info("Validation: Pass");
		  
		  ConfirmOptionPlaceOrderButton().click();
		  log.info("Element 'ConfirmOptionPlaceOrderButton' was clicked.");
		  OrderReceiptGoToApplications();
		  helpers.getScreenshot(driver, "/Users/nenko/Documents/WacomProjectScreenshots/MarketPlaceScreenshots/MarketPlace_"+ExcellReader.GetAbbreviation(i)+"_OrderReceipt.png");
		  OrderReceiptGoToApplications().click();
		  log.info("Element 'OrderReceiptGoToApplications' was clicked.");
		  MarketPlaceMenuManageItem().click();
		  log.info("Element 'MarketPlaceMenuManageItem' was clicked.");
		  MarketPlaceMenuManageItemSubmenuAccount().click();
		  log.info("Element 'MarketPlaceMenuManageItemSubmenuAccount' was clicked.");
		  MarketPlaceSubmenuAccountApplicationsOption().click();
		  log.info("Element 'MarketPlaceSubmenuAccountApplicationsOption' was clicked.");
		  MarketPlaceSubmenuAccountApplicationsOptionProductButton().click();
		  log.info("Element 'MarketPlaceSubmenuAccountApplicationsOptionProductButton' was clicked.");
		  Thread.sleep(3000);
		  MarketPlaceProductButtonCancellSubscription().click();
		  log.info("Element 'MarketPlaceProductButtonCancellSubscription' was clicked.");
		  MarketPlaceProductButtonCancellSubscriptionConfirmation().click();
		  log.info("Element 'MarketPlaceProductButtonCancellSubscriptionConfirmation' was clicked.");
		  MarketPlaceBrowseMarketplaceButton();
	  }catch(Exception e)
	  {
		  log.fatal("Validation: Fail");
		  helpers.getScreenshot(driver, "/Users/nenko/Documents/WacomProjectScreenshots/MarketPlaceScreenshots/MarketPlaceErrors/MarketPlaceError_"+ExcellReader.GetAbbreviation(GetCurrentState)+".png");	  
		  ExcellReader.ExcellWriter(GetCurrentState, "Fail","Error");
		  log.fatal("Test Error: "+e.getMessage());
		  log.fatal(e.getStackTrace());
		  continue;
	  }  
	  }	  
  }
  
  @Test(priority=3)
  public void LogOut() throws InterruptedException
  {
	  try
	  {
	  	MarketPlaceUsernameItem().click();
	  	log.info("Element 'MarketPlaceUsernameItem' was clicked.");
	  	MarketPlaceUsernameItemLogOutOption().click();
	  	log.info("Element 'MarketPlaceUsernameItemLogOutOption' was clicked.");
	  }catch(Exception e)
	  {
		log.fatal("Logout: "+e.getMessage());
		log.fatal(e.getStackTrace());
	  }
	  }
  

  
  


}
