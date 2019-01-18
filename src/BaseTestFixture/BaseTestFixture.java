package BaseTestFixture;

import Helpers.Helpers;

import WaitForElements.WaitForElements;

import org.testng.annotations.BeforeTest;

import ExcellReader.ExcellReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class BaseTestFixture{

	public static  FirefoxDriver driver;
	public Helpers helpers;
	public WaitForElements WaitForElement;
	public ExcellReader ExcellReader;
	public static final Logger log=Logger.getLogger(BaseTestFixture.class);
	
	
  @BeforeTest
  public void OpenBrowser() throws InterruptedException, IOException {
	  try
	  {
		  
		  
		  log.info("===============================");
		  log.info("Start Test - Market Place Taxes");
		  log.info("===============================");
		  Runtime run = Runtime.getRuntime();
		  run.exec(new String[] { "sh", "-c", "rm -rfv /Users/nenko/Documents/WacomProjectScreenshots/MarketPlaceScreenshots/MarketPlaceErrors/*" });
		  log.info("All Screenshots with errors are deleted.");
		  driver=new FirefoxDriver();
		  log.info("Browser is started");
		  helpers=new Helpers();
		  WaitForElement=new WaitForElements();
		  ExcellReader=new ExcellReader("/Users/nenko/Documents/WacomTestingProjects/MarketPlace/ExcellData/exmapleAddressUSA1-1.xlsx");	  
		  
		  
		  
		  
		  driver.get("https://testwacomus.appdirect.com/home");
		  log.info("Go to MarketPlace");
		  driver.manage().window().maximize();
	  }catch(Exception e)
	  {
		  log.fatal("Before Test Error" + e.getMessage());
		  log.fatal(e.getStackTrace());
	  }
  }

  @AfterTest
  public void CloseBrowser() {
	  driver.quit();
  }

}
