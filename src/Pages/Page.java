package Pages;

import org.openqa.selenium.support.PageFactory;

import Helpers.Helpers;

public class Page {

	public static MarketPlaceHomePageBeforeLogin MarketPlaceHomePageBeforeLogin()
	{
		MarketPlaceHomePageBeforeLogin MarketPlaceHomePageBeforeLogin =new MarketPlaceHomePageBeforeLogin();
		PageFactory.initElements(Helpers.driver, MarketPlaceHomePageBeforeLogin);
		return MarketPlaceHomePageBeforeLogin;
	}
	
	public static FeaturedApplications FeaturedApplications()
	{
		FeaturedApplications FeaturedApplications =new FeaturedApplications();
		PageFactory.initElements(Helpers.driver, FeaturedApplications);
		return FeaturedApplications;
	}
	
	public static AllApplications AllApplications()
	{
		AllApplications AllApplications =new AllApplications();
		PageFactory.initElements(Helpers.driver, AllApplications);
		return AllApplications;
	}
	
	public static WacomInkspaceApp WacomInkspaceApp()
	{
		WacomInkspaceApp WacomInkspaceApp =new WacomInkspaceApp();
		PageFactory.initElements(Helpers.driver, WacomInkspaceApp);
		return WacomInkspaceApp;
	}
	
	public static BambooPaper BambooPaper()
	{
		BambooPaper BambooPaper =new BambooPaper();
		PageFactory.initElements(Helpers.driver, BambooPaper);
		return BambooPaper;
	}
	
	public static SignProPDF SignProPDF()
	{
		SignProPDF SignProPDF =new SignProPDF();
		PageFactory.initElements(Helpers.driver, SignProPDF);
		return SignProPDF;
	}
	
	public static FAQ FAQ()
	{
		FAQ FAQ =new FAQ();
		PageFactory.initElements(Helpers.driver, FAQ);
		return FAQ;
	}
	
	public static HomePage HomePage()
	{
		HomePage HomePage =new HomePage();
		PageFactory.initElements(Helpers.driver, HomePage);
		return HomePage;
	}
	
	public static MarketPlaceHomePageAfterLogin MarketPlaceHomePageAfterLogin()
	{
		MarketPlaceHomePageAfterLogin MarketPlaceHomePageAfterLogin =new MarketPlaceHomePageAfterLogin();
		PageFactory.initElements(Helpers.driver, MarketPlaceHomePageAfterLogin);
		return MarketPlaceHomePageAfterLogin;
	}
}
