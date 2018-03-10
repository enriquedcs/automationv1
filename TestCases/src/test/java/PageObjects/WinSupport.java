package PageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Tecgurus.com.TecGurusFramework.BasePage;

public class WinSupport extends BasePage {
	
	public WinSupport()
	{
		super();
	}

	@FindBy(id="l1_support")
	public WebElement WindowsMenuSupport;
	
	@FindBy(id="search-text-hero-fullSize")
	public WebElement WindowsSupportSearch;
	
	public WinSupport ValidaTituloSupport(String ExpectedURL) {
		String DriverTitle = anydriver.getTitle();
		Assert.assertTrue(DriverTitle.contains(ExpectedURL));
		System.out.println("El titulo es correcto"+ DriverTitle);
		return this;
		
	}
	
	public WinSupport DoClickSupport(WebElement element)
	{
		Click(element);
		return this;
	}
	
	public WinSupport AssertElementSupport(WebElement element, String Elemento)
	{
		AssertElement(element, Elemento);
		return this;
	}
	
	public WinSupport SendKeys(WebElement element, String Value)
	{
		EnterKey (element, Value);
		return this;	
	}
	
	public WinSupport SubmitValue(WebElement element)
	{
		SubmitElement (element);
		return this;	
	}
	
}
