package PageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Tecgurus.com.TecGurusFramework.BasePage;
import TestInitializer.TestContext;

public class winHomePage extends BasePage {

	public winHomePage()
	{
		super();
	}
	
	@FindBy(id="shelmenu_1")
	public WebElement WindowsMenu;
	
	public winHomePage ValidaTitulo(String ExpectedURL) {
		String DriverTitle = anydriver.getTitle();
		Assert.assertTrue(DriverTitle.contains(ExpectedURL));
		System.out.println("El titulo es correcto"+ DriverTitle);
		return this;
		
	}
	
	public winHomePage DoClick(WebElement element)
	{
		Click(element);
		return this;
	}
	
	public winHomePage AssertElement(WebElement element)
	
	{
		AssertElement(element, null);
		return this;
	}
	
	public winHomePage GoTo()
	{
		GoTo(TestContext.GetURL());
		return this;
	}
	
}
