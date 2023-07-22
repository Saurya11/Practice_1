package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage_1 
{
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[1]") private WebElement cart;
	
	@FindBy(xpath="//button[text()='Remove']") private WebElement remove;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
	
	public SwagLabHomePage_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySwagLabHomePagelogo()
	{
		boolean result = logo.isDisplayed();
		if(result==true)
		{
			System.out.println("logo present-->test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
	}
	public void clickSwagLabHomePagecart()
	{
		cart.click();
	}
	
	public void getSwagLabHomePageremove()
	{
		String text = remove.getText();
		
		System.out.println(text);
	}
	
	public void clickSwagLabHomePagemain()
	{
		menu.click();
	}
	

}
