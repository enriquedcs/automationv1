package Tecgurus.com.TecGurusFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseBrowser{

	public WebDriver anydriver;
	public BasePage()
	{
		InitBrowser();
		PageFactory.initElements(anydriver, this);
		
	}
	private void InitBrowser() {
		// TODO Auto-generated method stub
		anydriver = DriverSetup();
	}
}
