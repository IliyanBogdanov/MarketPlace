package MarketPlaceLocalizationTests;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClassFixture.BaseClass;
import Pages.Page;

public class MarketPlaceLocalizationTests extends BaseClass {
	
@Test
  public void tabs() throws IOException, InterruptedException {
	  
	  Page.MarketPlaceHomePageBeforeLogin().createScreenshotOnHomePage();
	  Page.MarketPlaceHomePageBeforeLogin().createScreenshotOnDiscoverTab();
	  Page.MarketPlaceHomePageBeforeLogin().createScreenshotOnProductsTab();
	  Page.MarketPlaceHomePageBeforeLogin().createScreenshotOnEnterpriseTab();
 
  }
  @Test
  public void FAQ() throws IOException, InterruptedException {
	  
	  Page.FAQ().createScreenshotOnFAQ();
	 
}
  
 @Test
  public void inkspace() throws IOException, InterruptedException {
  
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppOverview();
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppFeaturesAccessShare();
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppFeaturesDoMoreWithYourNotes();
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppFeaturesWorkTogether();
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppFeaturesRefineYourPaperSketchesDigitally();
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppFeaturesSystemRequirements();
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppPoliciesAndSupport();
	  Page.FeaturedApplications().createAscreenshotofTheInkspaceAppEditionsAndPricings();
	  
  }
  
 @Test
  public void allApps() throws IOException, InterruptedException {
  
	  Page.AllApplications().createAscreenshotOfAllApplications();
	  Page.AllApplications().checkTheCompareCheckboxes();
	  Page.AllApplications().createAscreenshotOfAllComparedApplications();
	  
  }
  
 @Test
   public void wacomInkspaceApp() throws IOException, InterruptedException {
  
	  Page.WacomInkspaceApp().createAscreenshotOfWacomInkspaceAppOverview();
	  Page.WacomInkspaceApp().createAscreenshotOfWacomInkspaceAppFeaturesFromPaperToDigitalInk();
	  Page.WacomInkspaceApp().createAscreenshotOfWacomInkspaceAppFeaturesMakeYourSmartpadEvenMorePowerful();
	  Page.WacomInkspaceApp().createAscreenshotOfWacomInkspaceAppFeaturesManageYourNotes();
	  Page.WacomInkspaceApp().createAscreenshotOfWacomInkspaceAppFeaturesInkToText();
	  Page.WacomInkspaceApp().createAscreenshotOfWacomInkspaceAppEditionsAndPricing();
  }
  
  @Test
   public void bambooPaper() throws IOException, InterruptedException {
  
	  Page.BambooPaper().createAscreenshotOfBambooPaperOverview();
	  Page.BambooPaper().createAscreenshotOfBambooPaperFeaturesToolsAndPreciseInking();
	  Page.BambooPaper().createAscreenshotOfBambooPaperFeaturesAnnotateAndAddDetail();
	  Page.BambooPaper().createAscreenshotOfBambooPaperFeaturesInkspaceNeverLoseAGoodIdea();
	  Page.BambooPaper().createAscreenshotOfBambooPaperFeaturesCaptureYourIdeasWithAWacomStylus();
	  Page.BambooPaper().createAscreenshotOfBambooPaperPoliciesAndSupport();
	  Page.BambooPaper().createAscreenshotOfBambooPaperResources();
	  Page.BambooPaper().createAscreenshotOfBambooPaperEditionsAndPricing();
  }
  
  @Test	
   public void signProPDF() throws IOException, InterruptedException {
  
	  Page.SignProPDF().createAscreenshotOfSignProPDFOverview();
	  Page.SignProPDF().createAscreenshotOfSignProPDFFeaturesHandwritteneSignature();
	  Page.SignProPDF().createAscreenshotOfSignProPDFFeaturesPDFCreation();
	  Page.SignProPDF().createAscreenshotOfSignProPDFEditionsAndPricing();
  }
   
    @Test	
   public void userIsLoggedIn() throws IOException, InterruptedException {
 
	  Page.MarketPlaceHomePageAfterLogin().userLogsIn();
	  Page.MarketPlaceHomePageAfterLogin().changeLanguage();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnHomePageAfterLogin();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnManageAccountDashboard();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnApplications();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnUsersManageUsers();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnUsersManageGroups();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnUsersManageRoles();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnAssignApps();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnBillingManageInvoices();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnBillingPayments();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnBillingBillingInfo();
	  Page.MarketPlaceHomePageAfterLogin().createScreenshotOnCompanySettings();
	  
   } 
  
}
