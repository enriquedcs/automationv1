package Tecgurus.com.TecGurusFramework;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseBrowser {
	
	private WebDriver anydriver;
	
	public WebDriver DriverSetup() 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\enriqued\\workspace\\seleniumpractice\\chromedriver.exe");
		anydriver = new ChromeDriver();
		anydriver.manage().window().maximize();
		return anydriver;
		
	}	
	
	public void  GoTo (String URL) {
		String URL1 = null;
		//WebDriver driver = null;
		anydriver.get(URL1);
		
		
	}
	
	public void EnterKey (WebElement element, String Value)
	{
		element.sendKeys(Value);
	}
	
	public void SubmitElement (WebElement element)
	{
		element.submit();
	}
	
	public void Click (WebElement element)
	{
		element.click();
	}
	
	
	public void AssertElement (WebElement element, String Elemento)
	{
		System.out.println(Elemento);
		boolean isDisplayed = false;
		int counter = 0;
		while (!isDisplayed && counter < 10)
		{
			try
			{
				isDisplayed = element.isDisplayed();
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Element not found ... searching");
			}
		}
		counter ++;
	}
	

	}


