package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage


{
	//step-1-declaration
	
	@FindBy(xpath="//div[@class='app_logo']")private  WebElement logo;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement menu;
	
	//step-2 initialization
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step-3 variable usage
	
	public void verifylogo()
	{
		boolean result = logo.isDisplayed();
		
		if(result==true)
		{
			System.out.println("logo found-->test case pass");
		}
		else
		{
			System.out.println("logo not found-->test case fail");
		}
		
	}
	public void clickonmenu()
	{
		menu.click();
	}
	

}
