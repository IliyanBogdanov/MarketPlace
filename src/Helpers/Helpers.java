package Helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

	public static WebDriver driver;
	public static WebDriverWait waitForElement;
	public static String currentLanguage;
	
	public static void openWebBrowser()
	{
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		waitForElement=new WebDriverWait(driver, 120);
	}
	
	public static void javaScriptMinimize() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) Helpers.driver;
		js.executeScript("document.body.style.zoom = '67%';");
		Thread.sleep(1000);
	}
	
	public static void javaScriptMaximize() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) Helpers.driver;
		js.executeScript("document.body.style.zoom = '100%';");
		Thread.sleep(1000);
	}
	
	public static void goToMarketplace()
	{
		driver.get("https://marketplace.wacom.com/home");
			
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	public static void createScreenshot(String fileName) throws IOException
	{
		File CreateNewFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(CreateNewFile,new File( "D:\\WacomProjectScreenshots\\MarketPlaceScreenshots\\"+Helpers.currentLanguage+"\\"+fileName+"_"+Helpers.currentLanguage+".png"));
	}
	
	public static String returnCurrentLanguageValue()
	{
		switch(currentLanguage)
		{
		case "English":
			return "en-US";
			
		case "Spanish":
			return "es-ES";
			
		case "French":
			return "fr-FR";
			
		case "German":
			return "de-DE";
			
		case "Japanese":
			return "ja-JP";
			
		case "Chinese Traditional":
			return "zh-HK";
			
		case "Chinese Simplified":
			return "zh-CN";
			
		case "Italian":
			return "it-IT";
		
		default: 
			return "Error";
		}		
	}
	
}
